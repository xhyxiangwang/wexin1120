package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.tp;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.o;
import java.util.ArrayList;
import java.util.List;

public final class f
{
  public MMActivity jFp;
  public int kjz;
  public com.tencent.mm.plugin.card.base.b kmJ;
  public List<com.tencent.mm.plugin.card.model.b> kmN;
  public com.tencent.mm.plugin.card.model.b kmO;
  public ArrayList<ji> kmP;
  
  public f(MMActivity paramMMActivity)
  {
    GMTrace.i(5126982991872L, 38199);
    this.kjz = 3;
    this.kmN = new ArrayList();
    this.jFp = paramMMActivity;
    GMTrace.o(5126982991872L, 38199);
  }
  
  public final com.tencent.mm.plugin.card.model.b ajj()
  {
    GMTrace.i(5127117209600L, 38200);
    com.tencent.mm.plugin.card.model.b localb = new com.tencent.mm.plugin.card.model.b();
    localb.knD = 1;
    boolean bool;
    if ((l.lL(this.kjz)) || (l.lM(this.kjz)) || (this.kjz == 23))
    {
      if ((!this.kmJ.isAcceptable()) || (this.kmJ.aiK().tFq == null) || (TextUtils.isEmpty(this.kmJ.aiK().tFq.text)) || (TextUtils.isEmpty(this.kmJ.aiK().tET))) {
        break label328;
      }
      bool = true;
      localb.knF = bool;
      if ((!localb.knF) && (!TextUtils.isEmpty(this.kmJ.aiK().tFj))) {
        break label394;
      }
      if (!o.fm(this.kmJ.aiK().tET)) {
        break label333;
      }
      localb.title = getString(R.l.dFN);
      localb.knF = false;
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(this.kmJ.aiK().tFl)) {
        localb.kns = this.kmJ.aiK().tFl;
      }
      localb.kqV = "";
      localb.url = "card://jump_service";
      this.kmO = localb;
      localb = this.kmO;
      GMTrace.o(5127117209600L, 38200);
      return localb;
      if ((this.kjz == 6) && (this.kmJ.aiH()) && (this.kmJ.aiK().tFq != null) && (!TextUtils.isEmpty(this.kmJ.aiK().tFq.text)) && (!TextUtils.isEmpty(this.kmJ.aiK().tET)))
      {
        bool = true;
        break;
      }
      label328:
      bool = false;
      break;
      label333:
      localb.title = getString(R.l.dFM);
      if ((this.kmJ.aiK().tFq != null) && (this.kmJ.aiK().tFq.tRK == 1))
      {
        localb.knG = true;
      }
      else
      {
        localb.knG = false;
        continue;
        label394:
        localb.title = this.kmJ.aiK().tFj;
      }
    }
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(5127385645056L, 38202);
    String str = this.jFp.getString(paramInt);
    GMTrace.o(5127385645056L, 38202);
    return str;
  }
  
  public final String getTitle()
  {
    GMTrace.i(5127251427328L, 38201);
    Object localObject = new StringBuilder();
    if (!TextUtils.isEmpty(this.kmJ.aiK().koC)) {
      ((StringBuilder)localObject).append(this.kmJ.aiK().koC);
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(5127251427328L, 38201);
      return (String)localObject;
      if (this.kmJ.air()) {
        ((StringBuilder)localObject).append(getString(R.l.cOu));
      } else if (this.kmJ.ais()) {
        ((StringBuilder)localObject).append(getString(R.l.cOa));
      } else if (this.kmJ.ait()) {
        ((StringBuilder)localObject).append(getString(R.l.dEO));
      } else if (this.kmJ.aiu()) {
        ((StringBuilder)localObject).append(getString(R.l.dFh));
      } else if (this.kmJ.aiv()) {
        ((StringBuilder)localObject).append(getString(R.l.cOo));
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */