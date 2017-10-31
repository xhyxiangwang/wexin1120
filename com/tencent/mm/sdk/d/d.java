package com.tencent.mm.sdk.d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

public class d
{
  public String mName;
  public c uPX;
  public HandlerThread uPY;
  
  public d(String paramString, Looper paramLooper)
  {
    GMTrace.i(17563463450624L, 130858);
    this.mName = paramString;
    this.uPX = new c(paramLooper, this, (byte)0);
    GMTrace.o(17563463450624L, 130858);
  }
  
  private Message obtainMessage(int paramInt)
  {
    GMTrace.i(18799877160960L, 140070);
    Message localMessage = Message.obtain(this.uPX, paramInt);
    GMTrace.o(18799877160960L, 140070);
    return localMessage;
  }
  
  public void aaY()
  {
    GMTrace.i(18799742943232L, 140069);
    GMTrace.o(18799742943232L, 140069);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(17563866103808L, 130861);
    c.a(this.uPX, parama);
    GMTrace.o(17563866103808L, 130861);
  }
  
  public final void b(c paramc)
  {
    GMTrace.i(17563597668352L, 130859);
    c.a(this.uPX, paramc);
    GMTrace.o(17563597668352L, 130859);
  }
  
  public final Message bOl()
  {
    GMTrace.i(18924565430272L, 140999);
    Object localObject = this.uPX;
    if (localObject == null)
    {
      GMTrace.o(18924565430272L, 140999);
      return null;
    }
    localObject = c.b((c)localObject);
    GMTrace.o(18924565430272L, 140999);
    return (Message)localObject;
  }
  
  public final a bOm()
  {
    GMTrace.i(18924699648000L, 141000);
    Object localObject = this.uPX;
    if (localObject == null)
    {
      GMTrace.o(18924699648000L, 141000);
      return null;
    }
    localObject = c.c((c)localObject);
    GMTrace.o(18924699648000L, 141000);
    return (a)localObject;
  }
  
  public final void c(c paramc)
  {
    GMTrace.i(17563731886080L, 130860);
    c.b(this.uPX, paramc);
    GMTrace.o(17563731886080L, 130860);
  }
  
  public boolean d(Message paramMessage)
  {
    GMTrace.i(18924968083456L, 141002);
    GMTrace.o(18924968083456L, 141002);
    return true;
  }
  
  public void e(Message paramMessage)
  {
    GMTrace.i(18924833865728L, 141001);
    if (c.d(this.uPX)) {
      new StringBuilder(" - unhandledMessage: msg.what=").append(paramMessage.what);
    }
    GMTrace.o(18924833865728L, 141001);
  }
  
  public final void quit()
  {
    GMTrace.i(18800011378688L, 140071);
    c localc = this.uPX;
    if (localc == null)
    {
      GMTrace.o(18800011378688L, 140071);
      return;
    }
    c.e(localc);
    GMTrace.o(18800011378688L, 140071);
  }
  
  public void start()
  {
    GMTrace.i(17564134539264L, 130863);
    c localc = this.uPX;
    if (localc == null)
    {
      GMTrace.o(17564134539264L, 130863);
      return;
    }
    c.f(localc);
    GMTrace.o(17564134539264L, 130863);
  }
  
  public final void zG(int paramInt)
  {
    GMTrace.i(17564000321536L, 130862);
    c localc = this.uPX;
    if (localc == null)
    {
      GMTrace.o(17564000321536L, 130862);
      return;
    }
    localc.sendMessage(obtainMessage(paramInt));
    GMTrace.o(17564000321536L, 130862);
  }
  
  public final void zH(int paramInt)
  {
    GMTrace.i(18925102301184L, 141003);
    c localc = this.uPX;
    if (localc == null)
    {
      GMTrace.o(18925102301184L, 141003);
      return;
    }
    localc.sendMessageAtFrontOfQueue(obtainMessage(paramInt));
    GMTrace.o(18925102301184L, 141003);
  }
  
  public static final class a
  {
    private d uPZ;
    private long uQa;
    private int uQb;
    private String uQc;
    private a uQd;
    private a uQe;
    private a uQf;
    
    a(d paramd, Message paramMessage, String paramString, a parama1, a parama2, a parama3)
    {
      GMTrace.i(17562658144256L, 130852);
      a(paramd, paramMessage, paramString, parama1, parama2, parama3);
      GMTrace.o(17562658144256L, 130852);
    }
    
    public final void a(d paramd, Message paramMessage, String paramString, a parama1, a parama2, a parama3)
    {
      GMTrace.i(17562792361984L, 130853);
      this.uPZ = paramd;
      this.uQa = System.currentTimeMillis();
      if (paramMessage != null) {}
      for (int i = paramMessage.what;; i = 0)
      {
        this.uQb = i;
        this.uQc = paramString;
        this.uQd = parama1;
        this.uQe = parama2;
        this.uQf = parama3;
        GMTrace.o(17562792361984L, 130853);
        return;
      }
    }
    
    public final String toString()
    {
      GMTrace.i(17562926579712L, 130854);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("time=");
      Object localObject = Calendar.getInstance();
      ((Calendar)localObject).setTimeInMillis(this.uQa);
      localStringBuilder.append(String.format("%tm-%td %tH:%tM:%tS.%tL", new Object[] { localObject, localObject, localObject, localObject, localObject, localObject }));
      localStringBuilder.append(" processed=");
      if (this.uQd == null)
      {
        localObject = "<null>";
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(" org=");
        if (this.uQe != null) {
          break label255;
        }
        localObject = "<null>";
        label114:
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(" dest=");
        if (this.uQf != null) {
          break label268;
        }
        localObject = "<null>";
        label137:
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(" what=");
        if (this.uPZ == null) {
          break label281;
        }
        localObject = null;
        label159:
        if (!TextUtils.isEmpty((CharSequence)localObject)) {
          break label287;
        }
        localStringBuilder.append(this.uQb);
        localStringBuilder.append("(0x");
        localStringBuilder.append(Integer.toHexString(this.uQb));
        localStringBuilder.append(")");
      }
      for (;;)
      {
        if (!TextUtils.isEmpty(this.uQc))
        {
          localStringBuilder.append(" ");
          localStringBuilder.append(this.uQc);
        }
        localObject = localStringBuilder.toString();
        GMTrace.o(17562926579712L, 130854);
        return (String)localObject;
        localObject = this.uQd.getName();
        break;
        label255:
        localObject = this.uQe.getName();
        break label114;
        label268:
        localObject = this.uQf.getName();
        break label137;
        label281:
        localObject = "";
        break label159;
        label287:
        localStringBuilder.append((String)localObject);
      }
    }
  }
  
  private static final class b
  {
    private int mCount;
    public Vector<d.a> uQg;
    private int uQh;
    private int uQi;
    private boolean uQj;
    
    public b()
    {
      GMTrace.i(17567758417920L, 130890);
      this.uQg = new Vector();
      this.uQh = 20;
      this.uQi = 0;
      this.mCount = 0;
      this.uQj = false;
      GMTrace.o(17567758417920L, 130890);
    }
    
    /* Error */
    final void b(d paramd, Message paramMessage, String paramString, a parama1, a parama2, a parama3)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: ldc2_w 48
      //   5: ldc 50
      //   7: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   10: aload_0
      //   11: aload_0
      //   12: getfield 40	com/tencent/mm/sdk/d/d$b:mCount	I
      //   15: iconst_1
      //   16: iadd
      //   17: putfield 40	com/tencent/mm/sdk/d/d$b:mCount	I
      //   20: aload_0
      //   21: getfield 34	com/tencent/mm/sdk/d/d$b:uQg	Ljava/util/Vector;
      //   24: invokevirtual 54	java/util/Vector:size	()I
      //   27: aload_0
      //   28: getfield 36	com/tencent/mm/sdk/d/d$b:uQh	I
      //   31: if_icmpge +38 -> 69
      //   34: aload_0
      //   35: getfield 34	com/tencent/mm/sdk/d/d$b:uQg	Ljava/util/Vector;
      //   38: new 56	com/tencent/mm/sdk/d/d$a
      //   41: dup
      //   42: aload_1
      //   43: aload_2
      //   44: aload_3
      //   45: aload 4
      //   47: aload 5
      //   49: aload 6
      //   51: invokespecial 58	com/tencent/mm/sdk/d/d$a:<init>	(Lcom/tencent/mm/sdk/d/d;Landroid/os/Message;Ljava/lang/String;Lcom/tencent/mm/sdk/d/a;Lcom/tencent/mm/sdk/d/a;Lcom/tencent/mm/sdk/d/a;)V
      //   54: invokevirtual 62	java/util/Vector:add	(Ljava/lang/Object;)Z
      //   57: pop
      //   58: ldc2_w 48
      //   61: ldc 50
      //   63: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   66: aload_0
      //   67: monitorexit
      //   68: return
      //   69: aload_0
      //   70: getfield 34	com/tencent/mm/sdk/d/d$b:uQg	Ljava/util/Vector;
      //   73: aload_0
      //   74: getfield 38	com/tencent/mm/sdk/d/d$b:uQi	I
      //   77: invokevirtual 66	java/util/Vector:get	(I)Ljava/lang/Object;
      //   80: checkcast 56	com/tencent/mm/sdk/d/d$a
      //   83: astore 7
      //   85: aload_0
      //   86: aload_0
      //   87: getfield 38	com/tencent/mm/sdk/d/d$b:uQi	I
      //   90: iconst_1
      //   91: iadd
      //   92: putfield 38	com/tencent/mm/sdk/d/d$b:uQi	I
      //   95: aload_0
      //   96: getfield 38	com/tencent/mm/sdk/d/d$b:uQi	I
      //   99: aload_0
      //   100: getfield 36	com/tencent/mm/sdk/d/d$b:uQh	I
      //   103: if_icmplt +8 -> 111
      //   106: aload_0
      //   107: iconst_0
      //   108: putfield 38	com/tencent/mm/sdk/d/d$b:uQi	I
      //   111: aload 7
      //   113: aload_1
      //   114: aload_2
      //   115: aload_3
      //   116: aload 4
      //   118: aload 5
      //   120: aload 6
      //   122: invokevirtual 69	com/tencent/mm/sdk/d/d$a:a	(Lcom/tencent/mm/sdk/d/d;Landroid/os/Message;Ljava/lang/String;Lcom/tencent/mm/sdk/d/a;Lcom/tencent/mm/sdk/d/a;Lcom/tencent/mm/sdk/d/a;)V
      //   125: ldc2_w 48
      //   128: ldc 50
      //   130: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   133: goto -67 -> 66
      //   136: astore_1
      //   137: aload_0
      //   138: monitorexit
      //   139: aload_1
      //   140: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	141	0	this	b
      //   0	141	1	paramd	d
      //   0	141	2	paramMessage	Message
      //   0	141	3	paramString	String
      //   0	141	4	parama1	a
      //   0	141	5	parama2	a
      //   0	141	6	parama3	a
      //   83	29	7	locala	d.a
      // Exception table:
      //   from	to	target	type
      //   2	66	136	finally
      //   69	111	136	finally
      //   111	133	136	finally
    }
    
    final boolean bOn()
    {
      try
      {
        GMTrace.i(17567892635648L, 130891);
        boolean bool = this.uQj;
        GMTrace.o(17567892635648L, 130891);
        return bool;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    final void cleanup()
    {
      try
      {
        GMTrace.i(17568026853376L, 130892);
        this.uQg.clear();
        GMTrace.o(17568026853376L, 130892);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
  
  private static final class c
    extends Handler
  {
    private static final Object uQm;
    private d uPZ;
    private boolean uQk;
    private boolean uQl;
    private Message uQn;
    private d.b uQo;
    private boolean uQp;
    private c[] uQq;
    private int uQr;
    private c[] uQs;
    private int uQt;
    private a uQu;
    private b uQv;
    private HashMap<c, c> uQw;
    private c uQx;
    private c uQy;
    private ArrayList<Message> uQz;
    
    static
    {
      GMTrace.i(17567624200192L, 130889);
      uQm = new Object();
      GMTrace.o(17567624200192L, 130889);
    }
    
    private c(Looper paramLooper, d paramd)
    {
      super();
      GMTrace.i(17566416240640L, 130880);
      this.uQk = false;
      this.uQl = false;
      this.uQo = new d.b();
      this.uQr = -1;
      this.uQu = new a();
      this.uQv = new b();
      this.uQw = new HashMap();
      this.uQz = new ArrayList();
      this.uPZ = paramd;
      a(this.uQu, null);
      a(this.uQv, null);
      GMTrace.o(17566416240640L, 130880);
    }
    
    private final c a(c paramc1, c paramc2)
    {
      GMTrace.i(17566282022912L, 130879);
      if (this.uQl) {
        new StringBuilder("addStateInternal: E state=").append(paramc1.getName()).append(",parent=");
      }
      c localc = (c)this.uQw.get(paramc1);
      paramc2 = localc;
      if (localc == null)
      {
        paramc2 = new c();
        this.uQw.put(paramc1, paramc2);
      }
      if ((paramc2.uQC != null) && (paramc2.uQC != null)) {
        throw new RuntimeException("state already added");
      }
      paramc2.uQB = paramc1;
      paramc2.uQC = null;
      paramc2.ftb = false;
      if (this.uQl) {
        new StringBuilder("addStateInternal: X stateInfo: ").append(paramc2);
      }
      GMTrace.o(17566282022912L, 130879);
      return paramc2;
    }
    
    private void a(c paramc, Message paramMessage)
    {
      GMTrace.i(17565342498816L, 130872);
      Object localObject = this.uQq[this.uQr].uQB;
      int i;
      if ((this.uPZ.d(this.uQn)) && (paramMessage.obj != uQm))
      {
        i = 1;
        if (!this.uQo.bOn()) {
          break label233;
        }
        if (this.uQy != null) {
          this.uQo.b(this.uPZ, this.uQn, "", paramc, (a)localObject, this.uQy);
        }
      }
      for (;;)
      {
        paramc = this.uQy;
        if (paramc == null) {
          break label386;
        }
        for (;;)
        {
          this.uQt = 0;
          paramMessage = (c)this.uQw.get(paramc);
          do
          {
            localObject = this.uQs;
            i = this.uQt;
            this.uQt = (i + 1);
            localObject[i] = paramMessage;
            localObject = paramMessage.uQC;
            if (localObject == null) {
              break;
            }
            paramMessage = (Message)localObject;
          } while (!((c)localObject).ftb);
          if (this.uQl) {
            new StringBuilder("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=").append(this.uQt).append(",curStateInfo: ").append(localObject);
          }
          a((c)localObject);
          zI(bOp());
          bOo();
          if (paramc == this.uQy) {
            break;
          }
          paramc = this.uQy;
        }
        i = 0;
        break;
        label233:
        if (i != 0) {
          this.uQo.b(this.uPZ, this.uQn, "", paramc, (a)localObject, this.uQy);
        }
      }
      this.uQy = null;
      label386:
      for (;;)
      {
        if ((paramc != null) && (paramc == this.uQv))
        {
          this.uPZ.aaY();
          if (this.uPZ.uPY != null)
          {
            getLooper().quit();
            this.uPZ.uPY = null;
          }
          this.uPZ.uPX = null;
          this.uPZ = null;
          this.uQn = null;
          this.uQo.cleanup();
          this.uQq = null;
          this.uQs = null;
          this.uQw.clear();
          this.uQx = null;
          this.uQy = null;
          this.uQz.clear();
          this.uQk = true;
        }
        GMTrace.o(17565342498816L, 130872);
        return;
      }
    }
    
    private final void a(c paramc)
    {
      GMTrace.i(17565610934272L, 130874);
      while ((this.uQr >= 0) && (this.uQq[this.uQr] != paramc))
      {
        c localc = this.uQq[this.uQr].uQB;
        if (this.uQl) {
          new StringBuilder("invokeExitMethods: ").append(localc.getName());
        }
        localc.exit();
        this.uQq[this.uQr].ftb = false;
        this.uQr -= 1;
      }
      GMTrace.o(17565610934272L, 130874);
    }
    
    private final void b(a parama)
    {
      GMTrace.i(17566550458368L, 130881);
      this.uQy = ((c)parama);
      if (this.uQl) {
        new StringBuilder("transitionTo: destState=").append(this.uQy.getName());
      }
      GMTrace.o(17566550458368L, 130881);
    }
    
    private final void bOo()
    {
      GMTrace.i(17565879369728L, 130876);
      int i = this.uQz.size() - 1;
      while (i >= 0)
      {
        Message localMessage = (Message)this.uQz.get(i);
        if (this.uQl) {
          new StringBuilder("moveDeferredMessageAtFrontOfQueue; what=").append(localMessage.what);
        }
        sendMessageAtFrontOfQueue(localMessage);
        i -= 1;
      }
      this.uQz.clear();
      GMTrace.o(17565879369728L, 130876);
    }
    
    private final int bOp()
    {
      GMTrace.i(17566013587456L, 130877);
      int k = this.uQr + 1;
      int i = this.uQt - 1;
      int j = k;
      while (i >= 0)
      {
        if (this.uQl) {
          new StringBuilder("moveTempStackToStateStack: i=").append(i).append(",j=").append(j);
        }
        this.uQq[j] = this.uQs[i];
        j += 1;
        i -= 1;
      }
      this.uQr = (j - 1);
      if (this.uQl) {
        new StringBuilder("moveTempStackToStateStack: X mStateStackTop=").append(this.uQr).append(",startingIndex=").append(k).append(",Top=").append(this.uQq[this.uQr].uQB.getName());
      }
      GMTrace.o(17566013587456L, 130877);
      return k;
    }
    
    private final void bOq()
    {
      GMTrace.i(17566147805184L, 130878);
      if (this.uQl) {
        new StringBuilder("setupInitialStateStack: E mInitialState=").append(this.uQx.getName());
      }
      c localc = (c)this.uQw.get(this.uQx);
      for (this.uQt = 0; localc != null; this.uQt += 1)
      {
        this.uQs[this.uQt] = localc;
        localc = localc.uQC;
      }
      this.uQr = -1;
      bOp();
      GMTrace.o(17566147805184L, 130878);
    }
    
    private final c n(Message paramMessage)
    {
      GMTrace.i(17565476716544L, 130873);
      Object localObject2 = this.uQq[this.uQr];
      if (this.uQl) {
        new StringBuilder("processMsg: ").append(((c)localObject2).uQB.getName());
      }
      int i;
      Object localObject1;
      if ((paramMessage.what == -1) && (paramMessage.obj == uQm))
      {
        i = 1;
        localObject1 = localObject2;
        if (i == 0) {
          break label146;
        }
        b(this.uQv);
      }
      for (;;)
      {
        if (localObject2 == null) {
          break label182;
        }
        paramMessage = ((c)localObject2).uQB;
        GMTrace.o(17565476716544L, 130873);
        return paramMessage;
        i = 0;
        break;
        label146:
        do
        {
          localObject1 = localObject2;
          if (this.uQl)
          {
            new StringBuilder("processMsg: ").append(((c)localObject2).uQB.getName());
            localObject1 = localObject2;
          }
          localObject2 = localObject1;
          if (((c)localObject1).uQB.f(paramMessage)) {
            break;
          }
          localObject2 = ((c)localObject1).uQC;
        } while (localObject2 != null);
        this.uPZ.e(paramMessage);
      }
      label182:
      GMTrace.o(17565476716544L, 130873);
      return null;
    }
    
    private final void zI(int paramInt)
    {
      GMTrace.i(17565745152000L, 130875);
      while (paramInt <= this.uQr)
      {
        if (this.uQl) {
          new StringBuilder("invokeEnterMethods: ").append(this.uQq[paramInt].uQB.getName());
        }
        this.uQq[paramInt].uQB.enter();
        this.uQq[paramInt].ftb = true;
        paramInt += 1;
      }
      GMTrace.o(17565745152000L, 130875);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(17565208281088L, 130871);
      c localc;
      if (!this.uQk)
      {
        if (this.uQl) {
          new StringBuilder("handleMessage: E msg.what=").append(paramMessage.what);
        }
        this.uQn = paramMessage;
        localc = null;
        if (!this.uQp) {
          break label77;
        }
        localc = n(paramMessage);
      }
      for (;;)
      {
        a(localc, paramMessage);
        GMTrace.o(17565208281088L, 130871);
        return;
        label77:
        if ((this.uQp) || (this.uQn.what != -2) || (this.uQn.obj != uQm)) {
          break;
        }
        this.uQp = true;
        zI(0);
      }
      throw new RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + paramMessage);
    }
    
    private final class a
      extends c
    {
      public a()
      {
        GMTrace.i(17562389708800L, 130850);
        GMTrace.o(17562389708800L, 130850);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(17562523926528L, 130851);
        GMTrace.o(17562523926528L, 130851);
        return true;
      }
    }
    
    private final class b
      extends c
    {
      public b()
      {
        GMTrace.i(17564268756992L, 130864);
        GMTrace.o(17564268756992L, 130864);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(17564402974720L, 130865);
        GMTrace.o(17564402974720L, 130865);
        return false;
      }
    }
    
    private final class c
    {
      boolean ftb;
      c uQB;
      c uQC;
      
      public c()
      {
        GMTrace.i(17563060797440L, 130855);
        GMTrace.o(17563060797440L, 130855);
      }
      
      public final String toString()
      {
        GMTrace.i(17563195015168L, 130856);
        StringBuilder localStringBuilder = new StringBuilder("state=").append(this.uQB.getName()).append(",active=").append(this.ftb).append(",parent=");
        if (this.uQC == null) {}
        for (String str = "null";; str = this.uQC.uQB.getName())
        {
          str = str;
          GMTrace.o(17563195015168L, 130856);
          return str;
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/sdk/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */