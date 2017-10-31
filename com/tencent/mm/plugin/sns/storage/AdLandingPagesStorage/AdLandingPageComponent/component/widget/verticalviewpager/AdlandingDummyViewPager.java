package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.support.v4.view.ViewPager.e;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AdlandingDummyViewPager
  extends DummyViewPager
{
  private a qsU;
  public Set<ViewPager.e> qsV;
  
  public AdlandingDummyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17101351813120L, 127415);
    this.qsU = new a();
    this.qsV = new HashSet();
    this.yw = this.qsU;
    GMTrace.o(17101351813120L, 127415);
  }
  
  private final class a
    implements ViewPager.e
  {
    public a()
    {
      GMTrace.i(17121484472320L, 127565);
      GMTrace.o(17121484472320L, 127565);
    }
    
    public final void V(int paramInt)
    {
      GMTrace.i(17121752907776L, 127567);
      Iterator localIterator = AdlandingDummyViewPager.a(AdlandingDummyViewPager.this).iterator();
      while (localIterator.hasNext()) {
        ((ViewPager.e)localIterator.next()).V(paramInt);
      }
      GMTrace.o(17121752907776L, 127567);
    }
    
    public final void W(int paramInt)
    {
      GMTrace.i(17121887125504L, 127568);
      if (paramInt == 0) {
        AdlandingDummyViewPager.this.qsX = AdlandingDummyViewPager.this.getScrollX();
      }
      Iterator localIterator = AdlandingDummyViewPager.a(AdlandingDummyViewPager.this).iterator();
      while (localIterator.hasNext()) {
        ((ViewPager.e)localIterator.next()).W(paramInt);
      }
      GMTrace.o(17121887125504L, 127568);
    }
    
    public final void a(int paramInt1, float paramFloat, int paramInt2)
    {
      GMTrace.i(17121618690048L, 127566);
      Iterator localIterator = AdlandingDummyViewPager.a(AdlandingDummyViewPager.this).iterator();
      while (localIterator.hasNext()) {
        ((ViewPager.e)localIterator.next()).a(paramInt1, paramFloat, paramInt2);
      }
      GMTrace.o(17121618690048L, 127566);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/AdlandingDummyViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */