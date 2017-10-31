package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.a;
import com.tencent.mm.plugin.game.model.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.sdk.platformtools.w;

public class GameInfoViewForeign
  extends RelativeLayout
{
  private int gCX;
  int mBs;
  private Context mContext;
  private int mMl;
  private TextView mMp;
  private View.OnClickListener mMq;
  
  public GameInfoViewForeign(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12718069252096L, 94757);
    this.mBs = 0;
    this.gCX = 0;
    this.mMl = 2;
    this.mMq = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12661026717696L, 94332);
        int i;
        if ((paramAnonymousView.getTag() != null) && ((paramAnonymousView.getTag() instanceof String)))
        {
          paramAnonymousView = (String)paramAnonymousView.getTag();
          i = c.p(GameInfoViewForeign.a(GameInfoViewForeign.this), paramAnonymousView, "game_center_msgcenter");
        }
        for (;;)
        {
          paramAnonymousView = ai.co("resource", "5");
          ai.a(GameInfoViewForeign.a(GameInfoViewForeign.this), 10, 1001, GameInfoViewForeign.b(GameInfoViewForeign.this), i, 0, null, GameInfoViewForeign.c(GameInfoViewForeign.this), 0, null, null, paramAnonymousView);
          GMTrace.o(12661026717696L, 94332);
          return;
          paramAnonymousView = a.aDY();
          if (paramAnonymousView.fJg == 2)
          {
            i = c.p(GameInfoViewForeign.a(GameInfoViewForeign.this), paramAnonymousView.url, "game_center_msgcenter");
          }
          else
          {
            paramAnonymousView = new Intent(GameInfoViewForeign.a(GameInfoViewForeign.this), GameMessageUI.class);
            paramAnonymousView.putExtra("game_report_from_scene", 1001);
            GameInfoViewForeign.a(GameInfoViewForeign.this).startActivity(paramAnonymousView);
            i = 6;
          }
        }
      }
    };
    this.mContext = paramContext;
    GMTrace.o(12718069252096L, 94757);
  }
  
  public final void aFz()
  {
    GMTrace.i(12718337687552L, 94759);
    this.gCX = SubCoreGameCenter.aFe().aEB();
    if ((this.gCX > 0) && (this.gCX <= 99))
    {
      this.mMp.setVisibility(0);
      this.mMp.setText(this.gCX);
      GMTrace.o(12718337687552L, 94759);
      return;
    }
    if (this.gCX > 99)
    {
      this.mMp.setVisibility(0);
      this.mMp.setText("99+");
      this.mMp.setTextSize(1, 9.0F);
      GMTrace.o(12718337687552L, 94759);
      return;
    }
    this.mMp.setVisibility(4);
    GMTrace.o(12718337687552L, 94759);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12718203469824L, 94758);
    super.onFinishInflate();
    setOnClickListener(this.mMq);
    this.mMp = ((TextView)findViewById(R.h.bNi));
    aFz();
    w.i("MicroMsg.GameInfoViewForeign", "initView finished");
    GMTrace.o(12718203469824L, 94758);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameInfoViewForeign.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */