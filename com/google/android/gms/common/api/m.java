package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.h.a;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.p.a;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.signin.d;
import com.google.android.gms.signin.e;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public final class m
  implements p
{
  public final o ahL;
  public final Lock ahN;
  private ConnectionResult ahO;
  private int ahP;
  private int ahQ = 0;
  private boolean ahR = false;
  private int ahS;
  private final Bundle ahT = new Bundle();
  private final Set<a.c> ahU = new HashSet();
  public d ahV;
  private int ahW;
  public boolean ahX;
  boolean ahY;
  public com.google.android.gms.common.internal.p ahZ;
  public final com.google.android.gms.common.b ahk;
  private final a.a<? extends d, e> ahl;
  boolean aia;
  boolean aib;
  private final h aic;
  private final Map<a<?>, Integer> aid;
  private ArrayList<Future<?>> aie = new ArrayList();
  public final Context mContext;
  
  public m(o paramo, h paramh, Map<a<?>, Integer> paramMap, com.google.android.gms.common.b paramb, a.a<? extends d, e> parama, Lock paramLock, Context paramContext)
  {
    this.ahL = paramo;
    this.aic = paramh;
    this.aid = paramMap;
    this.ahk = paramb;
    this.ahl = parama;
    this.ahN = paramLock;
    this.mContext = paramContext;
  }
  
  private void ad(boolean paramBoolean)
  {
    if (this.ahV != null)
    {
      if ((this.ahV.isConnected()) && (paramBoolean)) {
        this.ahV.mj();
      }
      this.ahV.disconnect();
      this.ahZ = null;
    }
  }
  
  private static String bW(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 0: 
      return "STEP_GETTING_SERVICE_BINDINGS";
    case 1: 
      return "STEP_VALIDATING_ACCOUNT";
    case 2: 
      return "STEP_AUTHENTICATING";
    }
    return "STEP_GETTING_REMOTE_SERVICE";
  }
  
  /* Error */
  private void kf()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 110	com/google/android/gms/common/api/m:ahL	Lcom/google/android/gms/common/api/o;
    //   6: astore 4
    //   8: aload 4
    //   10: getfield 159	com/google/android/gms/common/api/o:ahN	Ljava/util/concurrent/locks/Lock;
    //   13: invokeinterface 164 1 0
    //   18: aload 4
    //   20: invokevirtual 167	com/google/android/gms/common/api/o:kk	()Z
    //   23: pop
    //   24: aload 4
    //   26: new 169	com/google/android/gms/common/api/l
    //   29: dup
    //   30: aload 4
    //   32: invokespecial 172	com/google/android/gms/common/api/l:<init>	(Lcom/google/android/gms/common/api/o;)V
    //   35: putfield 176	com/google/android/gms/common/api/o:aiE	Lcom/google/android/gms/common/api/p;
    //   38: aload 4
    //   40: getfield 176	com/google/android/gms/common/api/o:aiE	Lcom/google/android/gms/common/api/p;
    //   43: invokeinterface 179 1 0
    //   48: aload 4
    //   50: getfield 183	com/google/android/gms/common/api/o:ait	Ljava/util/concurrent/locks/Condition;
    //   53: invokeinterface 188 1 0
    //   58: aload 4
    //   60: getfield 159	com/google/android/gms/common/api/o:ahN	Ljava/util/concurrent/locks/Lock;
    //   63: invokeinterface 191 1 0
    //   68: invokestatic 197	com/google/android/gms/common/api/q:kl	()Ljava/util/concurrent/ExecutorService;
    //   71: new 8	com/google/android/gms/common/api/m$1
    //   74: dup
    //   75: aload_0
    //   76: invokespecial 200	com/google/android/gms/common/api/m$1:<init>	(Lcom/google/android/gms/common/api/m;)V
    //   79: invokeinterface 206 2 0
    //   84: aload_0
    //   85: getfield 129	com/google/android/gms/common/api/m:ahV	Lcom/google/android/gms/signin/d;
    //   88: ifnull +32 -> 120
    //   91: aload_0
    //   92: getfield 208	com/google/android/gms/common/api/m:aia	Z
    //   95: ifeq +20 -> 115
    //   98: aload_0
    //   99: getfield 129	com/google/android/gms/common/api/m:ahV	Lcom/google/android/gms/signin/d;
    //   102: aload_0
    //   103: getfield 143	com/google/android/gms/common/api/m:ahZ	Lcom/google/android/gms/common/internal/p;
    //   106: aload_0
    //   107: getfield 210	com/google/android/gms/common/api/m:aib	Z
    //   110: invokeinterface 213 3 0
    //   115: aload_0
    //   116: iconst_0
    //   117: invokespecial 215	com/google/android/gms/common/api/m:ad	(Z)V
    //   120: aload_0
    //   121: getfield 110	com/google/android/gms/common/api/m:ahL	Lcom/google/android/gms/common/api/o;
    //   124: getfield 218	com/google/android/gms/common/api/o:aiC	Ljava/util/Map;
    //   127: invokeinterface 224 1 0
    //   132: invokeinterface 230 1 0
    //   137: astore 4
    //   139: aload 4
    //   141: invokeinterface 235 1 0
    //   146: ifeq +55 -> 201
    //   149: aload 4
    //   151: invokeinterface 239 1 0
    //   156: checkcast 241	com/google/android/gms/common/api/a$c
    //   159: astore 5
    //   161: aload_0
    //   162: getfield 110	com/google/android/gms/common/api/m:ahL	Lcom/google/android/gms/common/api/o;
    //   165: getfield 244	com/google/android/gms/common/api/o:aiB	Ljava/util/Map;
    //   168: aload 5
    //   170: invokeinterface 248 2 0
    //   175: checkcast 250	com/google/android/gms/common/api/a$b
    //   178: invokeinterface 251 1 0
    //   183: goto -44 -> 139
    //   186: astore 5
    //   188: aload 4
    //   190: getfield 159	com/google/android/gms/common/api/o:ahN	Ljava/util/concurrent/locks/Lock;
    //   193: invokeinterface 191 1 0
    //   198: aload 5
    //   200: athrow
    //   201: aload_0
    //   202: getfield 93	com/google/android/gms/common/api/m:ahR	Z
    //   205: ifeq +13 -> 218
    //   208: aload_0
    //   209: iconst_0
    //   210: putfield 93	com/google/android/gms/common/api/m:ahR	Z
    //   213: aload_0
    //   214: invokevirtual 252	com/google/android/gms/common/api/m:disconnect	()V
    //   217: return
    //   218: aload_0
    //   219: getfield 98	com/google/android/gms/common/api/m:ahT	Landroid/os/Bundle;
    //   222: invokevirtual 255	android/os/Bundle:isEmpty	()Z
    //   225: ifeq +212 -> 437
    //   228: aconst_null
    //   229: astore 4
    //   231: aload_0
    //   232: getfield 110	com/google/android/gms/common/api/m:ahL	Lcom/google/android/gms/common/api/o;
    //   235: getfield 259	com/google/android/gms/common/api/o:aiu	Lcom/google/android/gms/common/internal/l;
    //   238: astore 6
    //   240: invokestatic 265	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   243: aload 6
    //   245: getfield 271	com/google/android/gms/common/internal/l:mHandler	Landroid/os/Handler;
    //   248: invokevirtual 276	android/os/Handler:getLooper	()Landroid/os/Looper;
    //   251: if_acmpne +195 -> 446
    //   254: iconst_1
    //   255: istore_2
    //   256: iload_2
    //   257: ldc_w 278
    //   260: invokestatic 283	com/google/android/gms/common/internal/w:b	(ZLjava/lang/Object;)V
    //   263: aload 6
    //   265: getfield 287	com/google/android/gms/common/internal/l:alb	Ljava/lang/Object;
    //   268: astore 5
    //   270: aload 5
    //   272: monitorenter
    //   273: aload 6
    //   275: getfield 290	com/google/android/gms/common/internal/l:alz	Z
    //   278: ifne +173 -> 451
    //   281: iconst_1
    //   282: istore_2
    //   283: iload_2
    //   284: invokestatic 293	com/google/android/gms/common/internal/w:ae	(Z)V
    //   287: aload 6
    //   289: getfield 271	com/google/android/gms/common/internal/l:mHandler	Landroid/os/Handler;
    //   292: iconst_1
    //   293: invokevirtual 297	android/os/Handler:removeMessages	(I)V
    //   296: aload 6
    //   298: iconst_1
    //   299: putfield 290	com/google/android/gms/common/internal/l:alz	Z
    //   302: aload 6
    //   304: getfield 300	com/google/android/gms/common/internal/l:alv	Ljava/util/ArrayList;
    //   307: invokevirtual 304	java/util/ArrayList:size	()I
    //   310: ifne +146 -> 456
    //   313: iload_3
    //   314: istore_2
    //   315: iload_2
    //   316: invokestatic 293	com/google/android/gms/common/internal/w:ae	(Z)V
    //   319: new 105	java/util/ArrayList
    //   322: dup
    //   323: aload 6
    //   325: getfield 307	com/google/android/gms/common/internal/l:alu	Ljava/util/ArrayList;
    //   328: invokespecial 310	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   331: astore 7
    //   333: aload 6
    //   335: getfield 314	com/google/android/gms/common/internal/l:aly	Ljava/util/concurrent/atomic/AtomicInteger;
    //   338: invokevirtual 318	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   341: istore_1
    //   342: aload 7
    //   344: invokevirtual 319	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   347: astore 7
    //   349: aload 7
    //   351: invokeinterface 235 1 0
    //   356: ifeq +105 -> 461
    //   359: aload 7
    //   361: invokeinterface 239 1 0
    //   366: checkcast 321	com/google/android/gms/common/api/c$b
    //   369: astore 8
    //   371: aload 6
    //   373: getfield 324	com/google/android/gms/common/internal/l:alx	Z
    //   376: ifeq +85 -> 461
    //   379: aload 6
    //   381: getfield 328	com/google/android/gms/common/internal/l:alt	Lcom/google/android/gms/common/internal/l$a;
    //   384: invokeinterface 331 1 0
    //   389: ifeq +72 -> 461
    //   392: aload 6
    //   394: getfield 314	com/google/android/gms/common/internal/l:aly	Ljava/util/concurrent/atomic/AtomicInteger;
    //   397: invokevirtual 318	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   400: iload_1
    //   401: if_icmpne +60 -> 461
    //   404: aload 6
    //   406: getfield 300	com/google/android/gms/common/internal/l:alv	Ljava/util/ArrayList;
    //   409: aload 8
    //   411: invokevirtual 335	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   414: ifne -65 -> 349
    //   417: aload 8
    //   419: aload 4
    //   421: invokeinterface 338 2 0
    //   426: goto -77 -> 349
    //   429: astore 4
    //   431: aload 5
    //   433: monitorexit
    //   434: aload 4
    //   436: athrow
    //   437: aload_0
    //   438: getfield 98	com/google/android/gms/common/api/m:ahT	Landroid/os/Bundle;
    //   441: astore 4
    //   443: goto -212 -> 231
    //   446: iconst_0
    //   447: istore_2
    //   448: goto -192 -> 256
    //   451: iconst_0
    //   452: istore_2
    //   453: goto -170 -> 283
    //   456: iconst_0
    //   457: istore_2
    //   458: goto -143 -> 315
    //   461: aload 6
    //   463: getfield 300	com/google/android/gms/common/internal/l:alv	Ljava/util/ArrayList;
    //   466: invokevirtual 341	java/util/ArrayList:clear	()V
    //   469: aload 6
    //   471: iconst_0
    //   472: putfield 290	com/google/android/gms/common/internal/l:alz	Z
    //   475: aload 5
    //   477: monitorexit
    //   478: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	479	0	this	m
    //   341	61	1	i	int
    //   255	203	2	bool1	boolean
    //   1	313	3	bool2	boolean
    //   6	414	4	localObject1	Object
    //   429	6	4	localObject2	Object
    //   441	1	4	localBundle	Bundle
    //   159	10	5	localc	a.c
    //   186	13	5	localObject3	Object
    //   238	232	6	locall	l
    //   331	29	7	localObject5	Object
    //   369	49	8	localb	c.b
    // Exception table:
    //   from	to	target	type
    //   18	58	186	finally
    //   273	281	429	finally
    //   283	313	429	finally
    //   315	349	429	finally
    //   349	426	429	finally
    //   431	434	429	finally
    //   461	478	429	finally
  }
  
  private void kh()
  {
    Iterator localIterator = this.aie.iterator();
    while (localIterator.hasNext()) {
      ((Future)localIterator.next()).cancel(true);
    }
    this.aie.clear();
  }
  
  public final <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT)
  {
    this.ahL.aiv.add(paramT);
    return paramT;
  }
  
  public final void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt)
  {
    if (!bV(3)) {}
    do
    {
      return;
      b(paramConnectionResult, parama, paramInt);
    } while (!kb());
    kf();
  }
  
  public final <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void b(ConnectionResult paramConnectionResult, a<?> parama, int paramInt)
  {
    int i = 1;
    if (paramInt != 2)
    {
      parama.jI();
      if (paramInt == 1)
      {
        if (!paramConnectionResult.jG()) {
          break label89;
        }
        paramInt = 1;
        if (paramInt == 0) {
          break label109;
        }
      }
      paramInt = i;
      if (this.ahO != null) {
        if (Integer.MAX_VALUE >= this.ahP) {
          break label109;
        }
      }
    }
    label89:
    label109:
    for (paramInt = i;; paramInt = 0)
    {
      if (paramInt != 0)
      {
        this.ahO = paramConnectionResult;
        this.ahP = Integer.MAX_VALUE;
      }
      this.ahL.aiC.put(parama.jJ(), paramConnectionResult);
      return;
      if (com.google.android.gms.common.b.bQ(paramConnectionResult.agH) != null)
      {
        paramInt = 1;
        break;
      }
      paramInt = 0;
      break;
    }
  }
  
  public final void bU(int paramInt)
  {
    e(new ConnectionResult(8, null));
  }
  
  public final boolean bV(int paramInt)
  {
    if (this.ahQ != paramInt)
    {
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + bW(this.ahQ) + " but received callback for step " + bW(paramInt));
      e(new ConnectionResult(8, null));
      return false;
    }
    return true;
  }
  
  public final void begin()
  {
    this.ahL.aiu.alx = true;
    this.ahL.aiC.clear();
    this.ahR = false;
    this.ahX = false;
    this.ahO = null;
    this.ahQ = 0;
    this.ahW = 2;
    this.ahY = false;
    this.aia = false;
    HashMap localHashMap = new HashMap();
    Object localObject = this.aid.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      a.b localb = (a.b)this.ahL.aiB.get(locala.jJ());
      int i = ((Integer)this.aid.get(locala)).intValue();
      locala.jI();
      if (localb.jL())
      {
        this.ahX = true;
        if (i < this.ahW) {
          this.ahW = i;
        }
        if (i != 0) {
          this.ahU.add(locala.jJ());
        }
      }
      localHashMap.put(localb, new d(this, locala, i));
    }
    if (this.ahX)
    {
      this.aic.akW = Integer.valueOf(System.identityHashCode(this.ahL));
      localObject = new g();
      this.ahV = ((d)this.ahl.a(this.mContext, this.ahL.ahj, this.aic, this.aic.akV, (c.b)localObject, (c.c)localObject));
    }
    this.ahS = this.ahL.aiB.size();
    this.aie.add(q.kl().submit(new e(localHashMap)));
  }
  
  public final void connect()
  {
    this.ahR = false;
  }
  
  public final boolean d(ConnectionResult paramConnectionResult)
  {
    return (this.ahW == 2) || ((this.ahW == 1) && (!paramConnectionResult.jG()));
  }
  
  public final void disconnect()
  {
    Iterator localIterator = this.ahL.aiv.iterator();
    while (localIterator.hasNext())
    {
      ((o.e)localIterator.next()).cancel();
      localIterator.remove();
    }
    this.ahL.kj();
    if ((this.ahO == null) && (!this.ahL.aiv.isEmpty()))
    {
      this.ahR = true;
      return;
    }
    kh();
    ad(true);
    this.ahL.aiC.clear();
    this.ahL.f(null);
    this.ahL.aiu.kD();
  }
  
  public final void e(ConnectionResult paramConnectionResult)
  {
    boolean bool2 = false;
    this.ahR = false;
    kh();
    boolean bool1;
    l locall;
    if (!paramConnectionResult.jG())
    {
      bool1 = true;
      ad(bool1);
      this.ahL.aiC.clear();
      this.ahL.f(paramConnectionResult);
      if ((!this.ahL.aiw) || (!com.google.android.gms.common.b.l(this.mContext, paramConnectionResult.agH)))
      {
        this.ahL.kk();
        locall = this.ahL.aiu;
        bool1 = bool2;
        if (Looper.myLooper() == locall.mHandler.getLooper()) {
          bool1 = true;
        }
        w.b(bool1, "onConnectionFailure must only be called on the Handler thread");
        locall.mHandler.removeMessages(1);
      }
    }
    for (;;)
    {
      synchronized (locall.alb)
      {
        Object localObject2 = new ArrayList(locall.alw);
        int i = locall.aly.get();
        localObject2 = ((ArrayList)localObject2).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          c.c localc = (c.c)((Iterator)localObject2).next();
          if ((!locall.alx) || (locall.aly.get() != i))
          {
            this.ahL.aiu.kD();
            return;
            bool1 = false;
            break;
          }
          if (!locall.alw.contains(localc)) {
            continue;
          }
          localc.a(paramConnectionResult);
        }
      }
    }
  }
  
  public final void g(Bundle paramBundle)
  {
    if (!bV(3)) {}
    do
    {
      return;
      if (paramBundle != null) {
        this.ahT.putAll(paramBundle);
      }
    } while (!kb());
    kf();
  }
  
  public final String getName()
  {
    return "CONNECTING";
  }
  
  public final boolean kb()
  {
    this.ahS -= 1;
    if (this.ahS > 0) {
      return false;
    }
    if (this.ahS < 0)
    {
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
      e(new ConnectionResult(8, null));
      return false;
    }
    if (this.ahO != null)
    {
      e(this.ahO);
      return false;
    }
    return true;
  }
  
  public final void kc()
  {
    if (this.ahS != 0) {}
    ArrayList localArrayList;
    do
    {
      do
      {
        return;
        if (!this.ahX) {
          break;
        }
      } while (!this.ahY);
      localArrayList = new ArrayList();
      this.ahQ = 1;
      this.ahS = this.ahL.aiB.size();
      Iterator localIterator = this.ahL.aiB.keySet().iterator();
      while (localIterator.hasNext())
      {
        a.c localc = (a.c)localIterator.next();
        if (this.ahL.aiC.containsKey(localc))
        {
          if (kb()) {
            kd();
          }
        }
        else {
          localArrayList.add(this.ahL.aiB.get(localc));
        }
      }
    } while (localArrayList.isEmpty());
    this.aie.add(q.kl().submit(new h(localArrayList)));
    return;
    ke();
  }
  
  public final void kd()
  {
    this.ahQ = 2;
    this.ahL.aiD = ki();
    this.aie.add(q.kl().submit(new c()));
  }
  
  public final void ke()
  {
    ArrayList localArrayList = new ArrayList();
    this.ahQ = 3;
    this.ahS = this.ahL.aiB.size();
    Iterator localIterator = this.ahL.aiB.keySet().iterator();
    while (localIterator.hasNext())
    {
      a.c localc = (a.c)localIterator.next();
      if (this.ahL.aiC.containsKey(localc))
      {
        if (kb()) {
          kf();
        }
      }
      else {
        localArrayList.add(this.ahL.aiB.get(localc));
      }
    }
    if (!localArrayList.isEmpty()) {
      this.aie.add(q.kl().submit(new f(localArrayList)));
    }
  }
  
  public final void kg()
  {
    this.ahX = false;
    this.ahL.aiD = Collections.emptySet();
    Iterator localIterator = this.ahU.iterator();
    while (localIterator.hasNext())
    {
      a.c localc = (a.c)localIterator.next();
      if (!this.ahL.aiC.containsKey(localc)) {
        this.ahL.aiC.put(localc, new ConnectionResult(17, null));
      }
    }
  }
  
  public final Set<Scope> ki()
  {
    HashSet localHashSet = new HashSet(this.aic.agY);
    Map localMap = this.aic.akU;
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (!this.ahL.aiC.containsKey(locala.jJ())) {
        localHashSet.addAll(((h.a)localMap.get(locala)).ahs);
      }
    }
    return localHashSet;
  }
  
  private static final class a
    extends com.google.android.gms.signin.internal.b
  {
    private final WeakReference<m> aig;
    
    a(m paramm)
    {
      this.aig = new WeakReference(paramm);
    }
    
    public final void a(final ConnectionResult paramConnectionResult, final AuthAccountResult paramAuthAccountResult)
    {
      paramAuthAccountResult = (m)this.aig.get();
      if (paramAuthAccountResult == null) {
        return;
      }
      paramAuthAccountResult.ahL.a(new o.b(paramAuthAccountResult)
      {
        public final void ka()
        {
          m localm = paramAuthAccountResult;
          ConnectionResult localConnectionResult = paramConnectionResult;
          if (localm.bV(2))
          {
            if (localConnectionResult.isSuccess()) {
              localm.ke();
            }
          }
          else {
            return;
          }
          if (localm.d(localConnectionResult))
          {
            localm.kg();
            localm.ke();
            return;
          }
          localm.e(localConnectionResult);
        }
      });
    }
  }
  
  private static final class b
    extends t.a
  {
    private final WeakReference<m> aig;
    
    b(m paramm)
    {
      this.aig = new WeakReference(paramm);
    }
    
    public final void a(final ResolveAccountResponse paramResolveAccountResponse)
    {
      final m localm = (m)this.aig.get();
      if (localm == null) {
        return;
      }
      localm.ahL.a(new o.b(localm)
      {
        public final void ka()
        {
          m localm = localm;
          ResolveAccountResponse localResolveAccountResponse = paramResolveAccountResponse;
          ConnectionResult localConnectionResult;
          if (localm.bV(0))
          {
            localConnectionResult = localResolveAccountResponse.aje;
            if (localConnectionResult.isSuccess())
            {
              localm.ahZ = p.a.g(localResolveAccountResponse.aka);
              localm.ahY = true;
              localm.aia = localResolveAccountResponse.aia;
              localm.aib = localResolveAccountResponse.akp;
              localm.kc();
            }
          }
          else
          {
            return;
          }
          if (localm.d(localConnectionResult))
          {
            localm.kg();
            localm.kc();
            return;
          }
          localm.e(localConnectionResult);
        }
      });
    }
  }
  
  private final class c
    extends m.i
  {
    public c()
    {
      super();
    }
    
    public final void ka()
    {
      m.this.ahV.a(m.this.ahZ, m.this.ahL.aiD, new m.a(m.this));
    }
  }
  
  private static final class d
    implements c.e
  {
    private final WeakReference<m> aig;
    private final a<?> aim;
    public final int ain;
    
    public d(m paramm, a<?> parama, int paramInt)
    {
      this.aig = new WeakReference(paramm);
      this.aim = parama;
      this.ain = paramInt;
    }
    
    public final void b(ConnectionResult paramConnectionResult)
    {
      boolean bool = false;
      m localm = (m)this.aig.get();
      if (localm == null) {
        return;
      }
      if (Looper.myLooper() == localm.ahL.ahj) {
        bool = true;
      }
      w.b(bool, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
      localm.ahN.lock();
      try
      {
        bool = localm.bV(0);
        if (!bool) {
          return;
        }
        if (!paramConnectionResult.isSuccess()) {
          localm.b(paramConnectionResult, this.aim, this.ain);
        }
        if (localm.kb()) {
          localm.kc();
        }
        return;
      }
      finally
      {
        localm.ahN.unlock();
      }
    }
    
    public final void c(ConnectionResult paramConnectionResult)
    {
      boolean bool = true;
      m localm = (m)this.aig.get();
      if (localm == null) {
        return;
      }
      if (Looper.myLooper() == localm.ahL.ahj) {}
      for (;;)
      {
        w.b(bool, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        localm.ahN.lock();
        try
        {
          bool = localm.bV(1);
          if (!bool)
          {
            return;
            bool = false;
            continue;
          }
          if (!paramConnectionResult.isSuccess()) {
            localm.b(paramConnectionResult, this.aim, this.ain);
          }
          if (localm.kb()) {
            localm.kd();
          }
          return;
        }
        finally
        {
          localm.ahN.unlock();
        }
      }
    }
  }
  
  private final class e
    extends m.i
  {
    private final Map<a.b, m.d> aio;
    
    public e()
    {
      super();
      Map localMap;
      this.aio = localMap;
    }
    
    public final void ka()
    {
      int n = 1;
      int m = 0;
      final Object localObject = this.aio.keySet().iterator();
      int j = 1;
      int i = 0;
      a.b localb;
      int k;
      if (((Iterator)localObject).hasNext())
      {
        localb = (a.b)((Iterator)localObject).next();
        if (localb.jM())
        {
          if (((m.d)this.aio.get(localb)).ain != 0) {
            break label294;
          }
          i = 1;
          k = n;
        }
      }
      for (;;)
      {
        if (k != 0) {
          m = com.google.android.gms.common.b.x(m.this.mContext);
        }
        if ((m != 0) && ((i != 0) || (j != 0)))
        {
          localObject = new ConnectionResult(m, null);
          m.this.ahL.a(new o.b(m.this)
          {
            public final void ka()
            {
              m.this.e(localObject);
            }
          });
          label148:
          return;
          k = 0;
          j = i;
          i = k;
        }
        for (;;)
        {
          k = j;
          j = i;
          i = k;
          break;
          if (m.this.ahX) {
            m.this.ahV.connect();
          }
          localObject = this.aio.keySet().iterator();
          while (((Iterator)localObject).hasNext())
          {
            localb = (a.b)((Iterator)localObject).next();
            final c.e locale = (c.e)this.aio.get(localb);
            if ((localb.jM()) && (m != 0)) {
              m.this.ahL.a(new o.b(m.this)
              {
                public final void ka()
                {
                  locale.b(new ConnectionResult(16, null));
                }
              });
            } else {
              localb.a(locale);
            }
          }
          break label148;
          label294:
          i = j;
          j = 1;
        }
        k = i;
        i = 0;
      }
    }
  }
  
  private final class f
    extends m.i
  {
    private final ArrayList<a.b> ais;
    
    public f()
    {
      super();
      ArrayList localArrayList;
      this.ais = localArrayList;
    }
    
    public final void ka()
    {
      Set localSet = m.this.ahL.aiD;
      if (localSet.isEmpty()) {
        localSet = m.this.ki();
      }
      for (;;)
      {
        Iterator localIterator = this.ais.iterator();
        while (localIterator.hasNext()) {
          ((a.b)localIterator.next()).a(m.this.ahZ, localSet);
        }
        return;
      }
    }
  }
  
  private final class g
    implements c.b, c.c
  {
    public g() {}
    
    /* Error */
    public final void a(ConnectionResult paramConnectionResult)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 17	com/google/android/gms/common/api/m$g:aif	Lcom/google/android/gms/common/api/m;
      //   4: getfield 27	com/google/android/gms/common/api/m:ahN	Ljava/util/concurrent/locks/Lock;
      //   7: invokeinterface 32 1 0
      //   12: aload_0
      //   13: getfield 17	com/google/android/gms/common/api/m$g:aif	Lcom/google/android/gms/common/api/m;
      //   16: aload_1
      //   17: invokevirtual 36	com/google/android/gms/common/api/m:d	(Lcom/google/android/gms/common/ConnectionResult;)Z
      //   20: ifeq +30 -> 50
      //   23: aload_0
      //   24: getfield 17	com/google/android/gms/common/api/m$g:aif	Lcom/google/android/gms/common/api/m;
      //   27: invokevirtual 39	com/google/android/gms/common/api/m:kg	()V
      //   30: aload_0
      //   31: getfield 17	com/google/android/gms/common/api/m$g:aif	Lcom/google/android/gms/common/api/m;
      //   34: invokevirtual 42	com/google/android/gms/common/api/m:ke	()V
      //   37: aload_0
      //   38: getfield 17	com/google/android/gms/common/api/m$g:aif	Lcom/google/android/gms/common/api/m;
      //   41: getfield 27	com/google/android/gms/common/api/m:ahN	Ljava/util/concurrent/locks/Lock;
      //   44: invokeinterface 45 1 0
      //   49: return
      //   50: aload_0
      //   51: getfield 17	com/google/android/gms/common/api/m$g:aif	Lcom/google/android/gms/common/api/m;
      //   54: aload_1
      //   55: invokevirtual 48	com/google/android/gms/common/api/m:e	(Lcom/google/android/gms/common/ConnectionResult;)V
      //   58: goto -21 -> 37
      //   61: astore_1
      //   62: aload_0
      //   63: getfield 17	com/google/android/gms/common/api/m$g:aif	Lcom/google/android/gms/common/api/m;
      //   66: getfield 27	com/google/android/gms/common/api/m:ahN	Ljava/util/concurrent/locks/Lock;
      //   69: invokeinterface 45 1 0
      //   74: aload_1
      //   75: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	76	0	this	g
      //   0	76	1	paramConnectionResult	ConnectionResult
      // Exception table:
      //   from	to	target	type
      //   12	37	61	finally
      //   50	58	61	finally
    }
    
    public final void bU(int paramInt) {}
    
    public final void g(Bundle paramBundle)
    {
      m.this.ahV.a(new m.b(m.this));
    }
  }
  
  private final class h
    extends m.i
  {
    private final ArrayList<a.b> ais;
    
    public h()
    {
      super();
      ArrayList localArrayList;
      this.ais = localArrayList;
    }
    
    public final void ka()
    {
      Iterator localIterator = this.ais.iterator();
      while (localIterator.hasNext()) {
        ((a.b)localIterator.next()).a(m.this.ahZ);
      }
    }
  }
  
  private abstract class i
    implements Runnable
  {
    public i() {}
    
    protected abstract void ka();
    
    public void run()
    {
      m.this.ahN.lock();
      try
      {
        boolean bool = Thread.interrupted();
        if (bool) {
          return;
        }
        ka();
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        o localo = m.this.ahL;
        Message localMessage = localo.aiz.obtainMessage(4, localRuntimeException);
        localo.aiz.sendMessage(localMessage);
        return;
      }
      finally
      {
        m.this.ahN.unlock();
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */