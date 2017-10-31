package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.game.c.cg;
import com.tencent.mm.plugin.game.model.ag;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.x.ap;

public final class t
  implements View.OnClickListener, e
{
  public int mBs;
  public Context mContext;
  DialogInterface.OnClickListener mQu;
  public com.tencent.mm.plugin.game.model.c mzY;
  
  public t(Context paramContext)
  {
    GMTrace.i(12694581149696L, 94582);
    this.mzY = null;
    this.mQu = null;
    this.mContext = paramContext;
    GMTrace.o(12694581149696L, 94582);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(12694849585152L, 94584);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramk.getType() == 1219))
    {
      ap.wT().b(1219, this);
      paramk = new ag(((ax)paramk).lnP.hlV.hmc);
      paramString = new b();
      paramString.mQy = Boolean.valueOf(paramk.mBT.mCQ);
      paramString.title = paramk.mBT.fuw;
      paramString.content = paramk.mBT.mDl;
      if (paramk.mBT.mGy != null)
      {
        paramString.mQz = new a();
        paramString.mQz.message = paramk.mBT.mGy.mDl;
        paramString.mQz.mQw = paramk.mBT.mGy.mDm;
        paramString.mQz.mQx = paramk.mBT.mGy.mDn;
        paramString.mQz.url = paramk.mBT.mGy.mDo;
      }
      this.mzY.mzc = paramString.mQy.booleanValue();
      if (bg.mZ(paramString.title))
      {
        GMTrace.o(12694849585152L, 94584);
        return;
      }
      if (paramString.mQz != null)
      {
        paramk = paramString.mQz.url;
        i.a locala = new i.a(this.mContext);
        locala.UF(paramString.title);
        locala.UG(paramString.mQz.message);
        locala.lm(false);
        locala.UI(paramString.mQz.mQw).a(true, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12770145730560L, 95145);
            com.tencent.mm.plugin.game.d.c.aa(t.this.mContext, paramk);
            ai.a(t.this.mContext, t.this.mzY.scene, t.this.mzY.fKV, t.this.mzY.position, 17, t.this.mzY.field_appId, t.this.mBs, t.this.mzY.fuy, t.this.mzY.mzp);
            GMTrace.o(12770145730560L, 95145);
          }
        });
        locala.UJ(paramString.mQz.mQx).b(this.mQu);
        locala.ZT().show();
        GMTrace.o(12694849585152L, 94584);
        return;
      }
      if (bg.mZ(paramString.content))
      {
        GMTrace.o(12694849585152L, 94584);
        return;
      }
      paramk = new i.a(this.mContext);
      paramk.UF(paramString.title);
      paramk.UG(paramString.content);
      paramk.lm(false);
      paramk.Bj(R.l.eed).a(this.mQu);
      paramk.ZT().show();
      GMTrace.o(12694849585152L, 94584);
      return;
    }
    paramString = new i.a(this.mContext);
    paramString.Bh(R.l.eee);
    paramString.Bj(R.l.eed);
    paramString.ZT().show();
    GMTrace.o(12694849585152L, 94584);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12694715367424L, 94583);
    if (!(paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
    {
      w.e("MicroMsg.GameSubscriptionClickListener", "No GameAppInfo");
      GMTrace.o(12694715367424L, 94583);
      return;
    }
    this.mzY = ((com.tencent.mm.plugin.game.model.c)paramView.getTag());
    w.i("MicroMsg.GameSubscriptionClickListener", "Clicked appid = " + this.mzY.field_appId);
    ap.wT().a(1219, this);
    paramView = v.bMQ();
    paramView = new ax(this.mzY.field_appId, paramView, this.mzY.fuy, this.mzY.mzk);
    ap.wT().a(paramView, 0);
    GMTrace.o(12694715367424L, 94583);
  }
  
  public static final class a
  {
    public String mQw;
    public String mQx;
    public String message;
    public String url;
    
    public a()
    {
      GMTrace.i(12758334570496L, 95057);
      GMTrace.o(12758334570496L, 95057);
    }
  }
  
  public static final class b
  {
    public String content;
    public Boolean mQy;
    public t.a mQz;
    public String title;
    
    public b()
    {
      GMTrace.i(12697131286528L, 94601);
      GMTrace.o(12697131286528L, 94601);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */