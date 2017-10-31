package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import java.util.ArrayList;
import java.util.Iterator;

public class LargeTouchableAreasItemView
  extends LinearLayout
{
  private static final int kEh;
  private final Paint eI;
  private boolean gOY;
  private final ArrayList<b> kEi;
  private c kEj;
  a kEk;
  private int kEl;
  private int kEm;
  private int kEn;
  private ImageButton kEo;
  
  static
  {
    GMTrace.i(9102512095232L, 67819);
    kEh = Color.argb(0, 0, 0, 0);
    GMTrace.o(9102512095232L, 67819);
  }
  
  public LargeTouchableAreasItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9101572571136L, 67812);
    this.kEi = new ArrayList();
    this.eI = new Paint();
    this.kEm = -1;
    this.kEn = -1;
    setOrientation(0);
    setDescendantFocusability(393216);
    this.kEj = new c(this);
    this.eI.setStyle(Paint.Style.FILL);
    this.kEl = ((int)(paramContext.getResources().getDisplayMetrics().density * 66.0F + 0.5F));
    LayoutInflater.from(paramContext).inflate(R.i.cQx, this);
    GMTrace.o(9101572571136L, 67812);
  }
  
  public final void dF(boolean paramBoolean)
  {
    GMTrace.i(9102109442048L, 67816);
    ImageButton localImageButton;
    if (this.gOY != paramBoolean)
    {
      this.gOY = paramBoolean;
      localImageButton = this.kEo;
      if (!this.gOY) {
        break label51;
      }
    }
    label51:
    for (int i = R.k.dnj;; i = R.k.dnk)
    {
      localImageButton.setImageResource(i);
      GMTrace.o(9102109442048L, 67816);
      return;
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(9101975224320L, 67815);
    Iterator localIterator = this.kEi.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      this.eI.setColor(localb.color);
      paramCanvas.drawRect(localb.rect, this.eI);
    }
    super.dispatchDraw(paramCanvas);
    GMTrace.o(9101975224320L, 67815);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(9101706788864L, 67813);
    super.onFinishInflate();
    this.kEo = ((ImageButton)findViewById(R.h.bnN));
    this.kEo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9076205420544L, 67623);
        paramAnonymousView = LargeTouchableAreasItemView.this;
        if (!LargeTouchableAreasItemView.a(LargeTouchableAreasItemView.this)) {}
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousView.dF(bool);
          if (LargeTouchableAreasItemView.b(LargeTouchableAreasItemView.this) != null) {
            LargeTouchableAreasItemView.b(LargeTouchableAreasItemView.this).dG(LargeTouchableAreasItemView.a(LargeTouchableAreasItemView.this));
          }
          GMTrace.o(9076205420544L, 67623);
          return;
        }
      }
    });
    GMTrace.o(9101706788864L, 67813);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(9101841006592L, 67814);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if ((paramInt1 != this.kEm) || (paramInt2 != this.kEn))
    {
      this.kEm = paramInt1;
      this.kEn = paramInt2;
      Object localObject1 = this.kEj;
      if (((c)localObject1).kIf != null) {
        ((c)localObject1).kIf.clear();
      }
      ((c)localObject1).kIg = null;
      localObject1 = new Rect(paramInt1 - this.kEo.getWidth() - this.kEl, 0, paramInt1, paramInt2);
      paramInt1 = kEh;
      Object localObject2 = this.kEo;
      c localc = this.kEj;
      localObject2 = new TouchDelegate((Rect)localObject1, (View)localObject2);
      if (localc.kIf == null) {
        localc.kIf = new ArrayList();
      }
      localc.kIf.add(localObject2);
      this.kEi.add(new b((Rect)localObject1, paramInt1));
      setTouchDelegate(this.kEj);
    }
    GMTrace.o(9101841006592L, 67814);
  }
  
  public static abstract interface a
  {
    public abstract void dG(boolean paramBoolean);
  }
  
  private static final class b
  {
    public int color;
    public Rect rect;
    
    public b(Rect paramRect, int paramInt)
    {
      GMTrace.i(9135798091776L, 68067);
      this.rect = paramRect;
      this.color = paramInt;
      GMTrace.o(9135798091776L, 68067);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/LargeTouchableAreasItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */