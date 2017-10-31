package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.an.a.a;
import com.tencent.mm.an.n;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.b;
import com.tencent.mm.plugin.game.model.q.d;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public class GameMessageBubbleView
  extends LinearLayout
  implements View.OnClickListener
{
  private Context mContext;
  private boolean mHasInit;
  View mNZ;
  private TextView mOa;
  private ImageView mOb;
  private q mOc;
  private final long mOd;
  private long mOe;
  
  public GameMessageBubbleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12748268240896L, 94982);
    this.mHasInit = false;
    this.mOd = 500L;
    this.mOe = 0L;
    this.mContext = paramContext;
    GMTrace.o(12748268240896L, 94982);
  }
  
  public final void aFE()
  {
    GMTrace.i(12748536676352L, 94984);
    SubCoreGameCenter.aFf();
    this.mOc = t.aEv();
    if (this.mOc == null)
    {
      this.mNZ.setOnClickListener(null);
      setVisibility(8);
      GMTrace.o(12748536676352L, 94984);
      return;
    }
    this.mOc.aEq();
    if ((this.mOc.field_msgType == 100) && ((bg.mZ(this.mOc.mAs.gEe)) || (bg.mZ(this.mOc.mAs.mBd)) || (bg.mZ(this.mOc.mAs.mBe)) || (!this.mOc.mAt.containsKey(this.mOc.mAs.mBe))))
    {
      w.w("MicroMsg.GameMessageHeaderView", "bubble is invalid");
      this.mNZ.setOnClickListener(null);
      setVisibility(8);
      GMTrace.o(12748536676352L, 94984);
      return;
    }
    this.mOa.setText(this.mOc.mAs.gEe);
    n.Ja().a(this.mOc.mAs.mBd, this.mOb);
    this.mNZ.setOnClickListener(this);
    setVisibility(0);
    GMTrace.o(12748536676352L, 94984);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12748670894080L, 94985);
    if (System.currentTimeMillis() - this.mOe <= 500L)
    {
      GMTrace.o(12748670894080L, 94985);
      return;
    }
    if (this.mOc == null)
    {
      GMTrace.o(12748670894080L, 94985);
      return;
    }
    SubCoreGameCenter.aFf();
    t.aEw();
    if (this.mOc.field_msgType == 100)
    {
      if (!bg.mZ(this.mOc.mAs.mBe))
      {
        paramView = (q.d)this.mOc.mAt.get(this.mOc.mAs.mBe);
        if (paramView != null)
        {
          i = r.a(this.mContext, this.mOc, paramView, this.mOc.field_appId, 1007);
          if (i != 0) {
            ai.a(this.mContext, 10, 1007, 1, i, 0, this.mOc.field_appId, 0, this.mOc.mAX, this.mOc.field_gameMsgId, this.mOc.mAY, null);
          }
          if (paramView.mBg != 4)
          {
            this.mOc.field_isRead = true;
            SubCoreGameCenter.aFe().c(this.mOc, new String[0]);
          }
        }
      }
      this.mOe = System.currentTimeMillis();
      GMTrace.o(12748670894080L, 94985);
      return;
    }
    if ((this.mOc != null) && (this.mOc.mAv != 3))
    {
      this.mOc.field_isRead = true;
      SubCoreGameCenter.aFe().c(this.mOc, new String[0]);
    }
    int i = 0;
    switch (this.mOc.mAv)
    {
    default: 
      w.e("MicroMsg.GameMessageHeaderView", "unknown bubble_action = " + this.mOc.mAv);
      GMTrace.o(12748670894080L, 94985);
      return;
    case 1: 
      paramView = this.mOc.mAh;
      if (!bg.mZ(paramView)) {
        i = c.p(this.mContext, paramView, "game_center_bubble");
      }
      break;
    }
    for (;;)
    {
      ai.a(this.mContext, 10, 1007, 1, i, 0, this.mOc.field_appId, 0, this.mOc.field_msgType, this.mOc.field_gameMsgId, this.mOc.mAY, null);
      this.mOe = System.currentTimeMillis();
      GMTrace.o(12748670894080L, 94985);
      return;
      if (!bg.mZ(this.mOc.field_appId))
      {
        paramView = new Bundle();
        paramView.putCharSequence("game_app_id", this.mOc.field_appId);
        paramView.putInt("game_report_from_scene", 1007);
        i = c.a(this.mContext, this.mOc.field_appId, null, paramView);
      }
      else
      {
        w.e("MicroMsg.GameMessageHeaderView", "message type : " + this.mOc.field_msgType + " ,message.field_appId is null.");
        continue;
        paramView = new Intent(this.mContext, GameMessageUI.class);
        paramView.putExtra("game_report_from_scene", 1007);
        this.mContext.startActivity(paramView);
        i = 6;
      }
    }
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12748402458624L, 94983);
    super.onFinishInflate();
    if (!this.mHasInit)
    {
      this.mOb = ((ImageView)findViewById(R.h.bNc));
      this.mOa = ((TextView)findViewById(R.h.bNb));
      this.mNZ = findViewById(R.h.bNd);
      setVisibility(8);
      this.mHasInit = true;
    }
    GMTrace.o(12748402458624L, 94983);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameMessageBubbleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */