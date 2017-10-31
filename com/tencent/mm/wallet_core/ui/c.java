package com.tencent.mm.wallet_core.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.g.a.ce;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.p;
import java.util.ArrayList;

public final class c
{
  public p ioi;
  private ImageView ioj;
  private View iok;
  private View.OnClickListener iom;
  private MMActivity jFp;
  public boolean kuB;
  private MMVerticalTextView kyA;
  private ArrayList<Bitmap> kyC;
  private Bitmap kyv;
  private View kyy;
  private ImageView kyz;
  private String omV;
  public Bitmap ooQ;
  public Bitmap ooR;
  private String opk;
  public ViewGroup xhs;
  private boolean xht;
  
  public c(MMActivity paramMMActivity)
  {
    this(paramMMActivity, false);
    GMTrace.i(1508204609536L, 11237);
    GMTrace.o(1508204609536L, 11237);
  }
  
  public c(MMActivity paramMMActivity, boolean paramBoolean)
  {
    GMTrace.i(1508070391808L, 11236);
    this.ooQ = null;
    this.ooR = null;
    this.kyv = null;
    this.opk = "";
    this.omV = "";
    this.kuB = true;
    this.kyC = new ArrayList();
    this.ioi = null;
    this.xht = false;
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1503775424512L, 11204);
        if (((paramAnonymousView.getId() == R.h.ckf) || (paramAnonymousView.getId() == R.h.ckb)) && (c.this.ioi != null) && (c.this.ioi.isShowing())) {
          c.this.ioi.dismiss();
        }
        GMTrace.o(1503775424512L, 11204);
      }
    };
    this.jFp = paramMMActivity;
    this.xht = paramBoolean;
    GMTrace.o(1508070391808L, 11236);
  }
  
  private void cjh()
  {
    GMTrace.i(1509009915904L, 11243);
    if (this.kuB)
    {
      this.kyz.setOnClickListener(this.iom);
      Bitmap localBitmap = this.kyv;
      if (this.ooR != null)
      {
        this.kyv = e.t(this.ooR);
        w.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp != null");
      }
      for (;;)
      {
        this.kyz.setImageBitmap(this.kyv);
        this.kyC.add(0, localBitmap);
        if (this.kyC.size() < 2) {
          break;
        }
        int i = this.kyC.size() - 1;
        while (i > 1)
        {
          e.u((Bitmap)this.kyC.remove(i));
          i -= 1;
        }
        this.kyv = null;
        w.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp == null");
      }
      this.iok.setVisibility(8);
      this.kyy.setVisibility(0);
      this.kyA.setText(e.WH(this.omV));
      this.ioi.update();
      GMTrace.o(1509009915904L, 11243);
      return;
    }
    this.ioj.setOnClickListener(this.iom);
    this.ioj.setImageBitmap(this.ooQ);
    if (this.ooQ != null) {
      w.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp != null");
    }
    for (;;)
    {
      this.iok.setVisibility(0);
      this.kyy.setVisibility(8);
      break;
      w.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp == null");
    }
  }
  
  public final void cjf()
  {
    GMTrace.i(1508875698176L, 11242);
    if ((this.ioi != null) && (this.ioi.isShowing())) {
      cjh();
    }
    GMTrace.o(1508875698176L, 11242);
  }
  
  public final void cjg()
  {
    GMTrace.i(16865128611840L, 125655);
    if (this.xhs != null) {
      this.xhs.setVisibility(0);
    }
    GMTrace.o(16865128611840L, 125655);
  }
  
  public final void dismiss()
  {
    GMTrace.i(16865262829568L, 125656);
    if ((this.ioi != null) && (this.ioi.isShowing())) {
      this.ioi.dismiss();
    }
    GMTrace.o(16865262829568L, 125656);
  }
  
  public final void ff(String paramString1, String paramString2)
  {
    GMTrace.i(1508338827264L, 11238);
    this.opk = paramString1;
    this.omV = paramString2;
    GMTrace.o(1508338827264L, 11238);
  }
  
  public final void init()
  {
    GMTrace.i(1508473044992L, 11239);
    View localView;
    if (this.ioi == null)
    {
      if (!this.xht) {
        break label226;
      }
      localView = View.inflate(this.jFp, R.i.diO, null);
      MMVerticalTextView localMMVerticalTextView = (MMVerticalTextView)localView.findViewById(R.h.cbh);
      this.xhs = ((ViewGroup)localView.findViewById(R.h.cke));
      localMMVerticalTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1507265085440L, 11230);
          w.d("MicroMsg.OfflinePopupWindow", "on click know");
          c.this.xhs.setVisibility(8);
          paramAnonymousView = new ce();
          paramAnonymousView.fwD.fwE = 1;
          a.uLm.m(paramAnonymousView);
          GMTrace.o(1507265085440L, 11230);
        }
      });
      localView.findViewById(R.h.ckd).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16864323305472L, 125649);
          w.d("MicroMsg.OfflinePopupWindow", "root on click");
          if ((c.this.ioi != null) && (c.this.ioi.isShowing())) {
            c.this.ioi.dismiss();
          }
          GMTrace.o(16864323305472L, 125649);
        }
      });
    }
    for (;;)
    {
      this.iok = localView.findViewById(R.h.ckg);
      this.ioj = ((ImageView)localView.findViewById(R.h.ckf));
      this.kyy = localView.findViewById(R.h.ckc);
      this.kyz = ((ImageView)localView.findViewById(R.h.ckb));
      this.kyA = ((MMVerticalTextView)localView.findViewById(R.h.cDZ));
      this.ioi = new p(localView, -1, -1, true);
      this.ioi.setClippingEnabled(false);
      this.ioi.update();
      this.ioi.setBackgroundDrawable(new ColorDrawable(16777215));
      this.ioi.setOnDismissListener(new PopupWindow.OnDismissListener()
      {
        public final void onDismiss()
        {
          GMTrace.i(16864994394112L, 125654);
          GMTrace.o(16864994394112L, 125654);
        }
      });
      GMTrace.o(1508473044992L, 11239);
      return;
      label226:
      localView = View.inflate(this.jFp, R.i.diR, null);
      localView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16864591740928L, 125651);
          if ((c.this.ioi != null) && (c.this.ioi.isShowing())) {
            c.this.ioi.dismiss();
          }
          GMTrace.o(16864591740928L, 125651);
        }
      });
    }
  }
  
  public final void release()
  {
    GMTrace.i(1508607262720L, 11240);
    if ((this.ioi != null) && (this.ioi.isShowing())) {
      this.ioi.dismiss();
    }
    e.u(this.kyv);
    e.ao(this.kyC);
    this.kyC.clear();
    this.jFp = null;
    GMTrace.o(1508607262720L, 11240);
  }
  
  public final void t(View paramView, boolean paramBoolean)
  {
    GMTrace.i(1508741480448L, 11241);
    this.kuB = paramBoolean;
    if ((this.ioi != null) && (!this.ioi.isShowing()))
    {
      this.ioi.showAtLocation(paramView.getRootView(), 17, 0, 0);
      this.ioi.setFocusable(true);
      this.ioi.setTouchable(true);
      this.ioi.setBackgroundDrawable(new ColorDrawable(16777215));
      this.ioi.setOutsideTouchable(true);
      if (this.kuB) {
        cjg();
      }
      cjh();
    }
    GMTrace.o(1508741480448L, 11241);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */