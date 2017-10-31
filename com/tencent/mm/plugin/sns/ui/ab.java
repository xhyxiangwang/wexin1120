package com.tencent.mm.plugin.sns.ui;

import android.text.Layout;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.PLSysTextView;
import com.tencent.mm.kiss.widget.textview.SysTextView;
import com.tencent.mm.kiss.widget.textview.g;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class ab
  implements View.OnTouchListener
{
  private static m qCE;
  private static TextView qCF;
  
  public ab()
  {
    GMTrace.i(8324720361472L, 62024);
    GMTrace.o(8324720361472L, 62024);
  }
  
  public static void blP()
  {
    GMTrace.i(8324988796928L, 62026);
    if (qCE != null)
    {
      qCE.nSV = false;
      qCF.invalidate();
      qCF = null;
      qCE = null;
    }
    GMTrace.o(8324988796928L, 62026);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(8324854579200L, 62025);
    TextView localTextView = (TextView)paramView;
    localTextView.getTag();
    CharSequence localCharSequence = localTextView.getText();
    Object localObject = localTextView.getLayout();
    paramView = (View)localObject;
    if (localObject == null)
    {
      paramView = (View)localObject;
      if ((localTextView instanceof SysTextView)) {
        paramView = ((SysTextView)localTextView).gTZ.xU();
      }
    }
    int i;
    if (((localCharSequence instanceof Spannable)) && (paramView != null))
    {
      localObject = (Spannable)localCharSequence;
      i = paramMotionEvent.getAction();
      paramView = localTextView.getLayout();
      if ((paramView != null) || (!(localTextView instanceof SysTextView))) {
        break label626;
      }
      paramView = ((SysTextView)localTextView).gTZ.xU();
    }
    label548:
    label595:
    label603:
    label626:
    for (;;)
    {
      localTextView.invalidate();
      if ((i == 1) || (i == 0) || (i == 2))
      {
        int j = (int)paramMotionEvent.getX();
        i = (int)paramMotionEvent.getY();
        int k;
        if ((localTextView instanceof PLSysTextView))
        {
          if (j >= ((PLSysTextView)localTextView).xM())
          {
            k = paramView.getWidth();
            if (j <= ((PLSysTextView)localTextView).xM() + k) {}
          }
          else
          {
            GMTrace.o(8324854579200L, 62025);
            return false;
          }
          if (i >= ((PLSysTextView)localTextView).xN())
          {
            k = paramView.getHeight();
            if (i <= ((PLSysTextView)localTextView).xN() + k) {}
          }
          else
          {
            GMTrace.o(8324854579200L, 62025);
            return false;
          }
        }
        else if ((localTextView instanceof TextView))
        {
          if ((j < localTextView.getTotalPaddingLeft()) || (j > paramView.getWidth() + localTextView.getTotalPaddingLeft()))
          {
            GMTrace.o(8324854579200L, 62025);
            return false;
          }
          if ((i < localTextView.getTotalPaddingTop()) || (i > paramView.getHeight() + localTextView.getTotalPaddingTop()))
          {
            GMTrace.o(8324854579200L, 62025);
            return false;
          }
        }
        if ((localTextView instanceof PLSysTextView))
        {
          j -= ((PLSysTextView)localTextView).xM();
          i -= ((PLSysTextView)localTextView).xN();
          k = localTextView.getScrollX();
          j = paramView.getOffsetForHorizontal(paramView.getLineForVertical(i + localTextView.getScrollY()), j + k);
          i = paramMotionEvent.getAction();
          paramView = (m[])((Spannable)localObject).getSpans(j, j, m.class);
          j = paramView.length - 1;
          w.d("MicroMsg.MMOnTouchListener", " action span Len: " + paramView.length);
          localTextView.getLayout();
          if (paramView.length == 0) {
            break label595;
          }
          if (i != 1) {
            break label548;
          }
          paramView[j].onClick(localTextView);
          new ae().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8415048892416L, 62697);
              ab.blP();
              GMTrace.o(8415048892416L, 62697);
            }
          }, 300L);
          i = 1;
        }
        for (;;)
        {
          if (i == 0) {
            break label603;
          }
          GMTrace.o(8324854579200L, 62025);
          return true;
          if ((localTextView instanceof TextView))
          {
            j -= localTextView.getTotalPaddingLeft();
            i -= localTextView.getTotalPaddingTop();
            break;
          }
          j -= localTextView.getPaddingLeft();
          i -= localTextView.getPaddingTop();
          break;
          if ((i == 0) || (i == 2) || (i == 3))
          {
            blP();
            qCE = paramView[j];
            qCF = localTextView;
            paramView[j].nSV = true;
            localTextView.invalidate();
            i = 1;
            continue;
            blP();
          }
          else
          {
            i = 0;
          }
        }
      }
      blP();
      GMTrace.o(8324854579200L, 62025);
      return false;
      GMTrace.o(8324854579200L, 62025);
      return false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */