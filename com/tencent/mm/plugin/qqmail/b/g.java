package com.tencent.mm.plugin.qqmail.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public final class g
  extends h
{
  private HttpClient oFb;
  private HttpRequestBase oFc;
  private HttpResponse oFd;
  private boolean oFe;
  private int result;
  
  public g()
  {
    GMTrace.i(5463332618240L, 40705);
    this.oFb = null;
    this.oFc = null;
    this.oFd = null;
    this.result = 0;
    this.oFe = false;
    GMTrace.o(5463332618240L, 40705);
  }
  
  private static void a(h.b paramb, HttpRequestBase paramHttpRequestBase)
  {
    GMTrace.i(5463735271424L, 40708);
    if (paramb.oFh == null)
    {
      GMTrace.o(5463735271424L, 40708);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramb.oFh.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new BasicNameValuePair(str, (String)paramb.oFh.get(str)));
    }
    ((HttpPost)paramHttpRequestBase).setEntity(new UrlEncodedFormEntity(localArrayList, "utf-8"));
    GMTrace.o(5463735271424L, 40708);
  }
  
  public final h.c a(String paramString1, String paramString2, h.b paramb, h.a parama)
  {
    GMTrace.i(5463466835968L, 40706);
    w.d("MicroMsg.URLConnectionUtil", "uri=" + paramString2 + ", " + paramb);
    for (;;)
    {
      Object localObject2;
      try
      {
        this.oFe = false;
        this.oFb = new DefaultHttpClient();
        if (paramb.oFg != 0) {
          continue;
        }
        if (paramb.oFg != 0) {
          continue;
        }
        localObject1 = paramb.oFh;
        this.oFc = new HttpGet(c(paramString1, paramString2, (Map)localObject1));
        this.oFc.addHeader("User-Agent", mbI);
        this.oFc.addHeader("Host", host);
        System.setProperty("http.keepAlive", "false");
        this.oFc.addHeader("Accept-Charset", "utf-8");
        this.oFc.addHeader("Accept-Encoding", "compress;q=0.5, gzip;q=1.0");
        this.oFc.addHeader("Content-Type", "text/html");
        this.oFc.addHeader("Cookie", G(paramb.oFi));
        if (paramb.oFg == 1) {
          a(paramb, this.oFc);
        }
        this.oFd = this.oFb.execute(this.oFc);
        this.result = this.oFd.getStatusLine().getStatusCode();
        localObject1 = null;
        localObject2 = null;
        localHttpEntity = null;
        if (this.oFd.getFirstHeader("set-cookie") == null) {
          break label1316;
        }
        paramString1 = this.oFd.getFirstHeader("set-cookie").getValue();
        if (this.oFd.getFirstHeader("Content-Encoding") != null) {
          localObject1 = this.oFd.getFirstHeader("Content-Encoding").getValue();
        }
        if (this.oFd.getFirstHeader("Content-Disposition") != null) {
          localObject2 = this.oFd.getFirstHeader("Content-Disposition").getValue();
        }
        if ((localObject2 == null) || (!((String)localObject2).contains("attachment;")) || (!paramString2.contains("download"))) {
          continue;
        }
        i = 1;
      }
      catch (UnsupportedEncodingException paramString1)
      {
        paramString1 = new h.c(55535, null, "unsupported ecoding");
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        localObject1 = null;
        continue;
        i = 0;
        continue;
        localHttpEntity = this.oFd.getEntity();
        localHttpEntity.getContentLength();
        localObject2 = localHttpEntity.getContent();
        if ((localObject1 == null) || (!((String)localObject1).contains("gzip"))) {
          break label1309;
        }
        localObject1 = new GZIPInputStream((InputStream)localObject2);
        if (i == 0) {
          continue;
        }
        localObject2 = oFf;
        StringBuilder localStringBuilder = new StringBuilder();
        if (paramb.oFh.get("default_attach_name") != null) {
          continue;
        }
        paramb = Long.valueOf(System.currentTimeMillis());
        paramb = new FileOutputStream(new File((String)localObject2, paramb), true);
        localObject2 = new byte['Ѐ'];
        if (this.oFe) {
          continue;
        }
        j = ((InputStream)localObject1).read((byte[])localObject2);
        if (j <= 0) {
          continue;
        }
        paramb.write((byte[])localObject2, 0, j);
        paramb.flush();
        parama.aWP();
        continue;
      }
      catch (UnknownHostException paramString1)
      {
        paramString1 = new h.c(55531, null, "unknow host");
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        paramb = (Serializable)paramb.oFh.get("default_attach_name");
        continue;
        paramb = new ByteArrayOutputStream();
        continue;
      }
      catch (ClientProtocolException paramString1)
      {
        HttpEntity localHttpEntity;
        paramString1 = new h.c(55534, null, "client protocol error");
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        if (!this.oFe) {
          continue;
        }
        paramb.flush();
        paramb.close();
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return null;
        int j = this.result;
        parama = Eg(paramString1);
        if (i == 0) {
          continue;
        }
        paramString1 = "";
        paramString1 = new h.c(j, parama, paramString1);
        paramb.flush();
        paramb.close();
        localHttpEntity.consumeContent();
        w.d("MicroMsg.URLConnectionUtil", "uri=" + paramString2 + ", " + paramString1);
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        paramString1 = new String(((ByteArrayOutputStream)paramb).toByteArray());
        continue;
      }
      catch (IllegalStateException paramString1)
      {
        paramString1 = new h.c(55533, null, "illegal state");
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
      }
      catch (FileNotFoundException paramString1)
      {
        paramString1 = new h.c(55532, null, "output file not found");
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
      }
      catch (Exception paramString1)
      {
        w.printErrStackTrace("MicroMsg.URLConnectionUtil", paramString1, "http unavailable", new Object[0]);
        if (this.result != 0) {
          continue;
        }
        i = 503;
        paramString1 = new h.c(i, null, null);
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        i = this.result;
        continue;
      }
      catch (OutOfMemoryError paramString1)
      {
        w.printErrStackTrace("MicroMsg.URLConnectionUtil", paramString1, "http unavailable", new Object[0]);
        if (this.result != 0) {
          continue;
        }
        int i = 503;
        paramString1 = new h.c(i, null, null);
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
        GMTrace.o(5463466835968L, 40706);
        return paramString1;
        i = this.result;
        continue;
      }
      finally
      {
        if (this.oFb == null) {
          continue;
        }
        this.oFb.getConnectionManager().shutdown();
      }
      if (i == 0)
      {
        localObject2 = localHttpEntity;
        if (this.oFd.getFirstHeader("Content-Length") != null) {
          localObject2 = this.oFd.getFirstHeader("Content-Length").getValue();
        }
        if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (bg.getInt((String)localObject2, 0) > 5242880L))
        {
          paramString1 = new h.c(55536, null, "mail content to large");
          if (this.oFb != null) {
            this.oFb.getConnectionManager().shutdown();
          }
          GMTrace.o(5463466835968L, 40706);
          return paramString1;
          localObject1 = null;
          continue;
          if (paramb.oFg == 0)
          {
            localObject1 = paramb.oFh;
            this.oFc = new HttpPost(c(paramString1, paramString2, (Map)localObject1));
            continue;
          }
        }
      }
      label1309:
      Object localObject1 = localObject2;
      continue;
      label1316:
      paramString1 = null;
    }
  }
  
  public final void cancel()
  {
    GMTrace.i(5463601053696L, 40707);
    w.d("MicroMsg.URLConnectionUtil", "cancel conection.");
    this.oFe = true;
    if ((this.oFc != null) && (!this.oFc.isAborted())) {
      this.oFc.abort();
    }
    if (this.oFb != null) {
      this.oFb.getConnectionManager().shutdown();
    }
    GMTrace.o(5463601053696L, 40707);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */