package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class i
{
  protected int backgroundColor;
  public Context context;
  protected View iiK;
  private long jor;
  protected int kic;
  protected int kid;
  protected p qpH;
  private int qpI;
  private long qpJ;
  boolean qpK;
  protected ViewGroup qpL;
  
  public i(Context paramContext, p paramp, ViewGroup paramViewGroup)
  {
    GMTrace.i(8239626321920L, 61390);
    this.qpI = 0;
    this.qpJ = 0L;
    this.jor = 0L;
    this.qpK = false;
    this.iiK = null;
    this.context = paramContext;
    this.qpH = paramp;
    this.qpL = paramViewGroup;
    paramContext = ab.de(paramContext);
    this.kic = paramContext[0];
    this.kid = paramContext[1];
    GMTrace.o(8239626321920L, 61390);
  }
  
  private int getGravity()
  {
    GMTrace.i(8241908023296L, 61407);
    int i = 0;
    switch (this.qpH.qnx)
    {
    default: 
      switch (this.qpH.qny)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(8241908023296L, 61407);
      return i;
      i = 80;
      break;
      i = 16;
      break;
      i = 48;
      break;
      i |= 0x1;
      continue;
      i |= 0x3;
      continue;
      i |= 0x5;
    }
  }
  
  public void I(Map<String, Object> paramMap)
  {
    GMTrace.i(20065281900544L, 149498);
    GMTrace.o(20065281900544L, 149498);
  }
  
  public boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8241505370112L, 61404);
    if (this.jor == 0L)
    {
      GMTrace.o(8241505370112L, 61404);
      return false;
    }
    if (this.qpH.qnA)
    {
      GMTrace.o(8241505370112L, 61404);
      return false;
    }
    try
    {
      paramJSONObject.put("cid", this.qpH.qno);
      paramJSONObject.put("exposureCount", this.qpI);
      paramJSONObject.put("stayTime", this.jor);
      GMTrace.o(8241505370112L, 61404);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.Sns.AdLandingPageBaseComponent", paramJSONObject, "", new Object[0]);
      GMTrace.o(8241505370112L, 61404);
    }
    return false;
  }
  
  public void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8241102716928L, 61401);
    GMTrace.o(8241102716928L, 61401);
  }
  
  public final void a(p paramp)
  {
    GMTrace.i(8239760539648L, 61391);
    p localp = this.qpH;
    if (localp == paramp)
    {
      GMTrace.o(8239760539648L, 61391);
      return;
    }
    if ((localp != null) && (localp.equals(paramp)))
    {
      GMTrace.o(8239760539648L, 61391);
      return;
    }
    this.qpH = paramp;
    biR();
    biI();
    GMTrace.o(8239760539648L, 61391);
  }
  
  protected int aWs()
  {
    GMTrace.i(8240565846016L, 61397);
    GMTrace.o(8240565846016L, 61397);
    return Integer.MAX_VALUE;
  }
  
  protected void biI()
  {
    GMTrace.i(8241639587840L, 61405);
    hT(false);
    GMTrace.o(8241639587840L, 61405);
  }
  
  public View biL()
  {
    GMTrace.i(8240297410560L, 61395);
    View localView = this.iiK;
    GMTrace.o(8240297410560L, 61395);
    return localView;
  }
  
  protected void biR()
  {
    GMTrace.i(8240431628288L, 61396);
    w.w("MicroMsg.Sns.AdLandingPageBaseComponent", "for component reuse, subclass must implement this method");
    GMTrace.o(8240431628288L, 61396);
  }
  
  protected View biS()
  {
    GMTrace.i(8240700063744L, 61398);
    GMTrace.o(8240700063744L, 61398);
    return null;
  }
  
  public final p biV()
  {
    GMTrace.i(15402021158912L, 114754);
    p localp = this.qpH;
    GMTrace.o(15402021158912L, 114754);
    return localp;
  }
  
  public final String biW()
  {
    GMTrace.i(18578820562944L, 138423);
    String str = this.qpH.qno;
    GMTrace.o(18578820562944L, 138423);
    return str;
  }
  
  public void biX()
  {
    GMTrace.i(20065416118272L, 149499);
    GMTrace.o(20065416118272L, 149499);
  }
  
  public void biu()
  {
    GMTrace.i(8241236934656L, 61402);
    biw();
    GMTrace.o(8241236934656L, 61402);
  }
  
  public void biv()
  {
    GMTrace.i(8240834281472L, 61399);
    if (this.qpK)
    {
      GMTrace.o(8240834281472L, 61399);
      return;
    }
    this.qpK = true;
    this.qpJ = System.currentTimeMillis();
    this.qpI += 1;
    GMTrace.o(8240834281472L, 61399);
  }
  
  public void biw()
  {
    GMTrace.i(8240968499200L, 61400);
    if (!this.qpK)
    {
      GMTrace.o(8240968499200L, 61400);
      return;
    }
    this.qpK = false;
    if (this.qpJ > 0L) {
      this.jor += System.currentTimeMillis() - this.qpJ;
    }
    this.qpJ = 0L;
    GMTrace.o(8240968499200L, 61400);
  }
  
  public void biz()
  {
    GMTrace.i(17128329576448L, 127616);
    GMTrace.o(17128329576448L, 127616);
  }
  
  public final View getView()
  {
    GMTrace.i(8240028975104L, 61393);
    if (this.iiK != null)
    {
      localObject = this.iiK;
      GMTrace.o(8240028975104L, 61393);
      return (View)localObject;
    }
    if (this.iiK == null)
    {
      int i = aWs();
      if (i != Integer.MAX_VALUE) {
        this.iiK = ((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(i, this.qpL, false);
      }
      while (this.iiK == null)
      {
        throw new IllegalStateException("implement getLayout() or customLayout() to get a valid root view");
        this.iiK = biS();
        if (this.iiK.getLayoutParams() == null)
        {
          this.qpL.addView(this.iiK);
          localObject = this.iiK.getLayoutParams();
          this.qpL.removeView(this.iiK);
          this.iiK.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
      }
    }
    biL();
    biz();
    biR();
    biI();
    Object localObject = this.iiK;
    GMTrace.o(8240028975104L, 61393);
    return (View)localObject;
  }
  
  protected final void hT(boolean paramBoolean)
  {
    GMTrace.i(8241773805568L, 61406);
    if (this.iiK == null) {
      throw new IllegalStateException("set field contentView first");
    }
    if (this.qpH != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.iiK.getLayoutParams();
      if (localLayoutParams != null)
      {
        if (this.qpH.qnu != 2.14748365E9F) {
          localLayoutParams.width = ((int)this.qpH.qnu);
        }
        if (this.qpH.qnv != 2.14748365E9F) {
          localLayoutParams.height = ((int)this.qpH.qnv);
        }
        if ((paramBoolean) && ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))) {
          ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.qpH.qns, (int)this.qpH.qnq, (int)this.qpH.qnt, (int)this.qpH.qnr);
        }
        Object localObject;
        int i;
        if ((localLayoutParams instanceof LinearLayout.LayoutParams))
        {
          localObject = (LinearLayout.LayoutParams)localLayoutParams;
          i = getGravity();
          if (i != 0) {
            ((LinearLayout.LayoutParams)localObject).gravity = i;
          }
        }
        for (;;)
        {
          this.iiK.setLayoutParams(localLayoutParams);
          GMTrace.o(8241773805568L, 61406);
          return;
          ((LinearLayout.LayoutParams)localObject).gravity = -1;
          continue;
          if ((localLayoutParams instanceof FrameLayout.LayoutParams))
          {
            localObject = (FrameLayout.LayoutParams)localLayoutParams;
            i = getGravity();
            if (i != 0) {
              ((FrameLayout.LayoutParams)localObject).gravity = i;
            } else {
              ((FrameLayout.LayoutParams)localObject).gravity = -1;
            }
          }
        }
      }
      w.i("MicroMsg.Sns.AdLandingPageBaseComponent", this + " has no layoutParams in container " + this.qpL);
    }
    GMTrace.o(8241773805568L, 61406);
  }
  
  public boolean s(JSONArray paramJSONArray)
  {
    GMTrace.i(8241371152384L, 61403);
    GMTrace.o(8241371152384L, 61403);
    return false;
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    GMTrace.i(8239894757376L, 61392);
    this.backgroundColor = paramInt;
    GMTrace.o(8239894757376L, 61392);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */