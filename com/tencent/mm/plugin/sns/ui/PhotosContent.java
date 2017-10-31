package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.MMFrameLayout;
import java.util.ArrayList;

public class PhotosContent
  extends MMFrameLayout
{
  public ArrayList<TagImageView> qDR;
  private float qDS;
  private int qDT;
  
  public PhotosContent(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8340826488832L, 62144);
    this.qDR = new ArrayList();
    this.qDT = 120;
    GMTrace.o(8340826488832L, 62144);
  }
  
  public final void a(TagImageView paramTagImageView)
  {
    GMTrace.i(8340423835648L, 62141);
    this.qDR.add(paramTagImageView);
    GMTrace.o(8340423835648L, 62141);
  }
  
  public final void bmj()
  {
    GMTrace.i(8340289617920L, 62140);
    this.qDR.clear();
    GMTrace.o(8340289617920L, 62140);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8340960706560L, 62145);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8340960706560L, 62145);
  }
  
  public final void uR(int paramInt)
  {
    GMTrace.i(8340558053376L, 62142);
    if (paramInt <= 0)
    {
      GMTrace.o(8340558053376L, 62142);
      return;
    }
    this.qDS = getResources().getDisplayMetrics().density;
    this.qDT = ((int)(this.qDT * this.qDS));
    if (paramInt < this.qDT) {}
    Object localObject1;
    for (;;)
    {
      i = 0;
      while (i < this.qDR.size())
      {
        localObject1 = getChildAt(i);
        Object localObject2 = new ViewGroup.MarginLayoutParams(((View)localObject1).getLayoutParams());
        ((ViewGroup.MarginLayoutParams)localObject2).width = paramInt;
        ((ViewGroup.MarginLayoutParams)localObject2).height = paramInt;
        ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = ((int)(i % 3 * (paramInt + this.qDS * 3.0F)));
        ((ViewGroup.MarginLayoutParams)localObject2).topMargin = ((int)(i / 3 * (paramInt + this.qDS * 3.0F)));
        localObject2 = new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams)localObject2);
        ((FrameLayout.LayoutParams)localObject2).gravity = 51;
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        i += 1;
      }
      paramInt = this.qDT;
    }
    int i = this.qDR.size() / 3;
    if (i > 0)
    {
      localObject1 = (ViewGroup.MarginLayoutParams)getLayoutParams();
      float f1 = paramInt * i;
      float f2 = this.qDS;
      ((ViewGroup.MarginLayoutParams)localObject1).height = ((int)((i - 1) * (f2 * 3.0F) + f1));
      setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
    GMTrace.o(8340558053376L, 62142);
  }
  
  public final TagImageView uS(int paramInt)
  {
    GMTrace.i(8340692271104L, 62143);
    if (paramInt < this.qDR.size())
    {
      TagImageView localTagImageView = (TagImageView)this.qDR.get(paramInt);
      GMTrace.o(8340692271104L, 62143);
      return localTagImageView;
    }
    GMTrace.o(8340692271104L, 62143);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/PhotosContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */