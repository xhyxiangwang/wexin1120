package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.view.z;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.page.s;

public final class aa
{
  public boolean jDO;
  public boolean jDP;
  public boolean jDQ;
  public final a<s, e> jDR;
  public final a<s, q> jDS;
  public final s jlc;
  
  public aa(s params)
  {
    GMTrace.i(19865297485824L, 148008);
    this.jDO = false;
    this.jDP = false;
    this.jDQ = false;
    this.jDR = new a()
    {
      final boolean bY(View paramAnonymousView)
      {
        GMTrace.i(19882208919552L, 148134);
        if (paramAnonymousView.getId() == p.f.ito)
        {
          GMTrace.o(19882208919552L, 148134);
          return true;
        }
        GMTrace.o(19882208919552L, 148134);
        return false;
      }
    };
    this.jDS = new a()
    {
      final boolean bY(View paramAnonymousView)
      {
        GMTrace.i(19880598306816L, 148122);
        boolean bool = paramAnonymousView instanceof q;
        GMTrace.o(19880598306816L, 148122);
        return bool;
      }
    };
    this.jlc = params;
    GMTrace.o(19865297485824L, 148008);
  }
  
  private static abstract class a<Source extends View, Target extends View>
  {
    private Target mR;
    
    public a()
    {
      GMTrace.i(19880866742272L, 148124);
      GMTrace.o(19880866742272L, 148124);
    }
    
    abstract boolean bY(View paramView);
    
    abstract Target bZ(View paramView);
    
    public final Target ca(Source paramSource)
    {
      GMTrace.i(19881000960000L, 148125);
      if ((this.mR != null) && (z.al(this.mR)))
      {
        paramSource = this.mR;
        GMTrace.o(19881000960000L, 148125);
        return paramSource;
      }
      Object localObject = paramSource;
      if (!z.al(paramSource))
      {
        GMTrace.o(19881000960000L, 148125);
        return null;
      }
      do
      {
        localObject = (View)((View)localObject).getParent();
      } while ((localObject != null) && (!bY((View)localObject)));
      if (localObject == null)
      {
        GMTrace.o(19881000960000L, 148125);
        return null;
      }
      paramSource = bZ((View)localObject);
      this.mR = paramSource;
      GMTrace.o(19881000960000L, 148125);
      return paramSource;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */