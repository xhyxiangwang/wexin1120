package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EllipsizingTextView
  extends TextView
{
  private final List<Object> mSd;
  private boolean mSe;
  private boolean mSf;
  private boolean mSg;
  private String mSh;
  private float mSi;
  private float mSj;
  private int maxLines;
  
  public EllipsizingTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12577006419968L, 93706);
    this.mSd = new ArrayList();
    this.maxLines = -1;
    this.mSi = 1.0F;
    this.mSj = 0.0F;
    GMTrace.o(12577006419968L, 93706);
  }
  
  public EllipsizingTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12577140637696L, 93707);
    this.mSd = new ArrayList();
    this.maxLines = -1;
    this.mSi = 1.0F;
    this.mSj = 0.0F;
    GMTrace.o(12577140637696L, 93707);
  }
  
  private Layout zs(String paramString)
  {
    GMTrace.i(12577945944064L, 93713);
    paramString = new StaticLayout(paramString, getPaint(), getWidth() - getPaddingLeft() - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.mSi, this.mSj, false);
    GMTrace.o(12577945944064L, 93713);
    return paramString;
  }
  
  public int getMaxLines()
  {
    GMTrace.i(12577409073152L, 93709);
    int i = this.maxLines;
    GMTrace.o(12577409073152L, 93709);
    return i;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(12577811726336L, 93712);
    Object localObject1;
    if (this.mSf)
    {
      super.setEllipsize(null);
      int j = getMaxLines();
      localObject1 = this.mSh;
      if (j == -1) {
        break label320;
      }
      Object localObject2 = zs((String)localObject1);
      if (((Layout)localObject2).getLineCount() <= j) {
        break label320;
      }
      localObject2 = this.mSh.substring(0, ((Layout)localObject2).getLineEnd(j - 1)).trim();
      if (((String)localObject2).getBytes().length != ((String)localObject2).length()) {}
      for (int i = 1; i == 0; i = 0) {
        for (;;)
        {
          localObject1 = localObject2;
          if (zs((String)localObject2 + "...").getLineCount() <= j) {
            break;
          }
          i = ((String)localObject2).lastIndexOf(' ');
          localObject1 = localObject2;
          if (i == -1) {
            break;
          }
          localObject2 = ((String)localObject2).substring(0, i);
        }
      }
      localObject1 = localObject2;
      if (((String)localObject2).length() >= 2) {
        localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - 1 - 1);
      }
      localObject1 = (String)localObject1 + "...";
    }
    label320:
    for (boolean bool = true;; bool = false)
    {
      if (!((String)localObject1).equals(getText())) {
        this.mSg = true;
      }
      try
      {
        setText((CharSequence)localObject1);
        this.mSg = false;
        this.mSf = false;
        if (bool != this.mSe)
        {
          this.mSe = bool;
          localObject1 = this.mSd.iterator();
          while (((Iterator)localObject1).hasNext()) {
            ((Iterator)localObject1).next();
          }
        }
        GMTrace.o(12577811726336L, 93712);
      }
      finally
      {
        this.mSg = false;
      }
      return;
    }
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(12577677508608L, 93711);
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    if (!this.mSg)
    {
      this.mSh = paramCharSequence.toString();
      this.mSf = true;
    }
    GMTrace.o(12577677508608L, 93711);
  }
  
  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    GMTrace.i(12578080161792L, 93714);
    GMTrace.o(12578080161792L, 93714);
  }
  
  public void setLineSpacing(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(12577543290880L, 93710);
    this.mSj = paramFloat1;
    this.mSi = paramFloat2;
    super.setLineSpacing(paramFloat1, paramFloat2);
    GMTrace.o(12577543290880L, 93710);
  }
  
  public void setMaxLines(int paramInt)
  {
    GMTrace.i(12577274855424L, 93708);
    super.setMaxLines(paramInt);
    this.maxLines = paramInt;
    this.mSf = true;
    GMTrace.o(12577274855424L, 93708);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/widget/EllipsizingTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */