package com.tencent.mm.plugin.collect.reward.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.plugin.wallet_core.ui.k.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.ka;
import com.tencent.mm.protocal.c.kp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(1)
public class QrRewardMainUI
  extends QrRewardBaseUI
{
  private String desc;
  private String fQn;
  private String iDD;
  private final int kLO;
  private Button kLP;
  private ViewGroup kLQ;
  private ViewGroup kLR;
  private RelativeLayout kLS;
  private CdnImageView kLT;
  private ImageView kLU;
  private ImageView kLV;
  private MMEditText kLW;
  private TextView kLX;
  private TextView kLY;
  private TextView kLZ;
  private TextView kMa;
  private ScrollView kMb;
  private String kMc;
  private String kMd;
  private String kMe;
  private int kMf;
  private int kMg;
  private boolean kMh;
  private boolean kMi;
  private boolean mIsOpen;
  private String username;
  
  public QrRewardMainUI()
  {
    GMTrace.i(19366007537664L, 144288);
    this.kLO = com.tencent.mm.bq.a.fromDPToPix(this.vov.voR, 217);
    this.mIsOpen = false;
    GMTrace.o(19366007537664L, 144288);
  }
  
  private void anS()
  {
    GMTrace.i(19367215497216L, 144297);
    if (com.tencent.mm.plugin.collect.reward.b.a.anM().anN())
    {
      CdnImageView localCdnImageView = this.kLT;
      com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.anM();
      localCdnImageView.O(com.tencent.mm.plugin.collect.reward.b.a.kLl + locala.anO(), this.kLO, this.kLO);
      this.kLS.setVisibility(0);
      GMTrace.o(19367215497216L, 144297);
      return;
    }
    this.kLS.setVisibility(4);
    GMTrace.o(19367215497216L, 144297);
  }
  
  private void anT()
  {
    GMTrace.i(19367349714944L, 144298);
    int j = Math.round(this.kLO * (this.kMg * 1.0F / this.kMf));
    ViewGroup.LayoutParams localLayoutParams = this.kLV.getLayoutParams();
    int i = j;
    if (j <= 0) {
      i = 248;
    }
    localLayoutParams.width = i;
    localLayoutParams.height = i;
    this.kLV.setLayoutParams(localLayoutParams);
    localLayoutParams = this.kLU.getLayoutParams();
    localLayoutParams.width = (i - 10);
    localLayoutParams.height = (i - 10);
    this.kLU.setLayoutParams(localLayoutParams);
    localLayoutParams = this.kLW.getLayoutParams();
    localLayoutParams.width = (i - 30);
    localLayoutParams.height = (i - 30);
    this.kLW.setLayoutParams(localLayoutParams);
    this.kLW.setTextSize(0, i / 2);
    this.kLR.requestLayout();
    if (!bg.mZ(this.desc)) {
      this.kLX.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, getString(R.l.evF, new Object[] { this.desc }), this.kLX.getTextSize()));
    }
    for (;;)
    {
      dI(bg.mZ(this.kMc));
      GMTrace.o(19367349714944L, 144298);
      return;
      this.kLX.setText("");
    }
  }
  
  private void anU()
  {
    GMTrace.i(19367483932672L, 144299);
    if (!bg.mZ(this.kMd))
    {
      this.kLZ.setClickable(true);
      this.kLZ.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
      com.tencent.mm.plugin.wallet_core.ui.k localk = new com.tencent.mm.plugin.wallet_core.ui.k(5, new k.a()
      {
        public final void anY()
        {
          GMTrace.i(19378355568640L, 144380);
          w.d("MicroMsg.QrRewardMainUI", "go to: %s", new Object[] { QrRewardMainUI.q(QrRewardMainUI.this) });
          com.tencent.mm.wallet_core.ui.e.m(QrRewardMainUI.this.vov.voR, QrRewardMainUI.q(QrRewardMainUI.this), false);
          com.tencent.mm.plugin.report.service.g.paX.i(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(6) });
          GMTrace.o(19378355568640L, 144380);
        }
      });
      SpannableString localSpannableString = new SpannableString(this.kMd);
      localSpannableString.setSpan(localk, 0, localSpannableString.length(), 18);
      this.kLZ.setText(localSpannableString);
      this.kLZ.setVisibility(0);
      GMTrace.o(19367483932672L, 144299);
      return;
    }
    this.kLZ.setVisibility(8);
    GMTrace.o(19367483932672L, 144299);
  }
  
  private void anV()
  {
    GMTrace.i(19367752368128L, 144301);
    if (!bg.mZ(this.kMc))
    {
      this.kLW.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.vov.voR, this.kMc, this.kLW.getTextSize()));
      this.kLW.setSelection(this.kMc.length());
    }
    GMTrace.o(19367752368128L, 144301);
  }
  
  private void anW()
  {
    GMTrace.i(19367886585856L, 144302);
    w.i("MicroMsg.QrRewardMainUI", "do set photo word");
    com.tencent.mm.plugin.collect.reward.a.g localg = new com.tencent.mm.plugin.collect.reward.a.g(this.kMc);
    localg.l(this);
    b(localg, true);
    GMTrace.o(19367886585856L, 144302);
  }
  
  private void dI(boolean paramBoolean)
  {
    GMTrace.i(19367618150400L, 144300);
    w.i("MicroMsg.QrRewardMainUI", "switch mode: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.kLU.setVisibility(0);
      this.kLW.setVisibility(4);
      a.b.g(this.kLU, this.username, R.g.aYg);
      GMTrace.o(19367618150400L, 144300);
      return;
    }
    this.kLU.setVisibility(4);
    this.kLW.setVisibility(0);
    GMTrace.o(19367618150400L, 144300);
  }
  
  private void h(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(19367081279488L, 144296);
    if ((this.iDD != null) && (this.iDD.equals(paramString1))) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = com.tencent.mm.plugin.collect.reward.b.a.anM().anN();
      w.i("MicroMsg.QrRewardMainUI", "do download photo: %s, same url: %s, pic exist: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((paramBoolean) || (!bool1) || (!bool2))
      {
        com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.anM();
        com.tencent.mm.plugin.collect.reward.b.a.a local6 = new com.tencent.mm.plugin.collect.reward.b.a.a()
        {
          public final void A(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(19357820256256L, 144227);
            w.i("MicroMsg.QrRewardMainUI", "callback ret: %s, %s, %s", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
              com.tencent.mm.sdk.platformtools.af.u(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19376744955904L, 144368);
                  QrRewardMainUI.p(QrRewardMainUI.this);
                  GMTrace.o(19376744955904L, 144368);
                }
              });
            }
            GMTrace.o(19357820256256L, 144227);
          }
        };
        w.i("MicroMsg.QrRewardCdnDownloadHelper", "downloadImage. imageId:%s", new Object[] { paramString1 });
        Object localObject = new File(com.tencent.mm.plugin.collect.reward.b.a.kLl);
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdirs();
        }
        localObject = new com.tencent.mm.modelcdntran.h();
        ((com.tencent.mm.modelcdntran.h)localObject).fRd = false;
        ((com.tencent.mm.modelcdntran.h)localObject).hsO = locala;
        ((com.tencent.mm.modelcdntran.h)localObject).field_fullpath = (com.tencent.mm.plugin.collect.reward.b.a.kLl + locala.anO());
        ((com.tencent.mm.modelcdntran.h)localObject).field_mediaId = bg.mY(com.tencent.mm.modelcdntran.d.a("QrRewardImg", bg.Pp(), com.tencent.mm.x.m.Al().field_username, ""));
        ((com.tencent.mm.modelcdntran.h)localObject).field_fileId = paramString1;
        ((com.tencent.mm.modelcdntran.h)localObject).field_aesKey = paramString2;
        ((com.tencent.mm.modelcdntran.h)localObject).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FILE;
        ((com.tencent.mm.modelcdntran.h)localObject).field_priority = com.tencent.mm.modelcdntran.b.hrv;
        ((com.tencent.mm.modelcdntran.h)localObject).field_needStorage = false;
        ((com.tencent.mm.modelcdntran.h)localObject).field_isStreamMedia = false;
        ((com.tencent.mm.modelcdntran.h)localObject).field_appType = 0;
        ((com.tencent.mm.modelcdntran.h)localObject).field_bzScene = 0;
        if (locala.gMM == null) {
          locala.gMM = new HashMap();
        }
        locala.gMM.put(((com.tencent.mm.modelcdntran.h)localObject).field_mediaId, local6);
        if (!com.tencent.mm.modelcdntran.g.Gi().b((com.tencent.mm.modelcdntran.h)localObject, -1)) {
          w.e("MicroMsg.QrRewardCdnDownloadHelper", "ljd: cdntra addSendTask failed. imageId:%s", new Object[] { paramString1 });
        }
      }
      GMTrace.o(19367081279488L, 144296);
      return;
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(19366275973120L, 144290);
    this.kLP = ((Button)findViewById(R.h.cmE));
    this.kLQ = ((ViewGroup)findViewById(R.h.cmD));
    this.kLR = ((ViewGroup)findViewById(R.h.cmC));
    this.kLT = ((CdnImageView)findViewById(R.h.cmy));
    this.kLX = ((TextView)findViewById(R.h.cmB));
    this.kLU = ((ImageView)findViewById(R.h.cmx));
    this.kLV = ((ImageView)findViewById(R.h.cmw));
    this.kLS = ((RelativeLayout)findViewById(R.h.cmz));
    this.kLW = ((MMEditText)findViewById(R.h.cmA));
    this.kLY = ((TextView)findViewById(R.h.cmF));
    this.kMa = ((TextView)findViewById(R.h.cmH));
    this.kLZ = ((TextView)findViewById(R.h.cmv));
    a.b.g(this.kLU, this.username, R.g.aYg);
    try
    {
      this.kLW.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.vov.voR, this.kMc, this.kLW.getTextSize()));
      this.kLW.setSelection(this.kMc.length());
      this.kLW.addTextChangedListener(new TextWatcher()
      {
        int kMj;
        
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(19362115223552L, 144259);
          w.d("MicroMsg.QrRewardMainUI", "s: %s, %s", new Object[] { paramAnonymousEditable.toString(), Integer.valueOf(paramAnonymousEditable.length()) });
          String str = paramAnonymousEditable.toString();
          if (bg.mZ(str)) {
            this.kMj = 0;
          }
          for (;;)
          {
            paramAnonymousEditable.delete(this.kMj, paramAnonymousEditable.length());
            GMTrace.o(19362115223552L, 144259);
            return;
            if (this.kMj == 0) {
              if ((com.tencent.mm.bs.g.bOL().z(str)) || (com.tencent.mm.bs.g.bOL().y(str))) {
                this.kMj = paramAnonymousEditable.length();
              } else {
                this.kMj = 1;
              }
            }
          }
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(19361846788096L, 144257);
          GMTrace.o(19361846788096L, 144257);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(19361981005824L, 144258);
          GMTrace.o(19361981005824L, 144258);
        }
      });
      this.kLW.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(19373792165888L, 144346);
          w.i("MicroMsg.QrRewardMainUI", "action: %s", new Object[] { Integer.valueOf(paramAnonymousInt) });
          QrRewardMainUI.this.aKl();
          GMTrace.o(19373792165888L, 144346);
          return false;
        }
      });
      this.kLV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19362920529920L, 144265);
          w.d("MicroMsg.QrRewardMainUI", "click avatar");
          QrRewardMainUI.this.aKl();
          QrRewardMainUI.a(QrRewardMainUI.this);
          GMTrace.o(19362920529920L, 144265);
        }
      });
      this.kLY.setClickable(true);
      this.kLY.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
      com.tencent.mm.plugin.wallet_core.ui.k localk = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
      {
        public final void anY()
        {
          GMTrace.i(19373523730432L, 144344);
          w.i("MicroMsg.QrRewardMainUI", "click save code");
          QrRewardMainUI.b(QrRewardMainUI.this);
          com.tencent.mm.plugin.report.service.g.paX.i(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(5) });
          GMTrace.o(19373523730432L, 144344);
        }
      });
      SpannableString localSpannableString = new SpannableString(getString(R.l.evz));
      localSpannableString.setSpan(localk, 0, localSpannableString.length(), 18);
      this.kLY.setText(localSpannableString);
      this.kMa.setClickable(true);
      this.kMa.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
      localk = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
      {
        public final void anY()
        {
          GMTrace.i(19358893998080L, 144235);
          w.i("MicroMsg.QrRewardMainUI", "click set code, %s", new Object[] { Boolean.valueOf(QrRewardMainUI.c(QrRewardMainUI.this)) });
          QrRewardMainUI.a(QrRewardMainUI.this, false);
          GMTrace.o(19358893998080L, 144235);
        }
      });
      localSpannableString = new SpannableString(getString(R.l.evD));
      localSpannableString.setSpan(localk, 0, localSpannableString.length(), 18);
      this.kMa.setText(localSpannableString);
      anS();
      anT();
      anV();
      anU();
      GMTrace.o(19366275973120L, 144290);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.QrRewardMainUI", localException, "", new Object[0]);
      }
    }
  }
  
  public final void anR()
  {
    GMTrace.i(19366544408576L, 144292);
    super.anR();
    w.i("MicroMsg.QrRewardMainUI", "key board changed: %s", new Object[] { Integer.valueOf(this.vov.vpj) });
    if (this.vov.vpj == 2)
    {
      this.kMc = this.kLW.getText().toString();
      anW();
      if (bg.mZ(this.kMc)) {
        dI(true);
      }
    }
    GMTrace.o(19366544408576L, 144292);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(19366410190848L, 144291);
    if ((paramk instanceof com.tencent.mm.plugin.collect.reward.a.b))
    {
      paramString = (com.tencent.mm.plugin.collect.reward.a.b)paramk;
      paramString.a(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(19365068013568L, 144281);
          QrRewardMainUI.a(QrRewardMainUI.this, paramString.kLe.klL);
          QrRewardMainUI.a(QrRewardMainUI.this, paramString.kLe.tGs);
          QrRewardMainUI.b(QrRewardMainUI.this, paramString.kLe.tGo);
          QrRewardMainUI.b(QrRewardMainUI.this, paramString.kLe.desc);
          QrRewardMainUI.c(QrRewardMainUI.this, paramString.kLe.rMv);
          paramAnonymousk = QrRewardMainUI.this;
          boolean bool;
          if (!paramString.kLe.tGl)
          {
            bool = true;
            QrRewardMainUI.b(paramAnonymousk, bool);
            QrRewardMainUI.d(QrRewardMainUI.this, paramString.kLe.kpd);
            QrRewardMainUI.e(QrRewardMainUI.this, paramString.kLe.tGq);
            QrRewardMainUI.d(QrRewardMainUI.this);
            QrRewardMainUI.e(QrRewardMainUI.this);
            if (QrRewardMainUI.f(QrRewardMainUI.this)) {
              break label248;
            }
            QrRewardMainUI.g(QrRewardMainUI.this);
          }
          for (;;)
          {
            QrRewardMainUI.f(QrRewardMainUI.this, paramString.kLe.tGm);
            QrRewardMainUI.anX();
            w.d("MicroMsg.QrRewardMainUI", "url: %s", new Object[] { QrRewardMainUI.j(QrRewardMainUI.this) });
            GMTrace.o(19365068013568L, 144281);
            return;
            bool = false;
            break;
            label248:
            QrRewardMainUI.a(QrRewardMainUI.this, paramString.kLe.tGm, paramString.kLe.tGn);
            QrRewardMainUI.h(QrRewardMainUI.this);
            QrRewardMainUI.i(QrRewardMainUI.this);
          }
        }
      }).b(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(19365604884480L, 144285);
          w.e("MicroMsg.QrRewardMainUI", "get code error: %s, %s", new Object[] { Integer.valueOf(paramString.kLe.kKx), paramString.kLe.kKy });
          if (!bg.mZ(paramString.kLe.kKy)) {
            Toast.makeText(QrRewardMainUI.this, paramString.kLe.kKy, 0).show();
          }
          if (!paramString.kLf) {
            QrRewardMainUI.a(QrRewardMainUI.this, false);
          }
          GMTrace.o(19365604884480L, 144285);
        }
      }).c(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(19364799578112L, 144279);
          w.e("MicroMsg.QrRewardMainUI", "net error: %s", new Object[] { paramAnonymousk });
          if (!paramString.kLf) {
            QrRewardMainUI.a(QrRewardMainUI.this, false);
          }
          GMTrace.o(19364799578112L, 144279);
        }
      });
      GMTrace.o(19366410190848L, 144291);
      return true;
    }
    if ((paramk instanceof com.tencent.mm.plugin.collect.reward.a.g))
    {
      paramString = (com.tencent.mm.plugin.collect.reward.a.g)paramk;
      paramString.a(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(19362652094464L, 144263);
          w.i("MicroMsg.QrRewardMainUI", "set succ: %s, %s", new Object[] { paramString.klL, QrRewardMainUI.l(QrRewardMainUI.this).getText() });
          if (paramString.klL.equals(QrRewardMainUI.m(QrRewardMainUI.this))) {
            com.tencent.mm.kernel.h.xz().xi().a(w.a.vdG, QrRewardMainUI.m(QrRewardMainUI.this));
          }
          GMTrace.o(19362652094464L, 144263);
        }
      }).b(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(19379160875008L, 144386);
          w.e("MicroMsg.QrRewardMainUI", "set word error: %s, %s", new Object[] { Integer.valueOf(paramString.kLk.kKx), paramString.kLk.kKy });
          QrRewardMainUI.a(QrRewardMainUI.this, (String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdG, ""));
          QrRewardMainUI.c(QrRewardMainUI.this, QrRewardMainUI.k(QrRewardMainUI.this));
          QrRewardMainUI.l(QrRewardMainUI.this).setText("");
          QrRewardMainUI.i(QrRewardMainUI.this);
          if (!bg.mZ(paramString.kLk.kKy)) {
            Toast.makeText(QrRewardMainUI.this, paramString.kLk.kKy, 0).show();
          }
          GMTrace.o(19379160875008L, 144386);
        }
      }).c(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(19377818697728L, 144376);
          w.e("MicroMsg.QrRewardMainUI", "net error: %s", new Object[] { paramAnonymousk });
          QrRewardMainUI.a(QrRewardMainUI.this, (String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdG, ""));
          QrRewardMainUI.c(QrRewardMainUI.this, QrRewardMainUI.k(QrRewardMainUI.this));
          QrRewardMainUI.l(QrRewardMainUI.this).setText("");
          QrRewardMainUI.i(QrRewardMainUI.this);
          GMTrace.o(19377818697728L, 144376);
        }
      });
      this.kLW.clearFocus();
      this.kLW.setCursorVisible(false);
    }
    GMTrace.o(19366410190848L, 144291);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19366812844032L, 144294);
    int i = R.i.ddt;
    GMTrace.o(19366812844032L, 144294);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19366678626304L, 144293);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        this.desc = paramIntent.getStringExtra("key_desc");
        this.kMf = paramIntent.getIntExtra("key_photo_width", 900);
        this.kMg = paramIntent.getIntExtra("key_icon_width", 343);
        boolean bool = paramIntent.getBooleanExtra("key_return_from_first", true);
        w.i("MicroMsg.QrRewardMainUI", "return from first: %s", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          this.kLR.setVisibility(0);
          this.kLQ.setVisibility(8);
        }
        this.kMi = true;
        anT();
        String str = paramIntent.getStringExtra("key_photo_url");
        h(str, paramIntent.getStringExtra("key_photo_aeskey"), true);
        this.iDD = str;
        GMTrace.o(19366678626304L, 144293);
      }
    }
    else {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    GMTrace.o(19366678626304L, 144293);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19366141755392L, 144289);
    super.onCreate(paramBundle);
    paramBundle = getWindow().getAttributes();
    if (paramBundle.screenBrightness < 0.85F)
    {
      paramBundle.screenBrightness = 0.85F;
      getWindow().setAttributes(paramBundle);
    }
    hz(1323);
    hz(1649);
    this.kMf = ((Integer)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdE, Integer.valueOf(900))).intValue();
    this.kMg = ((Integer)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdF, Integer.valueOf(343))).intValue();
    this.desc = ((String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdH, ""));
    this.kMc = ((String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdG, ""));
    this.kMd = ((String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdL, ""));
    this.kMe = ((String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdM, ""));
    this.iDD = ((String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdN, ""));
    if (!bg.mZ((String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdK, ""))) {
      this.kMi = true;
    }
    this.username = com.tencent.mm.x.m.zF();
    oC(R.l.evw);
    MH();
    if ((com.tencent.mm.plugin.collect.reward.b.a.anM().anN()) && (this.kMi)) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.QrRewardMainUI", "do get code: %s", new Object[] { Boolean.valueOf(bool) });
      paramBundle = new com.tencent.mm.plugin.collect.reward.a.b(bool);
      paramBundle.l(this);
      if (!bool) {
        break;
      }
      b(paramBundle, false);
      GMTrace.o(19366141755392L, 144289);
      return;
    }
    b(paramBundle, true);
    GMTrace.o(19366141755392L, 144289);
  }
  
  public void onDestroy()
  {
    GMTrace.i(19366947061760L, 144295);
    super.onDestroy();
    hA(1323);
    hA(1649);
    com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.anM();
    w.d("MicroMsg.QrRewardCdnDownloadHelper", "do clear callback");
    if (locala.gMM != null)
    {
      w.i("MicroMsg.QrRewardCdnDownloadHelper", "callback size: %s", new Object[] { Integer.valueOf(locala.gMM.size()) });
      locala.gMM.clear();
    }
    GMTrace.o(19366947061760L, 144295);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/ui/QrRewardMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */