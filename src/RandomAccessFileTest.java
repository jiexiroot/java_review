import java.io.*;

/**
 * @author GOU
 * @Date 2021-10-07 11:07
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        File file = new File("src/resources/doc.txt");
        // 获取文件长度  分块读取文件 整个文件的大小
        long length = file.length();
        // 规定块的大小
        int blockSize  = 1024 ;
        // 文件可以被切分成多少块 ceil 向上取整 5169/1024 = 5.07 ceil=> 6
        int size = (int)Math.ceil(length*1.0/blockSize);
        System.out.printf("要被切成《%d》个块\n",size);

        int beginPos = 0;
        int actualSize = (int) (blockSize>length?length:blockSize);
        for (int i = 0; i < size; i++) {
            // 每次读取块的时候 起始下标偏移量
            beginPos = i * blockSize;
            if (i == size-1){
                actualSize = (int) length;
            }else {
                actualSize = blockSize;
                length -=actualSize;
            }
            System.out.println(i+"-----》起始位置是"+ beginPos + "------》读取的大小是："+ actualSize);
            readSplit(i,beginPos,actualSize);
        }
    }
    public static void readSplit(int i,int beginPos,int actualSize){
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile =new RandomAccessFile(new File("src/resources/doc.txt"),"r");
            // 表示从哪个偏移量开始读取数据 byte[] 缓存数组
            randomAccessFile.seek(beginPos);
            byte[] bytes  = new byte[1024];
            int length = 0 ;
            while ((length = randomAccessFile.read(bytes))!=-1){
                if (actualSize>length){
                    fileWriter = new FileWriter(new File("src/resources/split/"+ i +".txt"));
                    bufferedWriter = new BufferedWriter(fileWriter);
                    String s = new String(bytes,0,length);
                    bufferedWriter.write(s);
                    System.out.println(s);
                    actualSize -= length;
                }else {
                    fileWriter = new FileWriter(new File("src/resources/split/"+ i +".txt"));
                    bufferedWriter = new BufferedWriter(fileWriter);
                    String s = new String(bytes,0,actualSize);
                    bufferedWriter.write(s);
                    System.out.println(s);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
