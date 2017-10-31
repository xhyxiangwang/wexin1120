package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.base.p;

public class IPCallCountryCodeScrollbar
  extends View
{
  public static final String[] ncN;
  private float gUs;
  private Paint khx;
  protected float ncO;
  protected int ncP;
  protected String[] ncQ;
  private int ncR;
  private float ncS;
  private float ncT;
  private p ncU;
  private TextView ncV;
  private int ncW;
  a ncX;
  
  static
  {
    GMTrace.i(11720965750784L, 87328);
    ncN = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
    GMTrace.o(11720965750784L, 87328);
  }
  
  public IPCallCountryCodeScrollbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11720428879872L, 87324);
    this.ncS = 0.0F;
    this.ncQ = new String[] { "↑" };
    this.ncO = 1.3F;
    this.ncP = 79;
    setFocusable(true);
    setFocusableInTouchMode(true);
    this.ncW = BackwardSupportUtil.b.a(paramContext, 3.0F);
    paramAttributeSet = inflate(paramContext, R.i.dgw, null);
    int i = BackwardSupportUtil.b.a(paramContext, this.ncP);
    this.ncU = new p(paramAttributeSet, i, i);
    this.ncV = ((TextView)paramAttributeSet.findViewById(R.h.cxW));
    this.khx = new Paint();
    this.khx.setAntiAlias(true);
    this.khx.setColor(-11119018);
    this.khx.setTextAlign(Paint.Align.CENTER);
    GMTrace.o(11720428879872L, 87324);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = 0;
    int j = 0;
    GMTrace.i(11720563097600L, 87325);
    super.onDraw(paramCanvas);
    final int m = getMeasuredHeight();
    final int k = getMeasuredWidth();
    this.gUs = (m / (this.ncQ.length * this.ncO));
    int n = getResources().getDimensionPixelSize(R.f.aSh);
    if (this.gUs > n) {
      this.gUs = n;
    }
    this.khx.setTextSize(this.gUs);
    if (this.ncS != this.gUs)
    {
      this.ncS = this.gUs;
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11692511592448L, 87116);
          if (IPCallCountryCodeScrollbar.this.ncQ.length <= 0)
          {
            GMTrace.o(11692511592448L, 87116);
            return;
          }
          int i = (int)IPCallCountryCodeScrollbar.a(IPCallCountryCodeScrollbar.this).measureText(IPCallCountryCodeScrollbar.this.ncQ[(IPCallCountryCodeScrollbar.this.ncQ.length - 1)]) + a.fromDPToPix(IPCallCountryCodeScrollbar.this.getContext(), 8);
          if (i > k)
          {
            ViewGroup.LayoutParams localLayoutParams = IPCallCountryCodeScrollbar.this.getLayoutParams();
            localLayoutParams.width = i;
            localLayoutParams.height = m;
            IPCallCountryCodeScrollbar.this.setLayoutParams(localLayoutParams);
          }
          GMTrace.o(11692511592448L, 87116);
        }
      });
    }
    if (this.gUs == n)
    {
      float f = (m - this.ncQ.length * this.gUs * this.ncO) / 2.0F;
      i = j;
      while (i < this.ncQ.length)
      {
        paramCanvas.drawText(this.ncQ[i], k / 2.0F, this.gUs + f + i * this.gUs * this.ncO, this.khx);
        i += 1;
      }
      GMTrace.o(11720563097600L, 87325);
      return;
    }
    while (i < this.ncQ.length)
    {
      paramCanvas.drawText(this.ncQ[i], k / 2.0F, this.gUs + i * this.gUs * this.ncO, this.khx);
      i += 1;
    }
    GMTrace.o(11720563097600L, 87325);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(11720697315328L, 87326);
    if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2))
    {
      this.ncT = paramMotionEvent.getY();
      if (this.ncT < 0.0F) {
        this.ncT = 0.0F;
      }
      if (this.ncT > getMeasuredHeight()) {
        this.ncT = getMeasuredHeight();
      }
      setBackgroundDrawable(a.b(getContext(), R.g.bcR));
      float f1 = this.ncT;
      float f2 = this.gUs * this.ncO;
      int j = (int)((f1 - (getMeasuredHeight() - this.ncQ.length * f2) / 2.0F) / f2);
      int i = j;
      if (j < 0) {
        i = 0;
      }
      j = i;
      if (i >= this.ncQ.length) {
        j = this.ncQ.length - 1;
      }
      this.ncR = j;
      if (this.ncR != -1) {
        break label266;
      }
      this.ncV.setText(R.l.eEe);
      this.ncU.showAtLocation(this, 17, 0, 0);
      if (this.ncX != null)
      {
        if (this.ncR != -1) {
          break label285;
        }
        this.ncX.tn(a.W(getContext(), R.l.eEe));
      }
    }
    for (;;)
    {
      invalidate();
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        setBackgroundResource(0);
        this.ncU.dismiss();
      }
      GMTrace.o(11720697315328L, 87326);
      return true;
      label266:
      this.ncV.setText(this.ncQ[this.ncR]);
      break;
      label285:
      this.ncX.tn(this.ncQ[this.ncR]);
    }
  }
  
  public final void zT(String paramString)
  {
    int k = 0;
    GMTrace.i(11720294662144L, 87323);
    String[] arrayOfString1 = ncN;
    int m = arrayOfString1.length;
    int i = 0;
    int j = 0;
    while (i < m)
    {
      if (arrayOfString1[i].equals(paramString)) {
        j = 1;
      }
      i += 1;
    }
    if (j == 0) {
      paramString = "#";
    }
    m = this.ncQ.length + 1;
    arrayOfString1 = new String[m];
    String[] arrayOfString2 = this.ncQ;
    int n = arrayOfString2.length;
    i = 0;
    j = k;
    while (i < n)
    {
      String str = arrayOfString2[i];
      if (str.equals(paramString))
      {
        GMTrace.o(11720294662144L, 87323);
        return;
      }
      arrayOfString1[j] = str;
      j += 1;
      i += 1;
    }
    arrayOfString1[(m - 1)] = paramString;
    this.ncQ = arrayOfString1;
    GMTrace.o(11720294662144L, 87323);
  }
  
  public static abstract interface a
  {
    public abstract void tn(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallCountryCodeScrollbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */