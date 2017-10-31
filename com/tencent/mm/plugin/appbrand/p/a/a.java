package com.tencent.mm.plugin.appbrand.p.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.e.f;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

public abstract class a
  extends com.tencent.mm.plugin.appbrand.p.b
  implements com.tencent.mm.plugin.appbrand.p.a, Runnable
{
  private CountDownLatch jxA;
  private CountDownLatch jxB;
  private int jxC;
  private com.tencent.mm.plugin.appbrand.p.b.a jxj;
  protected URI jxs;
  public c jxt;
  private Socket jxu;
  private InputStream jxv;
  public OutputStream jxw;
  private Proxy jxx;
  public Runnable jxy;
  private Map<String, String> jxz;
  
  public a(URI paramURI, com.tencent.mm.plugin.appbrand.p.b.a parama, Map<String, String> paramMap, int paramInt)
  {
    GMTrace.i(10180012015616L, 75847);
    this.jxs = null;
    this.jxt = null;
    this.jxu = null;
    this.jxx = Proxy.NO_PROXY;
    this.jxA = new CountDownLatch(1);
    this.jxB = new CountDownLatch(1);
    this.jxC = 0;
    if (paramURI == null) {
      throw new IllegalArgumentException();
    }
    if (parama == null) {
      throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }
    this.jxs = paramURI;
    this.jxj = parama;
    this.jxz = paramMap;
    this.jxC = paramInt;
    this.jxt = new c(this, parama);
    GMTrace.o(10180012015616L, 75847);
  }
  
  private void abh()
  {
    GMTrace.i(10180683104256L, 75852);
    Object localObject2 = this.jxs.getPath();
    Object localObject3 = this.jxs.getQuery();
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      localObject1 = "/";
    }
    localObject2 = localObject1;
    if (localObject3 != null) {
      localObject2 = (String)localObject1 + "?" + (String)localObject3;
    }
    int i = getPort();
    localObject3 = new StringBuilder().append(this.jxs.getHost());
    if (i != 80) {}
    for (Object localObject1 = ":" + i;; localObject1 = "")
    {
      localObject3 = (String)localObject1;
      localObject1 = new com.tencent.mm.plugin.appbrand.p.e.d();
      ((com.tencent.mm.plugin.appbrand.p.e.d)localObject1).si((String)localObject2);
      ((com.tencent.mm.plugin.appbrand.p.e.d)localObject1).put("Host", (String)localObject3);
      if (this.jxz == null) {
        break;
      }
      localObject2 = this.jxz.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        ((com.tencent.mm.plugin.appbrand.p.e.d)localObject1).put((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
      }
    }
    localObject2 = this.jxt;
    ((c)localObject2).jxn = ((c)localObject2).jxj.a((com.tencent.mm.plugin.appbrand.p.e.b)localObject1);
    ((c)localObject2).jxr = ((com.tencent.mm.plugin.appbrand.p.e.b)localObject1).abp();
    if (((c)localObject2).jxr != null)
    {
      localObject1 = ((c)localObject2).jxj;
      localObject1 = ((c)localObject2).jxn;
      i = ((c)localObject2).jxk;
      ((c)localObject2).V(com.tencent.mm.plugin.appbrand.p.b.a.b((f)localObject1));
    }
    GMTrace.o(10180683104256L, 75852);
  }
  
  private int getPort()
  {
    GMTrace.i(10180548886528L, 75851);
    int i = this.jxs.getPort();
    if (i == -1)
    {
      String str = this.jxs.getScheme();
      if (str.equals("wss"))
      {
        GMTrace.o(10180548886528L, 75851);
        return 443;
      }
      if (str.equals("ws"))
      {
        GMTrace.o(10180548886528L, 75851);
        return 80;
      }
      throw new RuntimeException("unkonow scheme" + str);
    }
    GMTrace.o(10180548886528L, 75851);
    return i;
  }
  
  public abstract void A(int paramInt, String paramString);
  
  public final void D(int paramInt, String paramString)
  {
    GMTrace.i(10181354192896L, 75857);
    this.jxA.countDown();
    this.jxB.countDown();
    if (this.jxy != null) {
      e.N(this.jxy);
    }
    try
    {
      if (this.jxu != null) {
        this.jxu.close();
      }
      A(paramInt, paramString);
      GMTrace.o(10181354192896L, 75857);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        a(localIOException);
      }
    }
  }
  
  public abstract void YD();
  
  public void a(com.tencent.mm.plugin.appbrand.p.d.d paramd)
  {
    GMTrace.i(10182427934720L, 75865);
    GMTrace.o(10182427934720L, 75865);
  }
  
  public abstract void a(Exception paramException);
  
  public final void a(Socket paramSocket)
  {
    GMTrace.i(10182562152448L, 75866);
    if (this.jxu != null)
    {
      w.i("MicroMsg.AppBrandNetWork.WebSocketClient", "socket has already been set");
      GMTrace.o(10182562152448L, 75866);
      return;
    }
    this.jxu = paramSocket;
    GMTrace.o(10182562152448L, 75866);
  }
  
  public final InetSocketAddress abc()
  {
    GMTrace.i(10182830587904L, 75868);
    InetSocketAddress localInetSocketAddress = this.jxt.abc();
    GMTrace.o(10182830587904L, 75868);
    return localInetSocketAddress;
  }
  
  public final void abf()
  {
    GMTrace.i(10181219975168L, 75856);
    this.jxA.countDown();
    YD();
    GMTrace.o(10181219975168L, 75856);
  }
  
  public final InetSocketAddress abg()
  {
    GMTrace.i(10181622628352L, 75859);
    if (this.jxu != null)
    {
      InetSocketAddress localInetSocketAddress = (InetSocketAddress)this.jxu.getLocalSocketAddress();
      GMTrace.o(10181622628352L, 75859);
      return localInetSocketAddress;
    }
    GMTrace.o(10181622628352L, 75859);
    return null;
  }
  
  public final void b(com.tencent.mm.plugin.appbrand.p.d.d paramd)
  {
    GMTrace.i(10182696370176L, 75867);
    this.jxt.b(paramd);
    GMTrace.o(10182696370176L, 75867);
  }
  
  public void b(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10182293716992L, 75864);
    GMTrace.o(10182293716992L, 75864);
  }
  
  public final void c(com.tencent.mm.plugin.appbrand.p.d.d paramd)
  {
    GMTrace.i(10181085757440L, 75855);
    a(paramd);
    GMTrace.o(10181085757440L, 75855);
  }
  
  public final void c(Exception paramException)
  {
    GMTrace.i(15446178791424L, 115083);
    a(paramException);
    GMTrace.o(15446178791424L, 115083);
  }
  
  public final void close()
  {
    GMTrace.i(10180280451072L, 75849);
    if (this.jxy != null) {
      this.jxt.c(1000, "", false);
    }
    GMTrace.o(10180280451072L, 75849);
  }
  
  public final void connect()
  {
    GMTrace.i(10180146233344L, 75848);
    if (this.jxy != null)
    {
      w.i("MicroMsg.AppBrandNetWork.WebSocketClient", "WebSocketClient objects are not reuseable");
      GMTrace.o(10180146233344L, 75848);
      return;
    }
    this.jxy = this;
    e.post(this.jxy, "WebsocketWriteThread");
    GMTrace.o(10180146233344L, 75848);
  }
  
  public final void g(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10180951539712L, 75854);
    b(paramByteBuffer);
    GMTrace.o(10180951539712L, 75854);
  }
  
  public abstract void rh(String paramString);
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: ldc2_w 351
    //   3: ldc_w 353
    //   6: invokestatic 49	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 55	com/tencent/mm/plugin/appbrand/p/a/a:jxu	Ljava/net/Socket;
    //   13: ifnonnull +178 -> 191
    //   16: aload_0
    //   17: new 256	java/net/Socket
    //   20: dup
    //   21: aload_0
    //   22: getfield 62	com/tencent/mm/plugin/appbrand/p/a/a:jxx	Ljava/net/Proxy;
    //   25: invokespecial 356	java/net/Socket:<init>	(Ljava/net/Proxy;)V
    //   28: putfield 55	com/tencent/mm/plugin/appbrand/p/a/a:jxu	Ljava/net/Socket;
    //   31: aload_0
    //   32: getfield 55	com/tencent/mm/plugin/appbrand/p/a/a:jxu	Ljava/net/Socket;
    //   35: invokevirtual 359	java/net/Socket:isBound	()Z
    //   38: ifne +32 -> 70
    //   41: aload_0
    //   42: getfield 55	com/tencent/mm/plugin/appbrand/p/a/a:jxu	Ljava/net/Socket;
    //   45: new 304	java/net/InetSocketAddress
    //   48: dup
    //   49: aload_0
    //   50: getfield 51	com/tencent/mm/plugin/appbrand/p/a/a:jxs	Ljava/net/URI;
    //   53: invokevirtual 135	java/net/URI:getHost	()Ljava/lang/String;
    //   56: aload_0
    //   57: invokespecial 132	com/tencent/mm/plugin/appbrand/p/a/a:getPort	()I
    //   60: invokespecial 362	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   63: aload_0
    //   64: getfield 73	com/tencent/mm/plugin/appbrand/p/a/a:jxC	I
    //   67: invokevirtual 365	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   70: aload_0
    //   71: aload_0
    //   72: getfield 55	com/tencent/mm/plugin/appbrand/p/a/a:jxu	Ljava/net/Socket;
    //   75: invokevirtual 369	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   78: putfield 371	com/tencent/mm/plugin/appbrand/p/a/a:jxv	Ljava/io/InputStream;
    //   81: aload_0
    //   82: aload_0
    //   83: getfield 55	com/tencent/mm/plugin/appbrand/p/a/a:jxu	Ljava/net/Socket;
    //   86: invokevirtual 375	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   89: putfield 377	com/tencent/mm/plugin/appbrand/p/a/a:jxw	Ljava/io/OutputStream;
    //   92: aload_0
    //   93: invokespecial 379	com/tencent/mm/plugin/appbrand/p/a/a:abh	()V
    //   96: aload_0
    //   97: new 10	com/tencent/mm/plugin/appbrand/p/a/a$a
    //   100: dup
    //   101: aload_0
    //   102: invokespecial 382	com/tencent/mm/plugin/appbrand/p/a/a$a:<init>	(Lcom/tencent/mm/plugin/appbrand/p/a/a;)V
    //   105: putfield 248	com/tencent/mm/plugin/appbrand/p/a/a:jxy	Ljava/lang/Runnable;
    //   108: aload_0
    //   109: getfield 248	com/tencent/mm/plugin/appbrand/p/a/a:jxy	Ljava/lang/Runnable;
    //   112: ldc_w 336
    //   115: invokestatic 340	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   118: getstatic 385	com/tencent/mm/plugin/appbrand/p/c:jwZ	I
    //   121: newarray <illegal type>
    //   123: astore_2
    //   124: aload_0
    //   125: getfield 53	com/tencent/mm/plugin/appbrand/p/a/a:jxt	Lcom/tencent/mm/plugin/appbrand/p/c;
    //   128: getfield 388	com/tencent/mm/plugin/appbrand/p/c:jxg	I
    //   131: getstatic 393	com/tencent/mm/plugin/appbrand/p/a$a:jwU	I
    //   134: if_icmpne +99 -> 233
    //   137: iconst_1
    //   138: istore_1
    //   139: iload_1
    //   140: ifne +98 -> 238
    //   143: aload_0
    //   144: getfield 371	com/tencent/mm/plugin/appbrand/p/a/a:jxv	Ljava/io/InputStream;
    //   147: aload_2
    //   148: invokevirtual 399	java/io/InputStream:read	([B)I
    //   151: istore_1
    //   152: iload_1
    //   153: iconst_m1
    //   154: if_icmpeq +84 -> 238
    //   157: aload_0
    //   158: getfield 53	com/tencent/mm/plugin/appbrand/p/a/a:jxt	Lcom/tencent/mm/plugin/appbrand/p/c;
    //   161: aload_2
    //   162: iconst_0
    //   163: iload_1
    //   164: invokestatic 405	java/nio/ByteBuffer:wrap	([BII)Ljava/nio/ByteBuffer;
    //   167: invokevirtual 407	com/tencent/mm/plugin/appbrand/p/c:c	(Ljava/nio/ByteBuffer;)V
    //   170: goto -46 -> 124
    //   173: astore_2
    //   174: aload_0
    //   175: getfield 53	com/tencent/mm/plugin/appbrand/p/a/a:jxt	Lcom/tencent/mm/plugin/appbrand/p/c;
    //   178: invokevirtual 410	com/tencent/mm/plugin/appbrand/p/c:abe	()V
    //   181: ldc2_w 351
    //   184: ldc_w 353
    //   187: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   190: return
    //   191: aload_0
    //   192: getfield 55	com/tencent/mm/plugin/appbrand/p/a/a:jxu	Ljava/net/Socket;
    //   195: invokevirtual 413	java/net/Socket:isClosed	()Z
    //   198: ifeq -167 -> 31
    //   201: new 240	java/io/IOException
    //   204: dup
    //   205: invokespecial 414	java/io/IOException:<init>	()V
    //   208: athrow
    //   209: astore_2
    //   210: aload_0
    //   211: getfield 53	com/tencent/mm/plugin/appbrand/p/a/a:jxt	Lcom/tencent/mm/plugin/appbrand/p/c;
    //   214: iconst_m1
    //   215: aload_2
    //   216: invokevirtual 417	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   219: iconst_0
    //   220: invokevirtual 420	com/tencent/mm/plugin/appbrand/p/c:d	(ILjava/lang/String;Z)V
    //   223: ldc2_w 351
    //   226: ldc_w 353
    //   229: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   232: return
    //   233: iconst_0
    //   234: istore_1
    //   235: goto -96 -> 139
    //   238: aload_0
    //   239: getfield 53	com/tencent/mm/plugin/appbrand/p/a/a:jxt	Lcom/tencent/mm/plugin/appbrand/p/c;
    //   242: invokevirtual 410	com/tencent/mm/plugin/appbrand/p/c:abe	()V
    //   245: ldc2_w 351
    //   248: ldc_w 353
    //   251: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   254: return
    //   255: astore_2
    //   256: aload_0
    //   257: aload_2
    //   258: invokevirtual 264	com/tencent/mm/plugin/appbrand/p/a/a:a	(Ljava/lang/Exception;)V
    //   261: aload_0
    //   262: getfield 53	com/tencent/mm/plugin/appbrand/p/a/a:jxt	Lcom/tencent/mm/plugin/appbrand/p/c;
    //   265: sipush 1006
    //   268: aload_2
    //   269: invokevirtual 421	java/lang/RuntimeException:getMessage	()Ljava/lang/String;
    //   272: iconst_0
    //   273: invokevirtual 420	com/tencent/mm/plugin/appbrand/p/c:d	(ILjava/lang/String;Z)V
    //   276: ldc2_w 351
    //   279: ldc_w 353
    //   282: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   285: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	286	0	this	a
    //   138	97	1	i	int
    //   123	39	2	arrayOfByte	byte[]
    //   173	1	2	localIOException	IOException
    //   209	7	2	localException	Exception
    //   255	14	2	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   124	137	173	java/io/IOException
    //   143	152	173	java/io/IOException
    //   157	170	173	java/io/IOException
    //   238	245	173	java/io/IOException
    //   9	31	209	java/lang/Exception
    //   31	70	209	java/lang/Exception
    //   70	96	209	java/lang/Exception
    //   191	209	209	java/lang/Exception
    //   124	137	255	java/lang/RuntimeException
    //   143	152	255	java/lang/RuntimeException
    //   157	170	255	java/lang/RuntimeException
    //   238	245	255	java/lang/RuntimeException
  }
  
  public final void sg(String paramString)
  {
    GMTrace.i(10180817321984L, 75853);
    rh(paramString);
    GMTrace.o(10180817321984L, 75853);
  }
  
  private final class a
    implements Runnable
  {
    public a()
    {
      GMTrace.i(10179609362432L, 75844);
      GMTrace.o(10179609362432L, 75844);
    }
    
    public final void run()
    {
      GMTrace.i(10179743580160L, 75845);
      try
      {
        while (!Thread.interrupted())
        {
          ByteBuffer localByteBuffer = (ByteBuffer)a.this.jxt.jxd.take();
          a.this.jxw.write(localByteBuffer.array(), 0, localByteBuffer.limit());
          a.this.jxw.flush();
        }
        return;
      }
      catch (IOException localIOException)
      {
        a.this.jxt.abe();
        GMTrace.o(10179743580160L, 75845);
        return;
        GMTrace.o(10179743580160L, 75845);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        GMTrace.o(10179743580160L, 75845);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/p/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */