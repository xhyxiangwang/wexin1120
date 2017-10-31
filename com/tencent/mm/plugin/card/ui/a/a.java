package com.tencent.mm.plugin.card.ui.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.protocal.c.pd;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.m;
import java.util.LinkedList;

public class a
  implements g
{
  protected MMActivity jFp;
  protected b kmJ;
  protected e.a kuJ;
  boolean kzo;
  private boolean kzp;
  private boolean kzq;
  private boolean kzr;
  private boolean kzs;
  private boolean kzt;
  private boolean kzu;
  private boolean kzv;
  private boolean kzw;
  private boolean kzx;
  
  public a(MMActivity paramMMActivity)
  {
    GMTrace.i(4948741849088L, 36871);
    this.kzo = false;
    this.kzp = false;
    this.kzq = false;
    this.kzr = false;
    this.kzs = false;
    this.kzt = false;
    this.kzu = false;
    this.kzv = false;
    this.kzw = false;
    this.kzx = false;
    this.jFp = paramMMActivity;
    GMTrace.o(4948741849088L, 36871);
  }
  
  private boolean alw()
  {
    GMTrace.i(4949681373184L, 36878);
    if (!TextUtils.isEmpty(this.kmJ.aiL().code))
    {
      GMTrace.o(4949681373184L, 36878);
      return true;
    }
    GMTrace.o(4949681373184L, 36878);
    return false;
  }
  
  private String getString(int paramInt)
  {
    GMTrace.i(4949278720000L, 36875);
    String str = this.jFp.getString(paramInt);
    GMTrace.o(4949278720000L, 36875);
    return str;
  }
  
  public final void a(b paramb, e.a parama)
  {
    GMTrace.i(4948876066816L, 36872);
    this.kmJ = paramb;
    this.kuJ = parama;
    alz();
    GMTrace.o(4948876066816L, 36872);
  }
  
  public final boolean akZ()
  {
    GMTrace.i(4950218244096L, 36882);
    boolean bool = this.kzo;
    GMTrace.o(4950218244096L, 36882);
    return bool;
  }
  
  public boolean alA()
  {
    GMTrace.i(4950352461824L, 36883);
    boolean bool = this.kzp;
    GMTrace.o(4950352461824L, 36883);
    return bool;
  }
  
  public final boolean alB()
  {
    GMTrace.i(4950486679552L, 36884);
    boolean bool = this.kzq;
    GMTrace.o(4950486679552L, 36884);
    return bool;
  }
  
  public final boolean alC()
  {
    GMTrace.i(4950620897280L, 36885);
    boolean bool = this.kzr;
    GMTrace.o(4950620897280L, 36885);
    return bool;
  }
  
  public final boolean alD()
  {
    GMTrace.i(4950755115008L, 36886);
    boolean bool = this.kzs;
    GMTrace.o(4950755115008L, 36886);
    return bool;
  }
  
  public final boolean alE()
  {
    GMTrace.i(4950889332736L, 36887);
    boolean bool = this.kzt;
    GMTrace.o(4950889332736L, 36887);
    return bool;
  }
  
  public final boolean alF()
  {
    GMTrace.i(4951023550464L, 36888);
    boolean bool = this.kzv;
    GMTrace.o(4951023550464L, 36888);
    return bool;
  }
  
  public final boolean alG()
  {
    GMTrace.i(4951157768192L, 36889);
    boolean bool = this.kzw;
    GMTrace.o(4951157768192L, 36889);
    return bool;
  }
  
  public final boolean alH()
  {
    GMTrace.i(4951291985920L, 36890);
    boolean bool = this.kzx;
    GMTrace.o(4951291985920L, 36890);
    return bool;
  }
  
  public boolean alI()
  {
    GMTrace.i(4951426203648L, 36891);
    GMTrace.o(4951426203648L, 36891);
    return true;
  }
  
  public boolean alJ()
  {
    GMTrace.i(4951560421376L, 36892);
    GMTrace.o(4951560421376L, 36892);
    return false;
  }
  
  public boolean alK()
  {
    GMTrace.i(4951694639104L, 36893);
    GMTrace.o(4951694639104L, 36893);
    return false;
  }
  
  public boolean alL()
  {
    GMTrace.i(4951828856832L, 36894);
    if (((this.kuJ.kjz == 6) && ((!this.kmJ.aiG()) || (this.kmJ.aiH()))) || (this.kuJ.kjz == 5) || ((this.kuJ.kjz == 23) && (this.kmJ.aiJ())))
    {
      GMTrace.o(4951828856832L, 36894);
      return true;
    }
    GMTrace.o(4951828856832L, 36894);
    return false;
  }
  
  public boolean alM()
  {
    GMTrace.i(4951963074560L, 36895);
    GMTrace.o(4951963074560L, 36895);
    return false;
  }
  
  public boolean alN()
  {
    GMTrace.i(4952097292288L, 36896);
    GMTrace.o(4952097292288L, 36896);
    return true;
  }
  
  public boolean alO()
  {
    GMTrace.i(4952231510016L, 36897);
    if (((alw()) && (alu()) && (alv())) || (this.kzo))
    {
      GMTrace.o(4952231510016L, 36897);
      return true;
    }
    GMTrace.o(4952231510016L, 36897);
    return false;
  }
  
  public boolean alP()
  {
    GMTrace.i(4952365727744L, 36898);
    GMTrace.o(4952365727744L, 36898);
    return false;
  }
  
  public boolean alQ()
  {
    GMTrace.i(4952499945472L, 36899);
    if (!this.kmJ.aiG())
    {
      GMTrace.o(4952499945472L, 36899);
      return true;
    }
    GMTrace.o(4952499945472L, 36899);
    return false;
  }
  
  public boolean alR()
  {
    GMTrace.i(4952634163200L, 36900);
    if ((this.kmJ.aiK().tFo != null) && (this.kmJ.aiK().tFo.tKV != null) && (this.kmJ.aiK().tFo.tKV.size() > 0) && (!TextUtils.isEmpty((CharSequence)this.kmJ.aiK().tFo.tKV.get(0))))
    {
      GMTrace.o(4952634163200L, 36900);
      return true;
    }
    GMTrace.o(4952634163200L, 36900);
    return false;
  }
  
  public boolean alS()
  {
    GMTrace.i(4952768380928L, 36901);
    if ((this.kmJ.aiL().tEu != null) && (this.kmJ.aiL().tEu.size() > 0) && (((alu()) && (alv())) || (this.kzo)))
    {
      GMTrace.o(4952768380928L, 36901);
      return true;
    }
    GMTrace.o(4952768380928L, 36901);
    return false;
  }
  
  public boolean alT()
  {
    GMTrace.i(4952902598656L, 36902);
    GMTrace.o(4952902598656L, 36902);
    return false;
  }
  
  public final boolean alU()
  {
    GMTrace.i(4953036816384L, 36903);
    if ((this.kmJ.aiL().tEy != null) && (!TextUtils.isEmpty(this.kmJ.aiL().tEy.title)))
    {
      GMTrace.o(4953036816384L, 36903);
      return true;
    }
    GMTrace.o(4953036816384L, 36903);
    return false;
  }
  
  public boolean alV()
  {
    GMTrace.i(4953171034112L, 36904);
    if ((this.kmJ.aiL().tEB != null) && (!TextUtils.isEmpty(this.kmJ.aiL().tEB.title)))
    {
      GMTrace.o(4953171034112L, 36904);
      return true;
    }
    GMTrace.o(4953171034112L, 36904);
    return false;
  }
  
  public boolean alW()
  {
    GMTrace.i(4953305251840L, 36905);
    if (this.kmJ.aiK().tFk != null)
    {
      GMTrace.o(4953305251840L, 36905);
      return true;
    }
    GMTrace.o(4953305251840L, 36905);
    return false;
  }
  
  public boolean alX()
  {
    GMTrace.i(4953439469568L, 36906);
    if (!TextUtils.isEmpty(this.kmJ.aiK().tFh))
    {
      GMTrace.o(4953439469568L, 36906);
      return true;
    }
    GMTrace.o(4953439469568L, 36906);
    return false;
  }
  
  public boolean alY()
  {
    GMTrace.i(4953573687296L, 36907);
    GMTrace.o(4953573687296L, 36907);
    return false;
  }
  
  public boolean alZ()
  {
    GMTrace.i(4953707905024L, 36908);
    GMTrace.o(4953707905024L, 36908);
    return false;
  }
  
  public final String alt()
  {
    GMTrace.i(4949144502272L, 36874);
    String str = "";
    if (!TextUtils.isEmpty(this.kmJ.aiK().tFu)) {
      str = this.kmJ.aiK().tFu;
    }
    for (;;)
    {
      GMTrace.o(4949144502272L, 36874);
      return str;
      if (this.kmJ.aiL().tEv == 0L) {
        str = getString(R.l.dFT);
      } else if (this.kmJ.aiL().tEw == 0) {
        if (!TextUtils.isEmpty(this.kmJ.aiK().tFb)) {
          str = this.kmJ.aiK().tFb;
        } else {
          str = getString(R.l.dED);
        }
      }
    }
  }
  
  public final boolean alu()
  {
    GMTrace.i(4949412937728L, 36876);
    if ((this.kmJ.aiL().status == 0) || (this.kmJ.aiL().status == 1) || (this.kmJ.aiL().status == 2))
    {
      GMTrace.o(4949412937728L, 36876);
      return true;
    }
    GMTrace.o(4949412937728L, 36876);
    return false;
  }
  
  public final boolean alv()
  {
    GMTrace.i(4949547155456L, 36877);
    if ((this.kuJ.kjz == 3) || ((this.kuJ.kjz == 6) && (this.kmJ.aiL().tEs == 0)) || (this.kuJ.kjz == 4) || (this.kuJ.kjz == 5) || (this.kuJ.kjz == 15))
    {
      GMTrace.o(4949547155456L, 36877);
      return true;
    }
    GMTrace.o(4949547155456L, 36877);
    return false;
  }
  
  protected final boolean alx()
  {
    GMTrace.i(4949815590912L, 36879);
    if ((!this.kmJ.isAcceptable()) && ((l.lL(this.kuJ.kjz)) || (l.lM(this.kuJ.kjz)) || (this.kuJ.kjz == 23)))
    {
      GMTrace.o(4949815590912L, 36879);
      return true;
    }
    GMTrace.o(4949815590912L, 36879);
    return false;
  }
  
  protected final boolean aly()
  {
    GMTrace.i(4949949808640L, 36880);
    if ((!this.kmJ.aiH()) && (this.kuJ.kjz == 6))
    {
      GMTrace.o(4949949808640L, 36880);
      return true;
    }
    GMTrace.o(4949949808640L, 36880);
    return false;
  }
  
  protected void alz()
  {
    GMTrace.i(4950084026368L, 36881);
    w.i("MicroMsg.CardBaseShowLogic", "updateAcceptState()");
    if ((l.lL(this.kuJ.kjz)) || (l.lM(this.kuJ.kjz))) {
      if (this.kmJ.isAcceptable())
      {
        this.kzp = true;
        this.kzq = true;
        this.kzv = true;
        this.kzt = true;
        this.kzu = true;
        if (!this.kmJ.aiF()) {
          break label585;
        }
        this.kzp = false;
        this.kzq = false;
        w.i("MicroMsg.CardBaseShowLogic", "need direct jump!");
        label112:
        if (!this.kzo) {
          break label597;
        }
        this.kzp = false;
        this.kzq = false;
        w.i("MicroMsg.CardBaseShowLogic", "updateAcceptView to gone!");
      }
    }
    for (;;)
    {
      w.i("MicroMsg.CardBaseShowLogic", "mIsAcceptedCard:" + this.kzo);
      GMTrace.o(4950084026368L, 36881);
      return;
      if (!this.kmJ.isAcceptable())
      {
        this.kzp = true;
        this.kzq = false;
        if (this.kmJ.aiF())
        {
          this.kzw = true;
          this.kzt = true;
          this.kzs = true;
        }
        for (;;)
        {
          this.kzu = true;
          break;
          this.kzt = false;
        }
      }
      this.kzp = false;
      this.kzq = false;
      this.kzt = false;
      break;
      if (this.kuJ.kjz == 6)
      {
        if (this.kmJ.aiH())
        {
          this.kzp = true;
          this.kzq = true;
          this.kzt = false;
          break;
        }
        if (this.kmJ.aiG())
        {
          this.kzw = true;
          this.kzt = true;
          this.kzr = true;
          this.kzs = true;
          break;
        }
        this.kzp = false;
        this.kzq = false;
        this.kzt = false;
        this.kzr = true;
        break;
      }
      if (l.lN(this.kuJ.kjz))
      {
        this.kzp = false;
        this.kzq = false;
        this.kzr = true;
        if (this.kmJ.aiG())
        {
          this.kzw = true;
          this.kzt = true;
          this.kzs = true;
          break;
        }
        this.kzx = true;
        break;
      }
      if (this.kuJ.kjz != 23) {
        break;
      }
      if (this.kmJ.isAcceptable())
      {
        this.kzp = true;
        this.kzq = true;
        this.kzt = false;
      }
      for (this.kzu = true;; this.kzu = true)
      {
        if ((TextUtils.isEmpty(this.kuJ.ktT)) || (this.kuJ.ktT.equals(m.zF())) || (this.kmJ.aiJ())) {
          break label583;
        }
        w.i("MicroMsg.CardBaseShowLogic", " detail page");
        this.kzp = false;
        this.kzq = false;
        this.kzr = true;
        if (!this.kmJ.aiG()) {
          break;
        }
        this.kzw = true;
        this.kzt = true;
        this.kzs = true;
        break;
        this.kzp = true;
        this.kzq = false;
        this.kzt = false;
      }
      label583:
      break;
      label585:
      w.i("MicroMsg.CardBaseShowLogic", "not need direct jump!");
      break label112;
      label597:
      if (!this.kzp)
      {
        this.kzo = true;
        w.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is true");
      }
      else
      {
        this.kzo = false;
        w.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is false!");
      }
    }
  }
  
  public final void ama()
  {
    int i6 = 1;
    GMTrace.i(4953842122752L, 36909);
    int i;
    String str;
    int j;
    label36:
    int k;
    label45:
    int m;
    label55:
    int n;
    label65:
    int i1;
    label75:
    int i2;
    label85:
    int i3;
    label95:
    int i4;
    label105:
    int i5;
    if (alw())
    {
      i = 1;
      str = alt();
      if (!this.kzo) {
        break label247;
      }
      j = 1;
      if (!alA()) {
        break label252;
      }
      k = 1;
      if (!this.kzq) {
        break label257;
      }
      m = 1;
      if (!this.kzr) {
        break label263;
      }
      n = 1;
      if (!this.kzs) {
        break label269;
      }
      i1 = 1;
      if (!this.kzt) {
        break label275;
      }
      i2 = 1;
      if (!this.kzu) {
        break label281;
      }
      i3 = 1;
      if (!this.kzv) {
        break label287;
      }
      i4 = 1;
      if (!this.kzw) {
        break label293;
      }
      i5 = 1;
      label115:
      if (!this.kzx) {
        break label299;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.CardBaseShowLogic", "printStatus, isValidCode:%d, getUnacceptWording:%s, isAcceptedCard:%d, acceptViewVisible:%d, acceptViewEnabled:%d, isShowConsumedBtn:%d, isConsumedBtnEnabled:%d, enableOptionMenu:%d, isShareLogoVisible:%d, addShareMenu:%d, addMenu:%d, addInvalidCardMenu:%d ", new Object[] { Integer.valueOf(i), str, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6) });
      GMTrace.o(4953842122752L, 36909);
      return;
      i = 0;
      break;
      label247:
      j = 0;
      break label36;
      label252:
      k = 0;
      break label45;
      label257:
      m = 0;
      break label55;
      label263:
      n = 0;
      break label65;
      label269:
      i1 = 0;
      break label75;
      label275:
      i2 = 0;
      break label85;
      label281:
      i3 = 0;
      break label95;
      label287:
      i4 = 0;
      break label105;
      label293:
      i5 = 0;
      break label115;
      label299:
      i6 = 0;
    }
  }
  
  public final void release()
  {
    GMTrace.i(4949010284544L, 36873);
    this.kmJ = null;
    this.kuJ = null;
    this.jFp = null;
    GMTrace.o(4949010284544L, 36873);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */