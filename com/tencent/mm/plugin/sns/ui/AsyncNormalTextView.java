package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

public class AsyncNormalTextView
  extends CollapsibleTextView
{
  public String content;
  private Context context;
  public av qhj;
  private a.c qxt;
  public int qxu;
  public ay qxv;
  
  public AsyncNormalTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8341363359744L, 62148);
    this.qxu = 0;
    this.context = paramContext;
    GMTrace.o(8341363359744L, 62148);
  }
  
  public final void bkO()
  {
    GMTrace.i(8341631795200L, 62150);
    Object localObject1;
    if (!bg.mZ(this.content))
    {
      System.currentTimeMillis();
      setVisibility(0);
      if (this.qxu != 1) {
        break label231;
      }
      if (this.content.length() <= 100) {
        break label223;
      }
      localObject1 = this.content.substring(0, 100) + "...";
      this.content = ((String)localObject1);
      localObject1 = new SpannableStringBuilder(h.b(this.context, this.content, this.qyk.getTextSize()));
      a(this.qxu, (CharSequence)localObject1, TextView.BufferType.NORMAL, this.qhj.qyp, this.qxv.qAX, this.qxv.qPZ, this.qhj, this.content, this.qxv.qxx);
    }
    for (;;)
    {
      localObject1 = new as(this.qxv.qPZ, this.qxv.qAX, false, false, 1);
      this.qyk.setTag(localObject1);
      if (this.qyl != null) {
        this.qyl.setTag(localObject1);
      }
      this.qym.setTag(this.qxt);
      GMTrace.o(8341631795200L, 62150);
      return;
      label223:
      localObject1 = this.content;
      break;
      label231:
      if ((this.content.length() < 400) || (this.qxv.qxx))
      {
        localObject1 = null;
        if (this.qxv != null) {
          localObject1 = this.qxv.qPX;
        }
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new SpannableStringBuilder(h.b(this.context, this.content, this.qyk.getTextSize()));
        }
        if (this.qxv != null) {
          a(this.qxu, (CharSequence)localObject2, TextView.BufferType.SPANNABLE, this.qhj.qyp, this.qxv.qAX, this.qxv.qPZ, this.qhj, this.content, this.qxv.qxx);
        }
      }
      else
      {
        a(this.qxu, this.content, TextView.BufferType.NORMAL, this.qhj.qyp, this.qxv.qAX, this.qxv.qPZ, this.qhj, this.content, this.qxv.qxx);
      }
    }
  }
  
  public final void c(a.c paramc)
  {
    GMTrace.i(8341497577472L, 62149);
    this.qxt = paramc;
    bkO();
    GMTrace.o(8341497577472L, 62149);
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    GMTrace.i(8342168666112L, 62154);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setText(this.content);
    GMTrace.o(8342168666112L, 62154);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8341766012928L, 62151);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8341766012928L, 62151);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8341900230656L, 62152);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8341900230656L, 62152);
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(8342034448384L, 62153);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.getText().add(this.content);
    GMTrace.o(8342034448384L, 62153);
  }
  
  public final void setContentWidth(int paramInt)
  {
    GMTrace.i(8342302883840L, 62155);
    if (this.qyl != null)
    {
      this.qyk.qXo = paramInt;
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(paramInt, -2);
      this.qyl.setLayoutParams(localLayoutParams);
      this.qyk.setLayoutParams(localLayoutParams);
      this.qym.setLayoutParams(localLayoutParams);
    }
    GMTrace.o(8342302883840L, 62155);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/AsyncNormalTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */