package com.tencent.mm.plugin.wallet_core.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.tools.a.c;

public final class a
{
  public static i a(final Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, h.b paramb, final DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(17095714668544L, 127373);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(17095714668544L, 127373);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.lm(false);
    locala.ln(true);
    locala.Bk(R.l.duP).b(paramOnClickListener);
    locala.UF(paramString1);
    paramString1 = View.inflate(paramContext, R.i.dhQ, null);
    paramOnClickListener = (EditText)paramString1.findViewById(R.h.bDn);
    if (!bg.mZ(paramString2)) {
      paramOnClickListener.append(paramString2);
    }
    paramString2 = (TextView)paramString1.findViewById(R.h.cBu);
    if (bg.mZ(paramString3)) {
      paramString2.setVisibility(8);
    }
    for (;;)
    {
      locala.Bj(R.l.dwr).a(false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6966839607296L, 51907);
          boolean bool = true;
          if (this.rXT != null) {
            bool = this.rXT.v(paramOnClickListener.getText().toString().trim());
          }
          if (bool)
          {
            paramAnonymousDialogInterface.dismiss();
            if ((paramContext instanceof MMActivity)) {
              af.u(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6970060832768L, 51931);
                  ((MMActivity)a.1.this.val$context).aKl();
                  GMTrace.o(6970060832768L, 51931);
                }
              });
            }
          }
          GMTrace.o(6966839607296L, 51907);
        }
      });
      if (paramInt > 0) {
        c.d(paramOnClickListener).Dr(paramInt).a(null);
      }
      locala.df(paramString1);
      paramString2 = locala.ZT();
      paramString2.show();
      if ((paramContext instanceof MMActivity)) {
        ((MMActivity)paramContext).a(paramString2);
      }
      if ((paramContext instanceof MMActivity)) {
        paramString1.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6967510695936L, 51912);
            ((MMActivity)this.val$context).aKp();
            GMTrace.o(6967510695936L, 51912);
          }
        });
      }
      GMTrace.o(17095714668544L, 127373);
      return paramString2;
      paramString2.setText(paramString3);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */