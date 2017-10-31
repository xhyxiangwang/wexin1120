package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.c;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bw.a.e;
import com.tencent.mm.bw.a.f;
import java.util.ArrayList;

public final class a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private Button jWv;
  private Button jWw;
  private View lcV;
  private Context mContext;
  private int wSM;
  private BottomSheetBehavior wSN;
  public c wXi;
  private String[] wXj;
  private int wXk;
  public OptionPicker wXl;
  public a wXm;
  
  public a(Context paramContext, ArrayList<String> paramArrayList)
  {
    GMTrace.i(18916243931136L, 140937);
    this.mContext = paramContext;
    this.wXj = ((String[])paramArrayList.toArray(new String[paramArrayList.size()]));
    this.wXi = new c(this.mContext);
    this.lcV = View.inflate(this.mContext, a.f.wYp, null);
    this.wXl = ((OptionPicker)this.lcV.findViewById(a.e.wYg));
    this.wXl.h(this.wXj);
    this.wXk = com.tencent.mm.bq.a.fromDPToPix(this.mContext, 288);
    this.jWv = ((Button)this.lcV.findViewById(a.e.chy));
    this.jWv.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18915841277952L, 140934);
        a locala = a.this;
        if (a.this.wXl == null) {
          paramAnonymousView = null;
        }
        for (;;)
        {
          locala.e(true, paramAnonymousView);
          GMTrace.o(18915841277952L, 140934);
          return;
          paramAnonymousView = a.this.wXl;
          if ((paramAnonymousView.jHy == null) || (paramAnonymousView.jHy.length <= 0)) {
            paramAnonymousView = "";
          } else {
            paramAnonymousView = paramAnonymousView.jHy[paramAnonymousView.getValue()];
          }
        }
      }
    });
    this.jWw = ((Button)this.lcV.findViewById(a.e.bov));
    this.jWw.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18916109713408L, 140936);
        a.this.e(false, null);
        GMTrace.o(18916109713408L, 140936);
      }
    });
    this.wXi.setContentView(this.lcV);
    this.wSM = com.tencent.mm.bq.a.fromDPToPix(this.mContext, 350);
    this.wSN = BottomSheetBehavior.i((View)this.lcV.getParent());
    if (this.wSN != null)
    {
      this.wSN.g(this.wSM);
      this.wSN.eq = false;
    }
    this.wXi.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(18916780802048L, 140941);
        a.this.wXi = null;
        GMTrace.o(18916780802048L, 140941);
      }
    });
    GMTrace.o(18916243931136L, 140937);
  }
  
  public final void DO(int paramInt)
  {
    GMTrace.i(20301370884096L, 151257);
    if (paramInt != 0) {
      this.wXk = paramInt;
    }
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.lcV.getLayoutParams();
    localLayoutParams.height = this.wXk;
    this.lcV.setLayoutParams(localLayoutParams);
    this.lcV.invalidate();
    GMTrace.o(20301370884096L, 151257);
  }
  
  public final void DP(int paramInt)
  {
    GMTrace.i(20301773537280L, 151260);
    if (this.wXl != null) {
      this.wXl.setValue(paramInt);
    }
    GMTrace.o(20301773537280L, 151260);
  }
  
  public final int cgI()
  {
    GMTrace.i(20301907755008L, 151261);
    int i = 0;
    if (this.wXl != null) {
      i = this.wXl.getValue();
    }
    GMTrace.o(20301907755008L, 151261);
    return i;
  }
  
  public final void e(boolean paramBoolean, Object paramObject)
  {
    GMTrace.i(18916512366592L, 140939);
    if (this.wXm != null) {
      this.wXm.d(paramBoolean, paramObject);
    }
    GMTrace.o(18916512366592L, 140939);
  }
  
  public final void hide()
  {
    GMTrace.i(20301639319552L, 151259);
    if (this.wXi != null) {
      this.wXi.dismiss();
    }
    GMTrace.o(20301639319552L, 151259);
  }
  
  public final void onGlobalLayout()
  {
    GMTrace.i(18916378148864L, 140938);
    GMTrace.o(18916378148864L, 140938);
  }
  
  public final void show()
  {
    GMTrace.i(20301505101824L, 151258);
    if (this.wXi != null) {
      this.wXi.show();
    }
    GMTrace.o(20301505101824L, 151258);
  }
  
  public static abstract interface a<T>
  {
    public abstract void d(boolean paramBoolean, T paramT);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/widget/picker/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */