package com.tencent.pb.common.b;

import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.pb.common.b.a.a.s;
import com.tencent.pb.common.b.a.a.t;
import com.tencent.pb.common.c.d;
import com.tencent.pb.common.c.g;
import com.tencent.wecall.talkroom.model.h;
import java.util.Iterator;
import java.util.LinkedList;

public class f
{
  private static f xnq = null;
  private int xnr = 0;
  private LinkedList<a> xns = null;
  public com.tencent.pb.talkroom.sdk.e xnt = null;
  private boolean xnu = false;
  private boolean xnv = true;
  
  private int a(a arg1, c paramc, String paramString, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = cjB();
    Object localObject;
    for (;;)
    {
      try
      {
        if ((paramArrayOfByte.length >= 200) && (paramArrayOfByte != null) && (paramArrayOfByte.length >= paramArrayOfByte.length)) {}
        localObject = new a.s();
        ((a.s)localObject).nN = paramInt1;
        ((a.s)localObject).xoY = paramInt3;
        ((a.s)localObject).userName = com.tencent.pb.b.a.a.cjV();
        ((a.s)localObject).xnS = paramInt4;
        if (paramArrayOfByte != null) {
          continue;
        }
        com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "body null" });
        paramArrayOfByte = null;
      }
      catch (Exception paramArrayOfByte)
      {
        a.t localt;
        com.tencent.pb.common.c.c.k("NetError", new Object[] { "newTaskHelper addTask body null" });
        paramArrayOfByte = null;
        continue;
        if (paramArrayOfByte.length <= 61440) {
          continue;
        }
        com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "cmd:" + paramInt1 + "|body too large" });
        return -1;
        localObject = new a();
        ((a)localObject).mTaskId = paramInt3;
        ((a)localObject).xnx = ???;
        ((a)localObject).xny = paramc;
        ((a)localObject).xnw = paramString;
      }
      if (paramArrayOfByte != null) {
        continue;
      }
      com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "cmd:" + paramInt1 + "|body is null" });
      return -1;
      localt = new a.t();
      localt.xpa = ((a.s)localObject);
      localt.body = paramArrayOfByte;
      paramArrayOfByte = com.google.a.a.e.b(localt);
    }
    for (;;)
    {
      synchronized (this.xns)
      {
        this.xns.add(localObject);
        paramInt2 = 1933;
        switch (paramInt1)
        {
        default: 
          paramInt1 = paramInt2;
          com.tencent.pb.common.c.c.d("NETCMD", new Object[] { "CLTSEND|", Integer.valueOf(paramInt3), Integer.valueOf(paramInt1), paramString, com.tencent.pb.b.a.a.cjV() });
          if (this.xnt != null) {
            this.xnt.b(paramInt3, paramInt1, paramArrayOfByte);
          }
          return paramInt3;
        }
      }
      paramInt1 = 1918;
      continue;
      paramInt1 = 1919;
      continue;
      paramInt1 = 1931;
      continue;
      paramInt1 = 1929;
      continue;
      paramInt1 = 1927;
      continue;
      paramInt1 = 1928;
      continue;
      paramInt1 = 1932;
      continue;
      paramInt1 = 1935;
      continue;
      paramInt1 = 1937;
      continue;
      paramInt1 = 1938;
      continue;
      paramInt1 = 1939;
    }
  }
  
  private static a.t bw(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = (a.t)com.google.a.a.e.a(new a.t(), paramArrayOfByte, paramArrayOfByte.length);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "Exception genReadPackageData" + paramArrayOfByte.getMessage() });
    }
    return null;
  }
  
  public static int bx(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "CLTNOT onNotify1 data == null ", Integer.valueOf(0) });
      h.FC(63935);
      if ((!TextUtils.isEmpty(com.tencent.wecall.talkroom.model.a.cnN().mHz)) || (!TextUtils.isEmpty(com.tencent.wecall.talkroom.model.a.cnN().xMg))) {
        com.tencent.wecall.talkroom.model.a.cnN().xMp.N(new String[] { "notify", "datanull" });
      }
      for (;;)
      {
        return -1;
        h.a(com.tencent.wecall.talkroom.model.a.cnN().ndF, com.tencent.wecall.talkroom.model.a.cnN().xMh, new String[] { "notify", "datanull" });
      }
    }
    com.tencent.pb.common.c.c.d("NETCMD", new Object[] { "CLTNOT onNotify data len=", Integer.valueOf(paramArrayOfByte.length) });
    return com.tencent.wecall.talkroom.model.a.cnN().bK(paramArrayOfByte);
  }
  
  private int cjB()
  {
    synchronized (this.xns)
    {
      this.xnr += 1;
      int i = this.xnr;
      return i;
    }
  }
  
  public static f cjC()
  {
    if (xnq == null) {}
    try
    {
      if (xnq == null) {
        xnq = new f();
      }
      return xnq;
    }
    finally {}
  }
  
  public final a Ek(int paramInt)
  {
    for (;;)
    {
      synchronized (this.xns)
      {
        Iterator localIterator = this.xns.iterator();
        if (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          if (locala.mTaskId != paramInt) {
            continue;
          }
          return locala;
        }
      }
      Object localObject2 = null;
    }
  }
  
  final int a(a parama, c paramc, int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2)
  {
    if (!this.xnv)
    {
      com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "doSendTask mIsInitSucc is false" });
      return -1;
    }
    if (this.xnu == true)
    {
      com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "doSendTask fail: isRefreshing, cmd=" + paramInt1 + ", cmdTag=" + paramString });
      return -1;
    }
    try
    {
      paramInt1 = a(parama, paramc, paramString, paramInt1, paramArrayOfByte, 0, 0, paramInt2);
      return paramInt1;
    }
    catch (Throwable parama)
    {
      com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "Exception doSendTask", parama });
    }
    return -1;
  }
  
  public final int a(a parama, String paramString, com.google.a.a.e parame)
  {
    try
    {
      int i = a(parama, null, 31, paramString, com.google.a.a.e.b(parame), 0);
      return i;
    }
    catch (Exception parama)
    {
      com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "doSendTask exception:", parama });
    }
    return -1;
  }
  
  /* Error */
  public final void a(a parama, int paramInt, byte[] arg3)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 136	com/tencent/pb/common/b/f$a:xny	Lcom/tencent/pb/common/b/c;
    //   4: ifnull +14 -> 18
    //   7: aload_1
    //   8: getfield 136	com/tencent/pb/common/b/f$a:xny	Lcom/tencent/pb/common/b/c;
    //   11: iload_2
    //   12: aload_3
    //   13: invokeinterface 272 3 0
    //   18: aload_1
    //   19: getfield 132	com/tencent/pb/common/b/f$a:xnx	Lcom/tencent/pb/common/b/a;
    //   22: ifnull +17 -> 39
    //   25: aload_1
    //   26: getfield 132	com/tencent/pb/common/b/f$a:xnx	Lcom/tencent/pb/common/b/a;
    //   29: aload_1
    //   30: getfield 139	com/tencent/pb/common/b/f$a:xnw	Ljava/lang/String;
    //   33: iload_2
    //   34: invokeinterface 278 3 0
    //   39: aload_0
    //   40: getfield 31	com/tencent/pb/common/b/f:xns	Ljava/util/LinkedList;
    //   43: astore_3
    //   44: aload_3
    //   45: monitorenter
    //   46: aload_0
    //   47: getfield 31	com/tencent/pb/common/b/f:xns	Ljava/util/LinkedList;
    //   50: aload_1
    //   51: invokevirtual 281	java/util/LinkedList:remove	(Ljava/lang/Object;)Z
    //   54: pop
    //   55: aload_3
    //   56: monitorexit
    //   57: return
    //   58: astore_3
    //   59: ldc 71
    //   61: iconst_2
    //   62: anewarray 4	java/lang/Object
    //   65: dup
    //   66: iconst_0
    //   67: ldc_w 283
    //   70: aastore
    //   71: dup
    //   72: iconst_1
    //   73: aload_3
    //   74: invokevirtual 169	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   77: aastore
    //   78: invokestatic 79	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: goto -42 -> 39
    //   84: astore_1
    //   85: aload_3
    //   86: monitorexit
    //   87: aload_1
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	f
    //   0	89	1	parama	a
    //   0	89	2	paramInt	int
    // Exception table:
    //   from	to	target	type
    //   0	18	58	java/lang/Exception
    //   18	39	58	java/lang/Exception
    //   46	57	84	finally
    //   85	87	84	finally
  }
  
  public final int o(int paramInt, byte[] paramArrayOfByte)
  {
    a locala = Ek(paramInt);
    if ((locala == null) && (64536 != paramInt))
    {
      com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "buf2Resp fail: taskId:" + paramInt + " not found" });
      g.z(20007, 3, "-1202");
      return 1;
    }
    paramArrayOfByte = bw(paramArrayOfByte);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.xpa == null))
    {
      if (paramArrayOfByte == null) {}
      for (paramArrayOfByte = " pack is null ";; paramArrayOfByte = " head is " + paramArrayOfByte.xpa)
      {
        com.tencent.pb.common.c.c.k("NETCMD", new Object[] { " pack.head: ", paramArrayOfByte });
        a(locala, -3, null);
        return -1;
      }
    }
    int i = paramArrayOfByte.xpa.ret;
    int j = paramArrayOfByte.xpa.xoZ;
    String str = paramArrayOfByte.xpa.userName;
    if (com.tencent.pb.common.a.a.xmG) {
      Toast.makeText(d.rwf, "retCode: " + i + " debugCode: " + j, 0).show();
    }
    if ((i != 0) && (locala != null)) {
      com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "CLTRCV", Integer.valueOf(paramInt), locala.xnw, Integer.valueOf(i), str, Integer.valueOf(j) });
    }
    for (;;)
    {
      paramArrayOfByte = paramArrayOfByte.body;
      if (paramArrayOfByte == null) {
        break;
      }
      a(locala, i, paramArrayOfByte);
      return 0;
      if (locala != null) {
        com.tencent.pb.common.c.c.d("NETCMD", new Object[] { "CLTRCV", Integer.valueOf(paramInt), locala.xnw, Integer.valueOf(i), str, Integer.valueOf(j) });
      }
    }
    a(locala, i, null);
    return 0;
  }
  
  private final class a
  {
    int mTaskId;
    public String xnw;
    a xnx;
    c xny;
    
    public a() {}
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */