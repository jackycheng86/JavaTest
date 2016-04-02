/**
 * 
 */
package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Administrator
 *
 */
public class ZipUtil {
	/**  
	     *   
	     * @param inputFileName  
	     *          需要压缩的文件路径  
	     * @param outputFileName  
	     *          输出的文件名  
	     * @throws Exception  
	     */  
	    public static boolean zip(String inputFileName, String outputFileName){   
	        boolean bNodFoundFile=true;   
	        ZipOutputStream out = null;   
	        try {   
	            out = new ZipOutputStream(new FileOutputStream(   
	                    outputFileName));   
	            zip(out, new File(inputFileName), "");   
	            /*注意当压缩文件夹为空时,将抛出异常*/  
	            out.close();   
	        } catch (IOException e) {   
	            bNodFoundFile=false;   
	        }finally{   
	            if(out!=null){   
	                try {   
	                    out.close();   
	                    out=null;   
	                } catch (IOException e) {   
	                }   
	            }   
	        }
	        return bNodFoundFile;   
	    }   
	  
	    private static void zip(ZipOutputStream out, File f, String base){   
	        FileInputStream in =null;   
	        try{   
	            if (f.isDirectory()) {   
	                File[] fl = f.listFiles();   
	                /*此处解决压缩未端数据不正确*/  
	                if (System.getProperty("os.name").startsWith("Windows")) {   
	                    base = base.length() == 0 ? "" : base + "\\";  
	                    out.putNextEntry(new ZipEntry(base));  
	                } else {  
	                    base = base.length() == 0 ? "" : base + "/";   
	                    out.putNextEntry(new ZipEntry(base));   
	                }   
	                int indexSize=fl.length;   
	                for (int i = 0; i < indexSize; i++) {   
	                    zip(out, fl[i], base + fl[i].getName());   
	                }   
	            } else {   
	                out.putNextEntry(new ZipEntry(base));   
	                in = new FileInputStream(f);   
	                int b;   
	                byte[] buffer = new byte[4096];   
	                while ((b = in.read(buffer)) != -1) {   
	                    out.write(buffer,0,b);   
	                }   
	            }   
	        }catch(IOException e){   
	        } finally{   
	            try {   
	                if(in!=null){   
	                    in.close();   
	                    in=null;   
	                }   
	            } catch (IOException e1) {   
	            }   
	        }   
	    }   
	  
	    /**  
	     * 删文件  
	     * @param deleteFilePath  
	     *          删除文件路径  
	     */  
	    public static void  deleteFile(final String deleteFilePath){   
	        File file=new File(deleteFilePath);   
	        deleteFile(file);   
	        file.delete();   
	    }   
	       
	    /**  
	     * 实施删除文件  
	     * @param file  
	     */  
	    private static void deleteFile(File file){   
	        if(file.isDirectory()){   
	            File[] fl = file.listFiles();   
	            int indexSize=fl.length;   
	            for(int i=0; i<indexSize; i++){   
	                deleteFile(fl[i]);   
	            }   
	            /*此处删除目录*/  
	            file.delete();   
	        }else{   
	            /*此处删除文件*/  
	            file.delete();   
	        }   
	    }
	    
	    /** *//**创建文件夹  
	        * @param path  目录  
	        */  
	    public static void createDir(String path){   
	        File dir=new File(path);   
	        if(!dir.exists())   
	            dir.mkdir();   
	    } 
	    
	    public static void main(String[] args){
	    	String zipFileName = "e:\\test.zip"; //打包后文件名字 
	    	String output="e:\\codeTable";
	        System.out.println(zipFileName);
	        //zip(output, zipFileName);
	        deleteFile("e:\\test.zip");
	    }
}
