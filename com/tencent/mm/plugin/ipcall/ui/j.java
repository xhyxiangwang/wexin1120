package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.b.b.a;
import com.tencent.mm.plugin.ipcall.a.b.d.1;
import com.tencent.mm.plugin.ipcall.a.b.d.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.e;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.af;
import com.tencent.mm.x.ap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class j
  implements b.a, e
{
  ImageView iil;
  TextView iiq;
  String mHB;
  DialPad naM;
  String ndi;
  String ndj;
  String ndk;
  String ndl;
  int ndm;
  int ndn;
  IPCallFuncButton nhA;
  IPCallFuncButton nhB;
  ImageButton nhC;
  public TextView nhD;
  public View nhE;
  ImageButton nhF;
  int nhG;
  String nhH;
  public IPCallTalkUI nhI;
  public com.tencent.mm.plugin.ipcall.c nhJ;
  a nhK;
  private long nhL;
  public long nhM;
  public boolean nhN;
  public boolean nhO;
  private AudioManager nhP;
  boolean nhQ;
  private boolean nhR;
  boolean nhS;
  Bitmap nhn;
  public EditText nhw;
  TextView nhx;
  ImageView nhy;
  IPCallFuncButton nhz;
  
  public j(IPCallTalkUI paramIPCallTalkUI)
  {
    GMTrace.i(11700833091584L, 87178);
    this.nhG = -1;
    this.nhM = -1L;
    this.nhN = false;
    this.nhO = false;
    this.nhP = null;
    this.nhQ = false;
    this.nhR = true;
    this.nhS = false;
    this.nhI = paramIPCallTalkUI;
    this.nhJ = i.aHq();
    this.nhJ.mVH = this;
    GMTrace.o(11700833091584L, 87178);
  }
  
  private void c(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(11700967309312L, 87179);
    aIx();
    if (!bg.mZ(paramString1)) {}
    for (;;)
    {
      if ((2 == paramInt) && (paramString2 != null))
      {
        this.iiq.setText(paramString2);
        GMTrace.o(11700967309312L, 87179);
        return;
        if (bg.mZ(paramString3)) {
          paramString1 = this.nhI.getString(R.l.ehz);
        }
      }
      else
      {
        if ((1 == paramInt) && (paramString2 != null)) {
          com.tencent.mm.ui.base.h.a(this.nhI, paramString2, paramString1, this.nhI.getString(R.l.ehA), false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(11655870152704L, 86843);
              j.this.nhI.finish();
              GMTrace.o(11655870152704L, 86843);
            }
          });
        }
        GMTrace.o(11700967309312L, 87179);
        return;
      }
      paramString1 = paramString3;
    }
  }
  
  final void Aa(String paramString)
  {
    GMTrace.i(11701369962496L, 87182);
    if (!bg.mZ(this.mHB))
    {
      cB(this.mHB, com.tencent.mm.plugin.ipcall.b.a.Ak(paramString));
      GMTrace.o(11701369962496L, 87182);
      return;
    }
    cB(com.tencent.mm.plugin.ipcall.b.a.Ak(paramString), "");
    GMTrace.o(11701369962496L, 87182);
  }
  
  public final void aGC()
  {
    int j = 0;
    GMTrace.i(11701772615680L, 87185);
    w.i("MicroMsg.TalkUIController", "onInviteSuccess");
    String str1 = i.aHl().mWy.mXI;
    String str2 = i.aHl().mWy.mXJ;
    if ((!bg.mZ(str1)) && (!bg.mZ(str2)) && (!str1.equals(str2)))
    {
      w.i("MicroMsg.TalkUIController", "toPhoneNumber:%s,serverRetPhoneNumber:%s", new Object[] { str1, str2 });
      Aa(str2);
    }
    w.i("MicroMsg.TalkUIController", "callFlag:" + i.aHl().mWy.mXw);
    int k = i.aHl().mWy.mXw;
    int i = j;
    if ((k & 0x1) > 0)
    {
      i = j;
      if ((k & 0x2) > 0)
      {
        i = j;
        if ((k & 0x8) <= 0) {
          i = 1;
        }
      }
    }
    if (i != 0)
    {
      w.i("MicroMsg.TalkUIController", "isNotFree");
      com.tencent.mm.ui.base.h.a(this.nhI, R.l.eiB, R.l.eiC, R.l.eiA, R.l.eiz, true, null, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11670768320512L, 86954);
          w.i("MicroMsg.TalkUIController", "user choose end this call because isNotFree");
          j.this.aIw();
          GMTrace.o(11670768320512L, 86954);
        }
      });
    }
    pr(3);
    GMTrace.o(11701772615680L, 87185);
  }
  
  public final void aGD()
  {
    GMTrace.i(11701906833408L, 87186);
    w.d("MicroMsg.TalkUIController", "onStartRing");
    if (i.aHp().aHg())
    {
      this.nhN = this.nhB.isChecked();
      this.nhO = this.nhB.isChecked();
      i.aHo().fo(this.nhB.isChecked());
    }
    GMTrace.o(11701906833408L, 87186);
  }
  
  public final void aGR()
  {
    GMTrace.i(11702041051136L, 87187);
    w.d("MicroMsg.TalkUIController", "onUserAccept");
    if (i.aHp().aHg())
    {
      this.nhN = this.nhB.isChecked();
      this.nhO = this.nhB.isChecked();
      i.aHo().fo(this.nhB.isChecked());
    }
    if (i.aHp().aHh()) {
      i.aHo().mXU.ck(this.nhz.isChecked());
    }
    GMTrace.o(11702041051136L, 87187);
  }
  
  public final void aGS()
  {
    GMTrace.i(11702175268864L, 87188);
    w.d("MicroMsg.TalkUIController", "onOthersideShutdown");
    aIx();
    pr(10);
    ap.getNotification().cancel(42);
    if (this.nhK != null) {
      this.nhK.fz(true);
    }
    GMTrace.o(11702175268864L, 87188);
  }
  
  public final void aGT()
  {
    GMTrace.i(11702846357504L, 87193);
    this.nhI.finish();
    GMTrace.o(11702846357504L, 87193);
  }
  
  public final void aGU()
  {
    GMTrace.i(11702712139776L, 87192);
    this.nhL = i.aHq().aGN();
    pr(5);
    GMTrace.o(11702712139776L, 87192);
  }
  
  final void aIu()
  {
    GMTrace.i(11701101527040L, 87180);
    i.aHo().fsU = this.nhI;
    Object localObject = i.aHo();
    ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXV.mYm = ((d.a)localObject);
    localObject = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).mXV;
    if (!((com.tencent.mm.plugin.ipcall.a.b.d)localObject).kha.uPi)
    {
      ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).kha.a((SensorController.a)localObject);
      d.1 local1 = new d.1((com.tencent.mm.plugin.ipcall.a.b.d)localObject);
      if (!((com.tencent.mm.plugin.ipcall.a.b.d)localObject).khe.L(local1)) {
        break label103;
      }
    }
    label103:
    for (((com.tencent.mm.plugin.ipcall.a.b.d)localObject).khf = 0L;; ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).khf = -1L)
    {
      i.aHo().mXZ = this;
      i.aHo().a(this);
      GMTrace.o(11701101527040L, 87180);
      return;
    }
  }
  
  final void aIv()
  {
    GMTrace.i(11701235744768L, 87181);
    this.nhw.setKeyListener(null);
    this.nhw.setHorizontallyScrolling(true);
    this.naM.setVisibility(4);
    DialPad localDialPad = this.naM;
    localDialPad.naE = true;
    Iterator localIterator = localDialPad.naH.values().iterator();
    while (localIterator.hasNext()) {
      ((DialNumberButton)localIterator.next()).fu(true);
    }
    localIterator = localDialPad.naJ.values().iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      if (localDialPad.naE) {
        localView.setBackgroundDrawable(localDialPad.getResources().getDrawable(R.e.aQu));
      } else {
        localView.setBackgroundDrawable(localDialPad.getResources().getDrawable(R.e.aOc));
      }
    }
    if (!bg.mZ(this.nhH)) {
      Aa(this.nhH);
    }
    if (com.tencent.mm.compatible.util.d.et(16))
    {
      this.nhw.setTypeface(Typeface.create("sans-serif-light", 0));
      this.nhx.setTypeface(Typeface.create("sans-serif-light", 0));
    }
    if (!bg.mZ(this.ndj)) {
      this.nhn = com.tencent.mm.plugin.ipcall.b.a.f(this.nhI, this.ndj, true);
    }
    if ((this.nhn == null) && (!bg.mZ(this.ndi)) && (com.tencent.mm.plugin.ipcall.b.a.Ho())) {
      this.nhn = com.tencent.mm.plugin.ipcall.b.a.al(this.nhI, this.ndi);
    }
    if ((this.nhn == null) && (!bg.mZ(this.ndl))) {
      this.nhn = com.tencent.mm.ab.b.c(this.ndl, 480, 480, 4);
    }
    if (this.nhn == null)
    {
      this.nhy.setVisibility(0);
      this.iil.setVisibility(8);
    }
    if (this.nhn != null)
    {
      this.nhy.setVisibility(8);
      this.iil.setVisibility(0);
      this.iil.setImageBitmap(this.nhn);
    }
    this.nhF.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View arg1)
      {
        GMTrace.i(11662446821376L, 86892);
        com.tencent.mm.plugin.ipcall.c localc = i.aHq();
        synchronized (localc.lOy)
        {
          if (i.aHp().aHf())
          {
            if (localc.mVP)
            {
              localc.aGL();
              GMTrace.o(11662446821376L, 86892);
              return;
            }
            localc.mVP = true;
            Toast.makeText(ab.getContext(), R.l.eqq, 0).show();
            Intent localIntent = new Intent();
            localIntent.setFlags(268435456);
            localIntent.setClass(ab.getContext(), IPCallTalkUI.class);
            localIntent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
            com.tencent.mm.plugin.voip.model.d.brN().a(localIntent, localc.mVQ);
            localc.aGL();
            if (localc.mVH != null) {
              localc.mVH.aGT();
            }
          }
          GMTrace.o(11662446821376L, 86892);
          return;
        }
      }
    });
    this.nhB.nem = new IPCallFuncButton.a()
    {
      public final void fx(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11686606012416L, 87072);
        w.d("MicroMsg.TalkUIController", "switch speaker, isChecked: %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (i.aHp().aHg())
        {
          j.this.nhN = paramAnonymousBoolean;
          j.this.nhO = paramAnonymousBoolean;
          i.aHo().fo(paramAnonymousBoolean);
          com.tencent.mm.plugin.report.service.g.paX.i(12057, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(11686606012416L, 87072);
          return;
        }
        if ((!i.aHv().buj()) && (!i.aHp().aHi())) {
          i.aHv().iE(paramAnonymousBoolean);
        }
        GMTrace.o(11686606012416L, 87072);
      }
    };
    this.nhz.nem = new IPCallFuncButton.a()
    {
      public final void fx(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11675868594176L, 86992);
        com.tencent.mm.plugin.ipcall.a.c.a locala;
        if (i.aHp().aHh())
        {
          w.d("MicroMsg.TalkUIController", "switch mute, isChecked: %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
          locala = i.aHm();
          if (!paramAnonymousBoolean) {
            break label139;
          }
        }
        label139:
        for (int i = locala.mYp.qO(412);; i = locala.mYp.qO(413))
        {
          if (i < 0) {
            w.e("MicroMsg.IPCallEngineManager", "tryMuteMicrophone ret:" + i);
          }
          i.aHo().mXU.ck(paramAnonymousBoolean);
          com.tencent.mm.plugin.report.service.g.paX.i(12057, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(11675868594176L, 86992);
          return;
        }
      }
    };
    this.nhA.nem = new IPCallFuncButton.a()
    {
      public final void fx(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11623255244800L, 86600);
        if (paramAnonymousBoolean)
        {
          localj = j.this;
          if (localj.nhn == null) {
            localj.iil.setVisibility(8);
          }
          for (;;)
          {
            localj.iil.setVisibility(8);
            localj.nhy.setVisibility(8);
            localj.nhw.setText("");
            localj.nhx.setText("");
            localj.naM.setVisibility(0);
            com.tencent.mm.plugin.report.service.g.paX.i(12057, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
            GMTrace.o(11623255244800L, 86600);
            return;
            localj.iil.setVisibility(4);
          }
        }
        j localj = j.this;
        if (localj.nhn != null)
        {
          localj.iil.setVisibility(0);
          localj.nhy.setVisibility(8);
        }
        for (;;)
        {
          localj.Aa(localj.nhH);
          localj.naM.setVisibility(4);
          break;
          localj.nhy.setVisibility(0);
          localj.iil.setVisibility(8);
        }
      }
    };
    this.nhC.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11661238861824L, 86883);
        j.this.aIw();
        GMTrace.o(11661238861824L, 86883);
      }
    });
    this.naM.naK = new DialPad.a()
    {
      public final void zK(String paramAnonymousString)
      {
        GMTrace.i(11649696137216L, 86797);
        String str2 = j.this.nhw.getText().toString();
        if (bg.mZ(str2)) {
          j.this.nhM = System.currentTimeMillis();
        }
        long l = System.currentTimeMillis();
        String str1 = str2;
        if (l - j.this.nhM >= 3000L) {
          str1 = str2 + " ";
        }
        str1 = str1 + paramAnonymousString;
        j.this.nhM = l;
        j.this.cB(str1, "");
        com.tencent.mm.plugin.ipcall.c.zB(paramAnonymousString);
        com.tencent.mm.plugin.report.service.g.paX.i(12057, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
        GMTrace.o(11649696137216L, 86797);
      }
      
      public final void zL(String paramAnonymousString)
      {
        GMTrace.i(11649830354944L, 86798);
        GMTrace.o(11649830354944L, 86798);
      }
    };
    GMTrace.o(11701235744768L, 87181);
  }
  
  public final void aIw()
  {
    GMTrace.i(16062775033856L, 119677);
    this.nhJ.cl(0, 0);
    ap.getNotification().cancel(42);
    this.nhI.finish();
    GMTrace.o(16062775033856L, 119677);
  }
  
  public final void aIx()
  {
    GMTrace.i(11702980575232L, 87194);
    if (this.nhD != null) {
      this.nhD.setVisibility(4);
    }
    if (this.nhE != null) {
      this.nhE.setVisibility(4);
    }
    GMTrace.o(11702980575232L, 87194);
  }
  
  public final void c(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(11702309486592L, 87189);
    w.d("MicroMsg.TalkUIController", "onError, error: %d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt2 == 1) {
      this.nhR = false;
    }
    if (paramInt1 == 8) {
      if (paramInt2 == 1)
      {
        if (!bg.mZ(paramString1)) {
          break label184;
        }
        paramString1 = this.nhI.getString(R.l.ehz);
      }
    }
    label184:
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this.nhI, paramString2, paramString1, this.nhI.getString(R.l.ehA), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11705799147520L, 87215);
          j.this.nhI.finish();
          GMTrace.o(11705799147520L, 87215);
        }
      });
      for (;;)
      {
        ap.getNotification().cancel(42);
        if ((this.nhK != null) && (!this.nhS)) {
          this.nhK.fz(this.nhR);
        }
        GMTrace.o(11702309486592L, 87189);
        return;
        c(paramString1, paramString2, paramInt2, this.nhI.getString(R.l.ehy));
        continue;
        if (paramInt1 != 10) {}
        c(paramString1, paramString2, paramInt2, null);
      }
    }
  }
  
  public final void cB(String paramString1, String paramString2)
  {
    GMTrace.i(11701504180224L, 87183);
    this.nhw.setText(paramString1);
    if (!bg.mZ(paramString1)) {
      this.nhw.setSelection(this.nhw.getText().length() - 1);
    }
    this.nhx.setText(paramString2);
    GMTrace.o(11701504180224L, 87183);
  }
  
  public final void fr(boolean paramBoolean)
  {
    GMTrace.i(11702443704320L, 87190);
    w.d("MicroMsg.TalkUIController", "onHeadsetPlugStateChange, isPlugged: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (i.aHp().aHg())
    {
      if (paramBoolean)
      {
        i.aHo();
        this.nhN = com.tencent.mm.plugin.ipcall.a.b.a.sr();
        i.aHo().fo(false);
        this.nhB.fw(false);
        GMTrace.o(11702443704320L, 87190);
        return;
      }
      i.aHo().fo(this.nhN);
      this.nhB.fw(true);
      this.nhB.setChecked(this.nhN);
    }
    GMTrace.o(11702443704320L, 87190);
  }
  
  public final void fs(boolean paramBoolean)
  {
    GMTrace.i(11702577922048L, 87191);
    w.d("MicroMsg.TalkUIController", "onBluetoothPlugStateChange, isPlugged: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (i.aHp().aHg())
    {
      if (paramBoolean)
      {
        i.aHo();
        this.nhO = com.tencent.mm.plugin.ipcall.a.b.a.sr();
        i.aHo().fo(false);
        this.nhB.fw(false);
        GMTrace.o(11702577922048L, 87191);
        return;
      }
      i.aHo().fo(this.nhO);
      this.nhB.fw(true);
      this.nhB.setChecked(this.nhO);
    }
    GMTrace.o(11702577922048L, 87191);
  }
  
  public final void pr(int paramInt)
  {
    GMTrace.i(11701638397952L, 87184);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11701638397952L, 87184);
      return;
      GMTrace.o(11701638397952L, 87184);
      return;
      paramInt = i.aHl().mWy.mXw;
      Object localObject = ab.getContext();
      if (((paramInt & 0x1) > 0) && ((paramInt & 0x2) <= 0)) {
        localObject = ((Context)localObject).getString(R.l.ejn) + " ";
      }
      while (this.nhG != -1)
      {
        String str = com.tencent.mm.plugin.ipcall.b.a.ps(this.nhG);
        this.iiq.setText((String)localObject + this.nhI.getString(R.l.eit, new Object[] { str }));
        GMTrace.o(11701638397952L, 87184);
        return;
        if ((paramInt & 0x8) > 0) {
          localObject = ((Context)localObject).getString(R.l.ejo) + " ";
        } else {
          localObject = "";
        }
      }
      this.iiq.setText((String)localObject + this.nhI.getString(R.l.eis));
      GMTrace.o(11701638397952L, 87184);
      return;
      GMTrace.o(11701638397952L, 87184);
      return;
      this.iiq.setText(String.format("%02d:%02d", new Object[] { Long.valueOf(this.nhL / 60L), Long.valueOf(this.nhL % 60L) }));
      GMTrace.o(11701638397952L, 87184);
      return;
      this.iiq.setText(R.l.eiv);
    }
  }
  
  public static abstract interface a
  {
    public abstract void fz(boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */