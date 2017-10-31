package com.tencent.mm.plugin.card.a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class d
  implements e, k.a, com.tencent.mm.plugin.card.base.d
{
  public WeakReference<Context> YB;
  public HashMap<a, Boolean> kmG;
  public HashMap<String, Boolean> kmH;
  public HashMap<String, Boolean> kmI;
  public com.tencent.mm.plugin.card.base.b kmJ;
  public boolean kmK;
  public String kmL;
  public List<WeakReference<a>> kmu;
  
  public d()
  {
    GMTrace.i(5121748500480L, 38160);
    this.kmu = new ArrayList();
    this.kmG = new HashMap();
    this.kmH = new HashMap();
    this.kmI = new HashMap();
    this.kmJ = null;
    this.kmK = false;
    GMTrace.o(5121748500480L, 38160);
  }
  
  private void ajd()
  {
    GMTrace.i(5123493330944L, 38173);
    w.i("MicroMsg.CardConsumedMgr", "doVibrate()");
    if (this.kmu == null)
    {
      GMTrace.o(5123493330944L, 38173);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).ajh();
        }
      }
      i += 1;
    }
    GMTrace.o(5123493330944L, 38173);
  }
  
  private void aje()
  {
    GMTrace.i(5123627548672L, 38174);
    w.i("MicroMsg.CardConsumedMgr", "doFinishUI()");
    if (this.kmu == null)
    {
      GMTrace.o(5123627548672L, 38174);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).aji();
        }
      }
      i += 1;
    }
    GMTrace.o(5123627548672L, 38174);
  }
  
  private void ajf()
  {
    GMTrace.i(5123761766400L, 38175);
    w.i("MicroMsg.CardConsumedMgr", "needDoConsumedInfo(), need to do NetSceneGetShareCardConsumedInfo. ");
    ajg();
    GMTrace.o(5123761766400L, 38175);
  }
  
  /* Error */
  private void ajg()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 116
    //   5: ldc 118
    //   7: invokestatic 44	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 62	com/tencent/mm/plugin/card/a/d:kmK	Z
    //   14: ifeq +21 -> 35
    //   17: ldc 72
    //   19: ldc 120
    //   21: invokestatic 79	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: ldc2_w 116
    //   27: ldc 118
    //   29: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: ldc 72
    //   37: ldc 122
    //   39: invokestatic 79	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: aload_0
    //   43: iconst_1
    //   44: putfield 62	com/tencent/mm/plugin/card/a/d:kmK	Z
    //   47: new 124	com/tencent/mm/plugin/card/sharecard/model/d
    //   50: dup
    //   51: aload_0
    //   52: getfield 60	com/tencent/mm/plugin/card/a/d:kmJ	Lcom/tencent/mm/plugin/card/base/b;
    //   55: invokeinterface 130 1 0
    //   60: ldc -124
    //   62: ldc -124
    //   64: invokespecial 135	com/tencent/mm/plugin/card/sharecard/model/d:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   67: astore_1
    //   68: invokestatic 141	com/tencent/mm/x/ap:wT	()Lcom/tencent/mm/ac/n;
    //   71: aload_1
    //   72: iconst_0
    //   73: invokevirtual 146	com/tencent/mm/ac/n:a	(Lcom/tencent/mm/ac/k;I)Z
    //   76: pop
    //   77: ldc2_w 116
    //   80: ldc 118
    //   82: invokestatic 65	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   85: goto -53 -> 32
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	d
    //   67	5	1	locald	com.tencent.mm.plugin.card.sharecard.model.d
    //   88	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	32	88	finally
    //   35	85	88	finally
  }
  
  private void e(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5123359113216L, 38172);
    w.i("MicroMsg.CardConsumedMgr", "doUpdateCardInfo()");
    if (this.kmu == null)
    {
      GMTrace.o(5123359113216L, 38172);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).f(paramb);
        }
      }
      i += 1;
    }
    GMTrace.o(5123359113216L, 38172);
  }
  
  private void ts(String paramString)
  {
    GMTrace.i(5123224895488L, 38171);
    w.i("MicroMsg.CardConsumedMgr", "startConsumedSuccUI()");
    if (this.kmu == null)
    {
      GMTrace.o(5123224895488L, 38171);
      return;
    }
    int j = 0;
    int i = 0;
    Object localObject;
    if (j < this.kmu.size())
    {
      localObject = (WeakReference)this.kmu.get(j);
      if (localObject == null) {
        break label229;
      }
      localObject = (a)((WeakReference)localObject).get();
      Boolean localBoolean = (Boolean)this.kmG.get(localObject);
      if ((localObject == null) || (localBoolean == null) || (!localBoolean.booleanValue())) {
        break label229;
      }
      ((a)localObject).tt(paramString);
      i = 1;
    }
    label229:
    for (;;)
    {
      j += 1;
      break;
      localObject = (Boolean)this.kmH.get(this.kmJ.aiO());
      if (i != 0)
      {
        w.i("MicroMsg.CardConsumedMgr", "onStartConsumedSuccUI is handled!");
        this.kmL = "";
        GMTrace.o(5123224895488L, 38171);
        return;
      }
      if ((localObject != null) && (((Boolean)localObject).booleanValue()))
      {
        w.i("MicroMsg.CardConsumedMgr", "add to launch pending list!");
        this.kmL = paramString;
        this.kmI.put(this.kmJ.aiO(), Boolean.valueOf(true));
      }
      GMTrace.o(5123224895488L, 38171);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(5123090677760L, 38170);
    w.i("MicroMsg.CardConsumedMgr", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.d))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.d)paramk;
        if (!TextUtils.isEmpty(paramString.kpq)) {
          ts(paramString.kpq);
        }
        for (;;)
        {
          this.kmK = false;
          w.e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo ok! finish UI!");
          aje();
          GMTrace.o(5123090677760L, 38170);
          return;
          w.e("MicroMsg.CardConsumedMgr", "consumed return json is empty!");
        }
      }
    }
    else if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.d))
    {
      this.kmK = false;
      w.e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo failed! finish UI!");
      aje();
      GMTrace.o(5123090677760L, 38170);
      return;
    }
    GMTrace.o(5123090677760L, 38170);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(5122016935936L, 38162);
    if (this.kmu == null) {
      this.kmu = new ArrayList();
    }
    if (parama != null) {
      this.kmu.add(new WeakReference(parama));
    }
    GMTrace.o(5122016935936L, 38162);
  }
  
  public final void a(a parama, boolean paramBoolean)
  {
    GMTrace.i(5122419589120L, 38165);
    if (this.kmG == null) {
      this.kmG = new HashMap();
    }
    this.kmG.put(parama, Boolean.valueOf(paramBoolean));
    GMTrace.o(5122419589120L, 38165);
  }
  
  public final void a(com.tencent.mm.plugin.card.model.g paramg)
  {
    GMTrace.i(5122956460032L, 38169);
    w.i("MicroMsg.CardConsumedMgr", "onChange()");
    w.i("MicroMsg.CardConsumedMgr", "card msg card id is " + paramg.field_card_id);
    if (this.kmJ == null)
    {
      w.e("MicroMsg.CardConsumedMgr", "onChange(), do nothing, mCardInfo == null");
      aje();
      GMTrace.o(5122956460032L, 38169);
      return;
    }
    w.i("MicroMsg.CardConsumedMgr", "card msg card id is " + paramg.field_card_id);
    if ((this.kmJ.aip()) && (paramg.field_card_id != null) && (paramg.field_card_id.equals(this.kmJ.aiO())) && (paramg.koV == 3))
    {
      w.i("MicroMsg.CardConsumedMgr", "it is card type, don't do NetSceneGetShareCardConsumedInfo! finish UI");
      aje();
      GMTrace.o(5122956460032L, 38169);
      return;
    }
    if (!this.kmJ.aiq())
    {
      w.i("MicroMsg.CardConsumedMgr", "it is not card type, don't update share card data!");
      aje();
      GMTrace.o(5122956460032L, 38169);
      return;
    }
    int i;
    Object localObject;
    if ((paramg.koV == 3) || ((paramg.field_card_id != null) && (paramg.field_card_id.equals(this.kmJ.aiO())) && (!TextUtils.isEmpty(paramg.field_consumed_box_id))))
    {
      long l1 = System.currentTimeMillis();
      w.i("MicroMsg.CardConsumedMgr", "consumed share card msg,  update share card data!");
      if ((paramg.field_card_id == null) || (!paramg.field_card_id.equals(this.kmJ.aiO()))) {
        break label678;
      }
      paramg = al.ajK().tR(this.kmJ.aiO());
      if ((paramg != null) && (paramg.aiL() != null))
      {
        i = this.kmJ.aiL().status;
        w.d("MicroMsg.CardConsumedMgr", "onChange() current oldState %s, newStatus %s, shareCardStatus %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramg.aiL().status), Integer.valueOf(((ShareCardInfo)this.kmJ).field_status) });
        if (paramg.aiL().status == i) {
          break label604;
        }
        ajd();
      }
      e(this.kmJ);
      paramg = (Boolean)this.kmH.get(this.kmJ.aiO());
      if ((paramg != null) && (paramg.booleanValue())) {
        break label795;
      }
      paramg = (Context)this.YB.get();
      w.i("MicroMsg.CardConsumedMgr", "consume share card, card id is " + this.kmJ.aiO());
      com.tencent.mm.plugin.card.sharecard.a.b.a(paramg, this.kmJ);
      this.kmH.put(this.kmJ.aiO(), Boolean.valueOf(true));
      long l2 = System.currentTimeMillis();
      paramg = new ArrayList();
      localObject = new IDKey();
      ((IDKey)localObject).SetID(281);
      ((IDKey)localObject).SetKey(30);
      ((IDKey)localObject).SetValue(1L);
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(281);
      localIDKey.SetKey(31);
      localIDKey.SetValue((int)(l2 - l1));
      paramg.add(localObject);
      paramg.add(localIDKey);
      com.tencent.mm.plugin.report.service.g.paX.b(paramg, true);
    }
    for (;;)
    {
      ajf();
      GMTrace.o(5122956460032L, 38169);
      return;
      label604:
      if (i == 1) {
        break;
      }
      w.i("MicroMsg.CardConsumedMgr", "share card oldState status is " + i);
      paramg = this.kmJ.aiL();
      paramg.status = 1;
      ((ShareCardInfo)this.kmJ).field_status = 1;
      this.kmJ.a(paramg);
      l.j(this.kmJ);
      break;
      label678:
      if (paramg.field_card_id == null) {
        break;
      }
      paramg = al.ajK().tR(paramg.field_card_id);
      if ((paramg != null) && (paramg.aiL() != null))
      {
        w.d("MicroMsg.CardConsumedMgr", "onChange() not current oldState %s,shareCardStatus %s", new Object[] { Integer.valueOf(paramg.aiL().status), Integer.valueOf(paramg.field_status) });
        if (paramg.aiL().status == 1) {
          break;
        }
        localObject = paramg.aiL();
        ((jf)localObject).status = 1;
        paramg.field_status = 1;
        paramg.a((jf)localObject);
        l.j(paramg);
        break;
      }
      w.w("MicroMsg.CardConsumedMgr", "tempCard is null");
      break;
      label795:
      w.i("MicroMsg.CardConsumedMgr", "consumed:" + paramg.booleanValue());
    }
  }
  
  public final void ahA()
  {
    GMTrace.i(5122822242304L, 38168);
    ajd();
    GMTrace.o(5122822242304L, 38168);
  }
  
  public final void aiV()
  {
    GMTrace.i(5122688024576L, 38167);
    w.i("MicroMsg.CardConsumedMgr", "onDBchange()");
    if (this.kmJ == null)
    {
      w.e("MicroMsg.CardConsumedMgr", "onDBchange(), do nothing, mCardInfo == null");
      GMTrace.o(5122688024576L, 38167);
      return;
    }
    Object localObject1;
    label228:
    Object localObject2;
    if (this.kmJ.aiq())
    {
      localObject1 = al.ajK().tR(this.kmJ.aiO());
      if ((localObject1 != null) && (((com.tencent.mm.plugin.card.base.b)localObject1).aiL() != null) && (this.kmJ != null) && (this.kmJ.aiL() != null))
      {
        int i = this.kmJ.aiL().status;
        w.d("MicroMsg.CardConsumedMgr", "onDBchange() oldState %s, newStatus %s, isDoingConsumedInfo %s, isShareCard %s", new Object[] { Integer.valueOf(i), Integer.valueOf(((com.tencent.mm.plugin.card.base.b)localObject1).aiL().status), Boolean.valueOf(this.kmK), Boolean.valueOf(this.kmJ.aiq()) });
        if ((!this.kmJ.aiq()) || (!(this.kmJ instanceof ShareCardInfo))) {
          break label565;
        }
        w.d("MicroMsg.CardConsumedMgr", "onDBchange() shareCardState %s", new Object[] { Integer.valueOf(((ShareCardInfo)this.kmJ).field_status) });
        if (((com.tencent.mm.plugin.card.base.b)localObject1).aiL().status != i)
        {
          ajd();
          if ((!this.kmJ.aiq()) || (this.kmK) || (((com.tencent.mm.plugin.card.base.b)localObject1).aiL().status != 1)) {
            break label617;
          }
          w.i("MicroMsg.CardConsumedMgr", "onDBchange(), need to get the consumedinfo , don't finish UI!");
          localObject2 = (Boolean)this.kmH.get(this.kmJ.aiO());
          if ((localObject2 != null) && (((Boolean)localObject2).booleanValue())) {
            break label588;
          }
          w.i("MicroMsg.CardConsumedMgr", "consumed is null or consumed is false!");
          long l1 = System.currentTimeMillis();
          localObject2 = (Context)this.YB.get();
          w.i("MicroMsg.CardConsumedMgr", "consume share card, card id is " + this.kmJ.aiO());
          com.tencent.mm.plugin.card.sharecard.a.b.a((Context)localObject2, this.kmJ);
          this.kmH.put(this.kmJ.aiO(), Boolean.valueOf(true));
          long l2 = System.currentTimeMillis();
          localObject2 = new ArrayList();
          IDKey localIDKey1 = new IDKey();
          localIDKey1.SetID(281);
          localIDKey1.SetKey(30);
          localIDKey1.SetValue(1L);
          IDKey localIDKey2 = new IDKey();
          localIDKey2.SetID(281);
          localIDKey2.SetKey(31);
          localIDKey2.SetValue((int)(l2 - l1));
          ((ArrayList)localObject2).add(localIDKey1);
          ((ArrayList)localObject2).add(localIDKey2);
          com.tencent.mm.plugin.report.service.g.paX.b((ArrayList)localObject2, true);
          label509:
          ajf();
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.CardConsumedMgr", "onDBchange(),card coupon is consumde success!");
      this.kmJ = ((com.tencent.mm.plugin.card.base.b)localObject1);
      e(this.kmJ);
      GMTrace.o(5122688024576L, 38167);
      return;
      localObject1 = al.ajC().tB(this.kmJ.aiO());
      break;
      label565:
      if (!this.kmJ.aiq()) {
        break label228;
      }
      w.e("MicroMsg.CardConsumedMgr", "onDBchange() mCardInfo is ShareCard, but not the ShareCardInfo instance!");
      break label228;
      label588:
      w.i("MicroMsg.CardConsumedMgr", "consumed:" + ((Boolean)localObject2).booleanValue());
      break label509;
      label617:
      if ((this.kmJ.aiq()) && (this.kmK))
      {
        w.i("MicroMsg.CardConsumedMgr", "onDBchange(), is getting the consumedinfo!");
      }
      else
      {
        w.i("MicroMsg.CardConsumedMgr", "onDBchange(),finish CardConsumeCodeUI!");
        aje();
      }
    }
  }
  
  public final void b(a parama)
  {
    GMTrace.i(5122151153664L, 38163);
    if ((this.kmu == null) || (parama == null))
    {
      GMTrace.o(5122151153664L, 38163);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      WeakReference localWeakReference = (WeakReference)this.kmu.get(i);
      if (localWeakReference != null)
      {
        a locala = (a)localWeakReference.get();
        if ((locala != null) && (locala.equals(parama)))
        {
          this.kmu.remove(localWeakReference);
          GMTrace.o(5122151153664L, 38163);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(5122151153664L, 38163);
  }
  
  public final void c(a parama)
  {
    GMTrace.i(5122553806848L, 38166);
    if (this.kmG == null) {
      this.kmG = new HashMap();
    }
    this.kmG.remove(parama);
    GMTrace.o(5122553806848L, 38166);
  }
  
  public final void d(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5122285371392L, 38164);
    this.kmJ = paramb;
    if ((this.kmK) && (this.kmJ != null) && (paramb.aiO() != null) && (!paramb.aiO().equals(this.kmJ.aiO()))) {
      this.kmK = false;
    }
    if (this.kmu == null)
    {
      GMTrace.o(5122285371392L, 38164);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        Boolean localBoolean = (Boolean)this.kmG.get(localObject);
        if ((localObject != null) && (localBoolean != null) && (!localBoolean.booleanValue())) {
          ((a)localObject).f(paramb);
        }
      }
      i += 1;
    }
    GMTrace.o(5122285371392L, 38164);
  }
  
  public final void release()
  {
    GMTrace.i(5121882718208L, 38161);
    ap.wT().b(910, this);
    al.ajJ().b(this);
    b localb = al.ajB();
    if ((localb.kmu == null) || (this == null)) {}
    label154:
    for (;;)
    {
      this.kmu.clear();
      this.kmG.clear();
      this.kmI.clear();
      this.kmK = false;
      GMTrace.o(5121882718208L, 38161);
      return;
      int i = 0;
      for (;;)
      {
        if (i >= localb.kmu.size()) {
          break label154;
        }
        WeakReference localWeakReference = (WeakReference)localb.kmu.get(i);
        if (localWeakReference != null)
        {
          com.tencent.mm.plugin.card.base.d locald = (com.tencent.mm.plugin.card.base.d)localWeakReference.get();
          if ((locald != null) && (locald.equals(this)))
          {
            localb.kmu.remove(localWeakReference);
            break;
          }
        }
        i += 1;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void ajh();
    
    public abstract void aji();
    
    public abstract void f(com.tencent.mm.plugin.card.base.b paramb);
    
    public abstract void tt(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */