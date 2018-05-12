package in.soundararajan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by DakshinS on 5/12/2018.
 */
public class NPPESWebFileReader {

    String fileName;
    public NPPESWebFileReader()
    {
    }

    public void download() throws Exception
    {
        URL url = new URL("http://blah.com/download.zip");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        InputStream in = connection.getInputStream();
        FileOutputStream out = new FileOutputStream("download.zip");
        copy(in, out, 1024);
        out.close();
    }


  public static void copy(InputStream input, OutputStream output, int bufferSize) throws IOException
  {
    byte[] buf = new byte[bufferSize];
    int n = input.read(buf);
    while (n >= 0) {
      output.write(buf, 0, n);
      n = input.read(buf);
    }
    output.flush();
  }

    public String getFileName()
    {
        return fileName;
    }
}
