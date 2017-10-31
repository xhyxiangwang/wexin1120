package com.tencent.mm.plugin.card.ui.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;

public final class h
  extends a
{
  public h(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
    GMTrace.i(4953976340480L, 36910);
    GMTrace.o(4953976340480L, 36910);
  }
  
  public final boolean alJ()
  {
    GMTrace.i(4954244775936L, 36912);
    ArrayList localArrayList = com.tencent.mm.plugin.card.sharecard.a.b.tK(this.kmJ.aiP());
    if (((!this.kuJ.knC) || (this.kuJ.kjz == 4)) && (!TextUtils.isEmpty(this.kmJ.aiQ())))
    {
      GMTrace.o(4954244775936L, 36912);
      return true;
    }
    if (((this.kuJ.knC) && (localArrayList != null) && (localArrayList.size() > 0)) || ((!TextUtils.isEmpty(this.kmJ.aiQ())) && (alK())))
    {
      GMTrace.o(4954244775936L, 36912);
      return true;
    }
    GMTrace.o(4954244775936L, 36912);
    return false;
  }
  
  public final boolean alK()
  {
    GMTrace.i(4954378993664L, 36913);
    if (this.kuJ.kjz == 3)
    {
      GMTrace.o(4954378993664L, 36913);
      return true;
    }
    GMTrace.o(4954378993664L, 36913);
    return false;
  }
  
  public final boolean alL()
  {
    GMTrace.i(4954513211392L, 36914);
    GMTrace.o(4954513211392L, 36914);
    return false;
  }
  
  public final boolean alN()
  {
    GMTrace.i(4954647429120L, 36915);
    boolean bool = this.kzo;
    GMTrace.o(4954647429120L, 36915);
    return bool;
  }
  
  public final boolean alO()
  {
    GMTrace.i(4955318517760L, 36920);
    GMTrace.o(4955318517760L, 36920);
    return false;
  }
  
  public final boolean alQ()
  {
    GMTrace.i(4954781646848L, 36916);
    GMTrace.o(4954781646848L, 36916);
    return false;
  }
  
  public final boolean alR()
  {
    GMTrace.i(4954915864576L, 36917);
    if ((this.kzo) && (super.alR()))
    {
      GMTrace.o(4954915864576L, 36917);
      return true;
    }
    GMTrace.o(4954915864576L, 36917);
    return false;
  }
  
  public final boolean alV()
  {
    GMTrace.i(4955050082304L, 36918);
    GMTrace.o(4955050082304L, 36918);
    return false;
  }
  
  public final boolean alW()
  {
    GMTrace.i(4955184300032L, 36919);
    GMTrace.o(4955184300032L, 36919);
    return false;
  }
  
  public final boolean alX()
  {
    GMTrace.i(4955452735488L, 36921);
    if (super.alX())
    {
      GMTrace.o(4955452735488L, 36921);
      return true;
    }
    if (alY())
    {
      GMTrace.o(4955452735488L, 36921);
      return true;
    }
    if ((this.kmJ.aiq()) && (this.kzo))
    {
      GMTrace.o(4955452735488L, 36921);
      return true;
    }
    GMTrace.o(4955452735488L, 36921);
    return false;
  }
  
  public final boolean alY()
  {
    GMTrace.i(4955586953216L, 36922);
    if ((!this.kzo) && (this.kmJ.aiK().tFt == 1))
    {
      GMTrace.o(4955586953216L, 36922);
      return true;
    }
    GMTrace.o(4955586953216L, 36922);
    return false;
  }
  
  protected final void alz()
  {
    GMTrace.i(4954110558208L, 36911);
    super.alz();
    GMTrace.o(4954110558208L, 36911);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */