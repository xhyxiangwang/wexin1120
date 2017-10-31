package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.oi;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.card.a.c.a;
import com.tencent.mm.plugin.card.a.d.a;
import com.tencent.mm.plugin.card.a.g.a;
import com.tencent.mm.plugin.card.a.i.a;
import com.tencent.mm.plugin.card.a.i.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.aa;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.r;
import com.tencent.mm.plugin.card.model.v;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.ui.view.x;
import com.tencent.mm.protocal.c.bfe;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.au.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CardDetailUI
  extends MMActivity
  implements com.tencent.mm.ac.e, c.a, d.a, i.a, au.a
{
  private final String TAG;
  private float gBS;
  private float gBT;
  private a.a gBY;
  private String hbQ;
  private com.tencent.mm.modelgeo.c hpz;
  private com.tencent.mm.ui.base.q iXW;
  private Vibrator kiq;
  private int kjz;
  private com.tencent.mm.plugin.card.base.b kmJ;
  private ArrayList<ji> kmP;
  private String kmv;
  private boolean knC;
  private String knl;
  private boolean krJ;
  private int krw;
  private boolean ksF;
  private int ktC;
  private String ktD;
  private String ktE;
  private String ktF;
  e ktS;
  private String ktT;
  private String ktU;
  private String ktV;
  private boolean ktW;
  private boolean ktX;
  private boolean ktY;
  private String ktZ;
  private e.a kua;
  private boolean kub;
  private boolean kuc;
  private boolean kud;
  private boolean kue;
  private String kuf;
  ae mHandler;
  private long mStartTime;
  
  public CardDetailUI()
  {
    GMTrace.i(4975719612416L, 37072);
    this.TAG = "MicroMsg.CardDetailUI";
    this.iXW = null;
    this.kmv = "";
    this.knl = "";
    this.ktT = "";
    this.ktU = "";
    this.ktV = "";
    this.ktD = "";
    this.ktE = "";
    this.ktF = "";
    this.knC = false;
    this.ktW = false;
    this.ktX = false;
    this.ktY = false;
    this.hbQ = "";
    this.ktZ = "";
    this.krJ = false;
    this.mHandler = new ae();
    this.kjz = 3;
    this.ktC = 0;
    this.krw = -1;
    this.kub = false;
    this.kuc = true;
    this.mStartTime = 0L;
    this.kud = false;
    this.ksF = false;
    this.kue = false;
    this.gBS = -85.0F;
    this.gBT = -1000.0F;
    this.kuf = "";
    this.gBY = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15360547880960L, 114445);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15360547880960L, 114445);
          return true;
        }
        if ((CardDetailUI.a(CardDetailUI.this) == -85.0F) && (CardDetailUI.b(CardDetailUI.this) == -1000.0F))
        {
          CardDetailUI.a(CardDetailUI.this, paramAnonymousFloat2);
          CardDetailUI.b(CardDetailUI.this, paramAnonymousFloat1);
          al.ajI().s(CardDetailUI.a(CardDetailUI.this), CardDetailUI.b(CardDetailUI.this));
        }
        if (CardDetailUI.c(CardDetailUI.this))
        {
          CardDetailUI.d(CardDetailUI.this);
          CardDetailUI.e(CardDetailUI.this);
        }
        CardDetailUI.f(CardDetailUI.this);
        GMTrace.o(15360547880960L, 114445);
        return false;
      }
    };
    GMTrace.o(4975719612416L, 37072);
  }
  
  private void a(i.b paramb)
  {
    GMTrace.i(4980417232896L, 37107);
    if (this.ktS.fBD)
    {
      w.i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
      GMTrace.o(4980417232896L, 37107);
      return;
    }
    w.i("MicroMsg.CardDetailUI", "jumpMarkUI()");
    this.ktS.a(this.ktY, paramb, true);
    GMTrace.o(4980417232896L, 37107);
  }
  
  private void aih()
  {
    GMTrace.i(4978806620160L, 37095);
    if (this.hpz == null) {
      this.hpz = com.tencent.mm.modelgeo.c.Io();
    }
    this.hpz.a(this.gBY, true);
    GMTrace.o(4978806620160L, 37095);
  }
  
  private void aij()
  {
    GMTrace.i(4978940837888L, 37096);
    if (this.hpz != null) {
      this.hpz.c(this.gBY);
    }
    GMTrace.o(4978940837888L, 37096);
  }
  
  private void akA()
  {
    GMTrace.i(4977061789696L, 37082);
    this.krw = this.kjz;
    this.kua = new e.a();
    this.kua.kjz = this.kjz;
    this.kua.krw = this.krw;
    this.kua.kmv = this.kmv;
    this.kua.ktT = this.ktT;
    this.kua.ktV = this.ktV;
    this.kua.ktU = this.ktU;
    this.kua.ktD = this.ktD;
    this.kua.ktE = this.ktE;
    this.kua.knC = this.knC;
    this.kua.kuP = getIntent().getIntExtra("key_from_appbrand_type", 0);
    GMTrace.o(4977061789696L, 37082);
  }
  
  private void akB()
  {
    int j = 1;
    int i = 1;
    GMTrace.i(4977196007424L, 37083);
    if ((this.kud) || (this.kmJ == null))
    {
      GMTrace.o(4977196007424L, 37083);
      return;
    }
    this.kud = true;
    if (this.knC)
    {
      localg = com.tencent.mm.plugin.report.service.g.paX;
      j = this.kmJ.aiK().knq;
      str1 = this.kmJ.aiP();
      str2 = this.kmJ.aiO();
      k = this.krw;
      str3 = this.ktT;
      if (this.kmJ.aiI()) {}
      for (;;)
      {
        localg.i(11324, new Object[] { "ShareCardDetailUI", Integer.valueOf(j), str1, str2, Integer.valueOf(0), Integer.valueOf(k), str3, Integer.valueOf(i), "" });
        GMTrace.o(4977196007424L, 37083);
        return;
        i = 0;
      }
    }
    com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.paX;
    int k = this.kmJ.aiK().knq;
    String str1 = this.kmJ.aiP();
    String str2 = this.kmJ.aiO();
    int m = this.krw;
    String str3 = this.ktT;
    if (this.kmJ.aiI()) {}
    for (i = j;; i = 0)
    {
      localg.i(11324, new Object[] { "CardDetailView", Integer.valueOf(k), str1, str2, Integer.valueOf(0), Integer.valueOf(m), str3, Integer.valueOf(i), "" });
      GMTrace.o(4977196007424L, 37083);
      return;
    }
  }
  
  private void akC()
  {
    GMTrace.i(4978001313792L, 37089);
    Object localObject = new bfe();
    ((bfe)localObject).uxn = this.hbQ;
    ((bfe)localObject).koF = this.ktZ;
    w.i("MicroMsg.CardDetailUI", "GetCardItemInfo templateId:%s", new Object[] { this.hbQ });
    localObject = new aa(this.kmv, this.kjz, this.ktT, this.ktV, this.ktD, this.ktE, this.ktC, this.ktF, (bfe)localObject);
    ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
    GMTrace.o(4978001313792L, 37089);
  }
  
  private void akD()
  {
    GMTrace.i(4978135531520L, 37090);
    Object localObject;
    if (!TextUtils.isEmpty(this.kmJ.aiP())) {
      localObject = this.kmJ.aiP();
    }
    while ((this.kmJ != null) && (this.kmJ.aiK().tFa == 1))
    {
      float f2 = this.gBS;
      float f3 = this.gBT;
      float f1;
      if (f2 != -85.0F)
      {
        f1 = f3;
        if (f3 != -1000.0F) {}
      }
      else
      {
        f2 = al.ajI().gBS;
        f1 = al.ajI().gBT;
      }
      localObject = new v((String)localObject, f1, f2, this.kmJ.aiO());
      ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
      GMTrace.o(4978135531520L, 37090);
      return;
      if (!TextUtils.isEmpty(this.kmv))
      {
        localObject = this.kmv;
      }
      else
      {
        w.e("MicroMsg.CardDetailUI", "doNetSceneCardShopLBS card id is null, return");
        GMTrace.o(4978135531520L, 37090);
        return;
      }
    }
    if ((this.kmJ != null) && (this.kmJ.aiK().tFa > 1))
    {
      if ((this.gBS != -85.0F) && (this.gBT != -1000.0F))
      {
        this.kue = false;
        localObject = new v((String)localObject, this.gBT, this.gBS, this.kmJ.aiO());
        ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
        GMTrace.o(4978135531520L, 37090);
        return;
      }
      if (!this.kue)
      {
        this.kue = true;
        if (this.ksF)
        {
          aih();
          GMTrace.o(4978135531520L, 37090);
        }
      }
    }
    else if (this.kmJ != null)
    {
      this.kmJ.a(null);
      akd();
      if (this.kmJ.aiq())
      {
        localObject = al.ajK().tR(this.kmv);
        if (localObject != null)
        {
          ((ShareCardInfo)localObject).a(null);
          al.ajK().c((com.tencent.mm.sdk.e.c)localObject, new String[] { this.kmv });
        }
        GMTrace.o(4978135531520L, 37090);
        return;
      }
      localObject = al.ajC().tB(this.kmv);
      if (localObject != null)
      {
        ((CardInfo)localObject).a(null);
        al.ajC().c((com.tencent.mm.sdk.e.c)localObject, new String[] { this.kmv });
      }
    }
    GMTrace.o(4978135531520L, 37090);
  }
  
  private void akE()
  {
    GMTrace.i(4978269749248L, 37091);
    com.tencent.mm.plugin.card.sharecard.model.c localc = new com.tencent.mm.plugin.card.sharecard.model.c(this.kmv);
    ap.wT().a(localc, 0);
    GMTrace.o(4978269749248L, 37091);
  }
  
  private void akd()
  {
    GMTrace.i(4977330225152L, 37084);
    this.kua.kjz = this.kjz;
    this.kua.krw = this.krw;
    this.kua.kmv = this.kmv;
    this.ktS.a(this.kmJ, this.kua, this.kmP);
    this.ktS.akd();
    al.ajN().kmJ = this.kmJ;
    GMTrace.o(4977330225152L, 37084);
  }
  
  private void akm()
  {
    GMTrace.i(4979075055616L, 37097);
    this.hpz = com.tencent.mm.modelgeo.c.Io();
    aih();
    GMTrace.o(4979075055616L, 37097);
  }
  
  private void aky()
  {
    GMTrace.i(4976659136512L, 37079);
    ap.wT().a(645, this);
    ap.wT().a(651, this);
    ap.wT().a(563, this);
    ap.wT().a(652, this);
    ap.wT().a(560, this);
    ap.wT().a(699, this);
    ap.wT().a(902, this);
    ap.wT().a(904, this);
    ap.wT().a(1163, this);
    GMTrace.o(4976659136512L, 37079);
  }
  
  private void akz()
  {
    GMTrace.i(4976793354240L, 37080);
    ap.wT().b(645, this);
    ap.wT().b(651, this);
    ap.wT().b(563, this);
    ap.wT().b(652, this);
    ap.wT().b(560, this);
    ap.wT().b(699, this);
    ap.wT().b(902, this);
    ap.wT().b(904, this);
    ap.wT().b(1163, this);
    GMTrace.o(4976793354240L, 37080);
  }
  
  private void b(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    GMTrace.i(4977598660608L, 37086);
    w.e("MicroMsg.CardDetailUI", "handleAcceptError, errCode = " + paramInt1 + " errMsg = " + paramString1 + " ret_code:" + paramInt2 + " ret_msg:" + paramString2);
    if (paramInt2 == 10000)
    {
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2)) {
        paramString1 = getString(R.l.dEC);
      }
      this.kmJ.aiL().status = 4;
      akd();
    }
    for (;;)
    {
      com.tencent.mm.plugin.card.b.d.b(this, paramString1);
      GMTrace.o(4977598660608L, 37086);
      return;
      if (paramInt2 == 10001)
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2)) {
          paramString1 = getString(R.l.dEF);
        }
        this.kmJ.aiL().status = 5;
        akd();
      }
      else if (paramInt2 == 10002)
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2)) {
          paramString1 = getString(R.l.dFT);
        }
      }
      else
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2)) {
          paramString1 = getString(R.l.dEA);
        }
      }
    }
  }
  
  private void dv(boolean paramBoolean)
  {
    GMTrace.i(4977732878336L, 37087);
    if (paramBoolean)
    {
      this.iXW = com.tencent.mm.ui.base.q.b(this, getString(R.l.bUo), true, 0, null);
      GMTrace.o(4977732878336L, 37087);
      return;
    }
    if ((this.iXW != null) && (this.iXW.isShowing()))
    {
      this.iXW.dismiss();
      this.iXW = null;
    }
    GMTrace.o(4977732878336L, 37087);
  }
  
  private void dx(boolean paramBoolean)
  {
    GMTrace.i(4977867096064L, 37088);
    if (paramBoolean) {
      com.tencent.mm.plugin.card.b.l.bF(this.ktS.kuE, this.ktS.kuD);
    }
    GMTrace.o(4977867096064L, 37088);
  }
  
  private void dy(boolean paramBoolean)
  {
    GMTrace.i(4978538184704L, 37093);
    if (((this.krw == 7) || (this.krw == 8) || (this.krw == 16) || (this.krw == 26)) && (this.kjz == 3))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_code", this.kuf);
      setResult(-1, localIntent);
      if (paramBoolean) {
        finish();
      }
      GMTrace.o(4978538184704L, 37093);
      return;
    }
    if (((this.krw == 7) && (this.kjz == 7)) || ((this.krw == 16) && (this.kjz == 16)) || ((this.krw == 8) && (this.kjz == 8)) || ((this.krw == 26) && (this.kjz == 26)))
    {
      setResult(0);
      if (paramBoolean)
      {
        finish();
        GMTrace.o(4978538184704L, 37093);
      }
    }
    else if (paramBoolean)
    {
      finish();
    }
    GMTrace.o(4978538184704L, 37093);
  }
  
  private void lF(int paramInt)
  {
    GMTrace.i(4978672402432L, 37094);
    if ((this.krw != 7) && (this.krw != 16))
    {
      w.i("MicroMsg.CardDetailUI", "mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_JSAPI and mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_NEARBY_PEOPLE_JSAPI ,don't push accept event");
      GMTrace.o(4978672402432L, 37094);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new com.tencent.mm.plugin.card.model.e();
    ((com.tencent.mm.plugin.card.model.e)localObject).knp = this.kmJ.aiP();
    ((com.tencent.mm.plugin.card.model.e)localObject).fMw = this.ktV;
    ((com.tencent.mm.plugin.card.model.e)localObject).code = this.kuf;
    localLinkedList.add(localObject);
    localObject = new com.tencent.mm.g.a.b();
    ((com.tencent.mm.g.a.b)localObject).fsR.aHi = paramInt;
    if (paramInt == -1) {}
    for (((com.tencent.mm.g.a.b)localObject).fsR.fsS = com.tencent.mm.plugin.card.b.h.a(localLinkedList, true, this.krw);; ((com.tencent.mm.g.a.b)localObject).fsR.fsS = com.tencent.mm.plugin.card.b.h.a(localLinkedList, false, this.krw))
    {
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(4978672402432L, 37094);
      return;
    }
  }
  
  /* Error */
  private void ts(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 785
    //   5: ldc_w 787
    //   8: invokestatic 89	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 127	com/tencent/mm/plugin/card/ui/CardDetailUI:krJ	Z
    //   15: ifeq +23 -> 38
    //   18: ldc 91
    //   20: ldc_w 789
    //   23: invokestatic 392	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: ldc2_w 785
    //   29: ldc_w 787
    //   32: invokestatic 166	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: ldc 91
    //   40: ldc_w 791
    //   43: invokestatic 200	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: aload_0
    //   47: iconst_1
    //   48: putfield 127	com/tencent/mm/plugin/card/ui/CardDetailUI:krJ	Z
    //   51: new 288	android/content/Intent
    //   54: dup
    //   55: aload_0
    //   56: ldc_w 793
    //   59: invokespecial 796	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   62: astore_2
    //   63: aload_2
    //   64: ldc_w 798
    //   67: aload_0
    //   68: getfield 182	com/tencent/mm/plugin/card/ui/CardDetailUI:kmJ	Lcom/tencent/mm/plugin/card/base/b;
    //   71: invokeinterface 221 1 0
    //   76: invokevirtual 604	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   79: pop
    //   80: aload_2
    //   81: ldc_w 800
    //   84: aload_1
    //   85: invokevirtual 604	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   88: pop
    //   89: aload_2
    //   90: ldc_w 802
    //   93: aload_0
    //   94: getfield 182	com/tencent/mm/plugin/card/ui/CardDetailUI:kmJ	Lcom/tencent/mm/plugin/card/base/b;
    //   97: invokeinterface 309 1 0
    //   102: getfield 805	com/tencent/mm/protocal/c/jn:hbA	Ljava/lang/String;
    //   105: invokevirtual 604	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   108: pop
    //   109: aload_2
    //   110: ldc_w 807
    //   113: aload_0
    //   114: getfield 134	com/tencent/mm/plugin/card/ui/CardDetailUI:kjz	I
    //   117: invokevirtual 810	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   120: pop
    //   121: aload_2
    //   122: ldc_w 812
    //   125: iconst_0
    //   126: invokevirtual 810	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   129: pop
    //   130: aload_0
    //   131: aload_2
    //   132: invokevirtual 816	com/tencent/mm/plugin/card/ui/CardDetailUI:startActivity	(Landroid/content/Intent;)V
    //   135: ldc2_w 785
    //   138: ldc_w 787
    //   141: invokestatic 166	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   144: goto -109 -> 35
    //   147: astore_1
    //   148: aload_0
    //   149: monitorexit
    //   150: aload_1
    //   151: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	this	CardDetailUI
    //   0	152	1	paramString	String
    //   62	70	2	localIntent	Intent
    // Exception table:
    //   from	to	target	type
    //   2	35	147	finally
    //   38	144	147	finally
  }
  
  protected final void MH()
  {
    GMTrace.i(4976927571968L, 37081);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5004710641664L, 37288);
        CardDetailUI.g(CardDetailUI.this);
        GMTrace.o(5004710641664L, 37288);
        return true;
      }
    });
    this.kiq = ((Vibrator)getSystemService("vibrator"));
    Object localObject2;
    if (this.ktS == null)
    {
      this.ktS = new e(this, this.vov.iiK);
      localObject1 = this.ktS;
      ((e)localObject1).kuA = new j(((e)localObject1).jFp);
      localObject2 = ((e)localObject1).kuA;
      ((j)localObject2).krs = ((j)localObject2).iqJ.getWindow().getAttributes().screenBrightness;
      if (((j)localObject2).ioi == null)
      {
        View localView = View.inflate(((j)localObject2).iqJ, R.i.cOA, null);
        ((j)localObject2).iok = localView.findViewById(R.h.ckg);
        ((j)localObject2).ioj = ((ImageView)localView.findViewById(R.h.ckf));
        ((j)localObject2).kyw = ((TextView)localView.findViewById(R.h.cki));
        ((j)localObject2).kyx = ((TextView)localView.findViewById(R.h.ckh));
        ((j)localObject2).kyy = localView.findViewById(R.h.ckc);
        ((j)localObject2).kyz = ((ImageView)localView.findViewById(R.h.ckb));
        ((j)localObject2).kyA = ((MMVerticalTextView)localView.findViewById(R.h.cDZ));
        ((j)localObject2).kyB = ((MMVerticalTextView)localView.findViewById(R.h.cEa));
        localView.setOnClickListener(new j.2((j)localObject2));
        ((j)localObject2).ioi = new com.tencent.mm.ui.base.p(localView, -1, -1, true);
        ((j)localObject2).ioi.update();
        ((j)localObject2).ioi.setBackgroundDrawable(new ColorDrawable(16777215));
        ((j)localObject2).ioi.setOnDismissListener(new j.3((j)localObject2));
      }
      ((e)localObject1).kuC = new com.tencent.mm.plugin.card.a.f(((e)localObject1).jFp);
      ((e)localObject1).jFp.vow = ((MMActivity.a)localObject1);
      com.tencent.mm.sdk.b.a.uLm.b(((e)localObject1).kuL);
      localObject1 = this.ktS;
      if (((e)localObject1).kuj == null)
      {
        ((e)localObject1).kuj = new x();
        ((e)localObject1).kuj.a((m)localObject1);
      }
      if (((e)localObject1).kul == null)
      {
        ((e)localObject1).kul = new com.tencent.mm.plugin.card.ui.view.o();
        ((e)localObject1).kul.a((m)localObject1);
      }
      if (((e)localObject1).kum == null)
      {
        ((e)localObject1).kum = new com.tencent.mm.plugin.card.ui.view.a();
        ((e)localObject1).kum.a((m)localObject1);
      }
      ((e)localObject1).EA = ((ListView)((e)localObject1).findViewById(R.h.brC));
      ((e)localObject1).kup = new l(((e)localObject1).jFp.vov.voR);
      ((e)localObject1).kup.kze = ((e)localObject1).iom;
      ((e)localObject1).EA.setAdapter(((e)localObject1).kup);
      ((e)localObject1).kup.notifyDataSetChanged();
      ((e)localObject1).EA.setOnItemClickListener(new e.1((e)localObject1));
      ((e)localObject1).dl = ((LinearLayout)((e)localObject1).findViewById(R.h.bOH));
      ((e)localObject1).kuy = new com.tencent.mm.plugin.card.ui.view.d();
      ((e)localObject1).kuy.a((m)localObject1);
      ((e)localObject1).kuA.kmJ = ((e)localObject1).kmJ;
    }
    int i = getIntent().getIntExtra("key_from_scene", -1);
    w.i("MicroMsg.CardDetailUI", "scene:%d", new Object[] { Integer.valueOf(i) });
    int j;
    if ((i == 2) || (i == 6) || (i == 5))
    {
      this.kjz = i;
      localObject1 = getIntent().getStringExtra("key_card_app_msg");
      localObject2 = com.tencent.mm.plugin.card.b.g.uf((String)localObject1);
      if (localObject2 != null)
      {
        this.kmv = ((com.tencent.mm.plugin.card.model.d)localObject2).fMv;
        this.ktT = ((com.tencent.mm.plugin.card.model.d)localObject2).koB;
        this.ktV = ((com.tencent.mm.plugin.card.model.d)localObject2).fMw;
        j = ((com.tencent.mm.plugin.card.model.d)localObject2).koE;
        w.i("MicroMsg.CardDetailUI", "scene is " + i + ", isRecommend is " + j);
        if ((j == 1) && (i == 2)) {
          this.kjz = 23;
        }
        this.ktZ = ((com.tencent.mm.plugin.card.model.d)localObject2).koF;
        w.i("MicroMsg.CardDetailUI", "recommend_card_id is " + this.ktZ);
      }
      this.ktU = com.tencent.mm.plugin.card.b.g.ug((String)localObject1);
      akA();
      if (!TextUtils.isEmpty(this.kmv)) {
        break label1760;
      }
      w.e("MicroMsg.CardDetailUI", "initData, mCardId is null");
      dy(true);
    }
    for (;;)
    {
      this.ktS.a(this.kmJ, this.kua, this.kmP);
      this.ktS.kuI = new e.d()
      {
        public final void akE()
        {
          GMTrace.i(4970082467840L, 37030);
          CardDetailUI.n(CardDetailUI.this);
          GMTrace.o(4970082467840L, 37030);
        }
        
        public final void akF()
        {
          GMTrace.i(4969142943744L, 37023);
          CardDetailUI.h(CardDetailUI.this);
          GMTrace.o(4969142943744L, 37023);
        }
        
        public final void akG()
        {
          GMTrace.i(4969411379200L, 37025);
          CardDetailUI.i(CardDetailUI.this);
          GMTrace.o(4969411379200L, 37025);
        }
        
        public final void akH()
        {
          GMTrace.i(4969545596928L, 37026);
          CardDetailUI.j(CardDetailUI.this);
          GMTrace.o(4969545596928L, 37026);
        }
        
        public final void akI()
        {
          GMTrace.i(4969679814656L, 37027);
          CardDetailUI.g(CardDetailUI.this);
          GMTrace.o(4969679814656L, 37027);
        }
        
        public final void akJ()
        {
          GMTrace.i(4969814032384L, 37028);
          CardDetailUI.k(CardDetailUI.this);
          GMTrace.o(4969814032384L, 37028);
        }
        
        public final void akK()
        {
          GMTrace.i(4970216685568L, 37031);
          w.i("MicroMsg.CardDetailUI", "onConsumeCodeUIResult()");
          GMTrace.o(4970216685568L, 37031);
        }
        
        public final void d(com.tencent.mm.plugin.card.base.b paramAnonymousb)
        {
          GMTrace.i(4969948250112L, 37029);
          CardDetailUI.a(CardDetailUI.this, paramAnonymousb);
          CardDetailUI.b(CardDetailUI.this, paramAnonymousb.aiO());
          CardDetailUI.l(CardDetailUI.this).kmv = CardDetailUI.m(CardDetailUI.this);
          GMTrace.o(4969948250112L, 37029);
        }
        
        public final void dz(boolean paramAnonymousBoolean)
        {
          GMTrace.i(4970350903296L, 37032);
          w.i("MicroMsg.CardDetailUI", "doMark()");
          CardDetailUI.o(CardDetailUI.this);
          CardDetailUI.p(CardDetailUI.this);
          CardDetailUI.a(CardDetailUI.this, paramAnonymousBoolean);
          if (CardDetailUI.q(CardDetailUI.this).aiD())
          {
            al.ajO().y(CardDetailUI.m(CardDetailUI.this), com.tencent.mm.plugin.card.b.l.ur(CardDetailUI.q(CardDetailUI.this).aiQ()), 2);
            GMTrace.o(4970350903296L, 37032);
            return;
          }
          al.ajO().y(CardDetailUI.m(CardDetailUI.this), com.tencent.mm.plugin.card.b.l.ur(CardDetailUI.q(CardDetailUI.this).aiQ()), 1);
          GMTrace.o(4970350903296L, 37032);
        }
        
        public final void tW(String paramAnonymousString)
        {
          GMTrace.i(4969277161472L, 37024);
          CardDetailUI.a(CardDetailUI.this, paramAnonymousString);
          GMTrace.o(4969277161472L, 37024);
        }
      };
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
      w.i("MicroMsg.CardDetailUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      this.ksF = bool;
      if (this.ksF)
      {
        this.hpz = com.tencent.mm.modelgeo.c.Io();
        aih();
      }
      GMTrace.o(4976927571968L, 37081);
      return;
      if ((com.tencent.mm.plugin.card.b.l.lM(i)) || (i == 0) || (i == 1) || (i == 3) || (i == 4) || (i == 9) || (i == 12) || (i == 15) || (i == 17) || (i == 21))
      {
        this.kjz = i;
        this.kmv = getIntent().getStringExtra("key_card_id");
        this.ktV = getIntent().getStringExtra("key_card_ext");
        this.knC = getIntent().getBooleanExtra("key_is_share_card", false);
        this.ktC = getIntent().getIntExtra("key_stastic_scene", 0);
        this.ktF = getIntent().getStringExtra("key_consumed_card_id");
        if ((i == 7) || (i == 16))
        {
          this.ktD = getIntent().getStringExtra("src_username");
          this.ktE = getIntent().getStringExtra("js_url");
          this.hbQ = getIntent().getStringExtra("key_template_id");
          break;
        }
        if ((this.knC) && (i == 3))
        {
          this.knl = getIntent().getStringExtra("key_card_tp_id");
          this.kmv = com.tencent.mm.plugin.card.sharecard.a.b.by(this.kmv, this.knl);
          break;
        }
        if (i != 8) {
          break;
        }
        this.kub = getIntent().getBooleanExtra("key_is_sms_add_card", false);
        break;
      }
      if ((i == 50) || (i == 27))
      {
        this.kjz = getIntent().getIntExtra("key_previous_scene", 50);
        if ((this.kjz != 26) && (this.kjz != 27)) {
          this.kjz = 3;
        }
        this.hbQ = getIntent().getStringExtra("key_template_id");
        if (this.kjz == 27)
        {
          localObject1 = (com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info");
          if (localObject1 != null)
          {
            this.kmJ = ((com.tencent.mm.plugin.card.base.b)localObject1);
            this.kmv = this.kmJ.aiO();
            akA();
            akD();
            if (this.kmJ.aiE()) {
              al.ajP().tr(this.kmJ.aiO());
            }
            akd();
          }
          akB();
          com.tencent.mm.plugin.card.b.l.amj();
        }
        else
        {
          localObject1 = com.tencent.mm.plugin.card.b.k.aL(getIntent().getStringExtra("card_list"), this.kjz);
          if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0))
          {
            w.e("MicroMsg.CardDetailUI", "initData tempList size is empty");
            dy(true);
          }
          for (;;)
          {
            akA();
            break;
            dv(true);
            this.kmv = ((jo)((LinkedList)localObject1).get(0)).knp;
            i = getIntent().getIntExtra("key_previous_scene", 51);
            localObject2 = new bfe();
            ((bfe)localObject2).uxn = this.hbQ;
            w.i("MicroMsg.CardDetailUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { this.hbQ });
            localObject1 = new com.tencent.mm.plugin.card.model.t((LinkedList)localObject1, (bfe)localObject2, i);
            ap.wT().a((com.tencent.mm.ac.k)localObject1, 0);
          }
        }
      }
      else if (i == 51)
      {
        if (getIntent().getIntExtra("key_previous_scene", 51) == 26) {}
        for (this.kjz = 26;; this.kjz = 3)
        {
          this.kmv = getIntent().getStringExtra("key_card_id");
          this.kmJ = al.ajH().kml;
          if (this.kmJ == null) {
            this.kmJ = al.ajC().tB(this.kmv);
          }
          akA();
          if (this.kmJ != null) {
            break label1608;
          }
          w.e("MicroMsg.CardDetailUI", "initData, mCardId is null from scene == ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_VIEW_UI");
          dy(true);
          break;
        }
        label1608:
        akD();
        akd();
        akB();
        if (this.kmJ.aiE()) {
          al.ajP().tr(this.kmJ.aiO());
        }
      }
      else
      {
        if (i == 26)
        {
          this.kjz = i;
          this.kmv = getIntent().getStringExtra("key_card_id");
          this.ktV = getIntent().getStringExtra("key_card_ext");
          break;
        }
        this.kjz = i;
        localObject1 = getIntent().getStringExtra("key_card_app_msg");
        localObject2 = com.tencent.mm.plugin.card.b.g.uf((String)localObject1);
        if (localObject2 != null)
        {
          this.kmv = ((com.tencent.mm.plugin.card.model.d)localObject2).fMv;
          this.ktT = ((com.tencent.mm.plugin.card.model.d)localObject2).koB;
          this.ktV = ((com.tencent.mm.plugin.card.model.d)localObject2).fMw;
        }
        this.ktU = com.tencent.mm.plugin.card.b.g.ug((String)localObject1);
        break;
        label1760:
        if ((i == 2) || (i == 6) || ((i == 4) && (!this.knC)) || (i == 5) || (i == 17) || (i == 21) || (i == 23)) {
          i = 1;
        }
        for (;;)
        {
          if ((i == 0) && (this.kmJ != null)) {
            break label1977;
          }
          w.i("MicroMsg.CardDetailUI", "initData fail, isNeedDoNetScene1 is true or no cardinfo with cardId = " + this.kmv + " isShareCard is " + this.knC);
          dv(true);
          if (!this.knC) {
            break label1970;
          }
          akE();
          break;
          if (i == 15)
          {
            localObject1 = al.ajH().getValue("key_accept_card_info");
            if ((localObject1 != null) && ((localObject1 instanceof CardInfo)))
            {
              this.kmJ = ((CardInfo)localObject1);
              i = 0;
            }
            else
            {
              i = 1;
            }
          }
          else if (this.knC)
          {
            this.kmJ = al.ajK().tR(this.kmv);
            i = 0;
          }
          else
          {
            this.kmJ = al.ajC().tB(this.kmv);
            i = 0;
          }
        }
        label1970:
        akC();
      }
    }
    label1977:
    w.d("MicroMsg.CardDetailUI", "initData(), cardId = " + this.kmv);
    Object localObject1 = this.kmJ.aiN();
    if (localObject1 != null)
    {
      this.kmP = new ArrayList();
      this.kmP.add(localObject1);
    }
    akd();
    if (this.kmJ.aiE()) {
      al.ajP().tr(this.kmJ.aiO());
    }
    if (this.knC)
    {
      this.kuc = true;
      i = 1;
      label2084:
      if (i == 0) {
        break label2220;
      }
      w.i("MicroMsg.CardDetailUI", "initData fail, isNeedDoNetScene2 is true or no cardinfo with cardId = " + this.kmv + " isShareCard is " + this.knC);
      if (!this.knC) {
        break label2213;
      }
      akE();
    }
    for (;;)
    {
      akB();
      break;
      if ((int)(System.currentTimeMillis() / 1000L) - this.kmJ.aiR() >= 86400L) {}
      for (j = 1;; j = 0)
      {
        if (j == 0) {
          break label2191;
        }
        this.kuc = true;
        i = 1;
        break;
      }
      label2191:
      if (!this.kmJ.aiB()) {
        break label2084;
      }
      this.kuc = true;
      i = 1;
      break label2084;
      label2213:
      akC();
      continue;
      label2220:
      akD();
    }
  }
  
  public final void YW()
  {
    GMTrace.i(4976524918784L, 37078);
    super.YW();
    if (this.krw == 26) {
      overridePendingTransition(0, 0);
    }
    GMTrace.o(4976524918784L, 37078);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(4977464442880L, 37085);
    w.i("MicroMsg.CardDetailUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      dv(false);
      Object localObject;
      if ((paramk instanceof aa))
      {
        paramString = ((aa)paramk).kpq;
        if (TextUtils.isEmpty(paramString))
        {
          w.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneGetCardItemInfo return json is null");
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        paramk = this.kmJ;
        localObject = new CardInfo();
        com.tencent.mm.plugin.card.b.f.a((CardInfo)localObject, paramString);
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject).aiO()))
        {
          this.kmv = ((com.tencent.mm.plugin.card.base.b)localObject).aiO();
          this.kmJ = ((com.tencent.mm.plugin.card.base.b)localObject);
          akD();
          if (this.kjz == 3)
          {
            if (paramk != null)
            {
              ((CardInfo)this.kmJ).field_stickyAnnouncement = ((CardInfo)paramk).field_stickyAnnouncement;
              ((CardInfo)this.kmJ).field_stickyEndTime = ((CardInfo)paramk).field_stickyEndTime;
              ((CardInfo)this.kmJ).field_stickyIndex = ((CardInfo)paramk).field_stickyIndex;
              ((CardInfo)this.kmJ).field_label_wording = ((CardInfo)paramk).field_label_wording;
              this.kmJ.a(paramk.aiN());
            }
            if (!this.kuc) {
              break label384;
            }
            com.tencent.mm.plugin.card.b.l.j(this.kmJ);
          }
        }
        for (;;)
        {
          akd();
          akB();
          if (this.kmJ.aiE()) {
            al.ajP().tr(this.kmJ.aiO());
          }
          GMTrace.o(4977464442880L, 37085);
          return;
          if ((!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject).aiO())) || (this.kmv.equals(((com.tencent.mm.plugin.card.base.b)localObject).aiP()))) {
            break;
          }
          w.e("MicroMsg.CardDetailUI", "mCardId:%s, mCardTpId:%s is different, error", new Object[] { this.kmv, ((com.tencent.mm.plugin.card.base.b)localObject).aiP() });
          GMTrace.o(4977464442880L, 37085);
          return;
          label384:
          w.e("MicroMsg.CardDetailUI", "onSceneEnd(), NetSceneGetCardItemInfo updateDataToDB is false");
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.model.o))
      {
        if (this.krw == 26) {
          dv(false);
        }
        localObject = ((com.tencent.mm.plugin.card.model.o)paramk).kpq;
        paramInt1 = ((com.tencent.mm.plugin.card.model.o)paramk).kpr;
        paramk = ((com.tencent.mm.plugin.card.model.o)paramk).kps;
        if (paramInt1 != 0) {
          b(paramInt2, paramString, paramInt1, paramk);
        }
        while (TextUtils.isEmpty((CharSequence)localObject))
        {
          w.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneAcceptCardItem return json is null");
          GMTrace.o(4977464442880L, 37085);
          return;
          com.tencent.mm.ui.base.h.bl(this, getResources().getString(R.l.dEM));
        }
        this.kjz = 3;
        if (this.kmJ == null) {
          this.kmJ = new CardInfo();
        }
        com.tencent.mm.plugin.card.b.f.a((CardInfo)this.kmJ, (String)localObject);
        if (!TextUtils.isEmpty(this.kmJ.aiO())) {
          this.kmv = this.kmJ.aiO();
        }
        if (this.ktS.akY() == 1)
        {
          paramString = this.ktS;
          if (paramString.kuC != null)
          {
            paramString = paramString.kuC;
            if (paramString.kmO != null) {
              paramString.kmO.knF = false;
            }
          }
        }
        if (this.krw != 26)
        {
          akD();
          akd();
        }
        com.tencent.mm.plugin.card.b.l.amj();
        paramString = this.kmJ;
        if (paramString.air())
        {
          ap.AS();
          paramk = (Integer)com.tencent.mm.x.c.xi().get(w.a.uVB, Integer.valueOf(0));
          if ((paramk == null) || (paramk.intValue() != 1))
          {
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uVB, Integer.valueOf(1));
            if (!com.tencent.mm.plugin.card.b.l.amm()) {
              break label873;
            }
            com.tencent.mm.plugin.card.b.d.c(this, R.i.cOJ, R.l.dEJ, paramString.aiK().koC);
          }
          label721:
          this.kuf = this.kmJ.aiU();
          if ((this.krw != 7) && (this.krw != 16)) {
            break label895;
          }
          paramString = new Intent();
          paramString.putExtra("key_code", this.kuf);
          setResult(-1, paramString);
          lF(-1);
        }
        for (;;)
        {
          if (this.kmJ.aiE()) {
            al.ajP().tr(this.kmJ.aiO());
          }
          GMTrace.o(4977464442880L, 37085);
          return;
          ap.AS();
          paramk = (Integer)com.tencent.mm.x.c.xi().get(282884, null);
          if ((paramk != null) && (paramk.intValue() == 1)) {
            break label721;
          }
          ap.AS();
          com.tencent.mm.x.c.xi().set(282884, Integer.valueOf(1));
          break;
          label873:
          com.tencent.mm.plugin.card.b.d.c(this, R.i.cOI, R.l.dEI, paramString.aiK().koC);
          break label721;
          label895:
          if ((!this.kub) && (this.krw == 8)) {
            dy(true);
          } else if ((this.krw == 26) && (paramInt1 == 0)) {
            dy(true);
          }
        }
      }
      if ((paramk instanceof v))
      {
        this.kmP = ((v)paramk).kpz;
        if ((this.kmJ != null) && (this.kmP != null) && (this.kmP.size() > 0))
        {
          this.kmJ.a((ji)this.kmP.get(0));
          akd();
          if (this.kmJ.aiq())
          {
            paramString = al.ajK().tR(this.kmv);
            if (paramString != null)
            {
              paramString.a((ji)this.kmP.get(0));
              al.ajK().c(paramString, new String[] { this.kmv });
            }
            GMTrace.o(4977464442880L, 37085);
            return;
          }
          paramString = al.ajC().tB(this.kmv);
          if (paramString != null)
          {
            paramString.a((ji)this.kmP.get(0));
            al.ajC().c(paramString, new String[] { this.kmv });
          }
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        if ((this.kmJ != null) && (this.kmP == null))
        {
          this.kmJ.a(null);
          akd();
          if (this.kmJ.aiq())
          {
            paramString = al.ajK().tR(this.kmv);
            if (paramString != null)
            {
              paramString.a(null);
              al.ajK().c(paramString, new String[] { this.kmv });
            }
            GMTrace.o(4977464442880L, 37085);
            return;
          }
          paramString = al.ajC().tB(this.kmv);
          if (paramString != null)
          {
            paramString.a(null);
            al.ajC().c(paramString, new String[] { this.kmv });
          }
        }
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof af))
      {
        paramInt1 = ((af)paramk).kpr;
        localObject = ((af)paramk).kps;
        if (paramInt1 == 10000)
        {
          paramString = (String)localObject;
          if (TextUtils.isEmpty((CharSequence)localObject)) {
            paramString = getString(R.l.dFo);
          }
          com.tencent.mm.plugin.card.b.d.b(this, paramString);
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        this.ktV = ((af)paramk).fMw;
        dx(true);
        paramString = this.kmJ.aiL();
        paramString.status = 3;
        this.kmJ.a(paramString);
        com.tencent.mm.plugin.card.b.l.j(this.kmJ);
        akd();
        if (this.krw == 3)
        {
          dy(true);
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        if (this.krw == 15)
        {
          paramString = new oi();
          com.tencent.mm.sdk.b.a.uLm.m(paramString);
        }
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof r))
      {
        com.tencent.mm.ui.base.h.bl(this, getResources().getString(R.l.dFd));
        al.ajB();
        com.tencent.mm.plugin.card.a.b.lt(4);
        dy(true);
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.model.t))
      {
        paramString = ((com.tencent.mm.plugin.card.model.t)paramk).kpx;
        if ((paramString != null) && (paramString.size() > 0))
        {
          paramString = (com.tencent.mm.plugin.card.base.b)paramString.get(0);
          if ((paramString != null) && (!this.kmv.equals(paramString.aiP())))
          {
            w.e("MicroMsg.CardDetailUI", "mCardId:%s, mCardTpId:%s is different, error", new Object[] { this.kmv, paramString.aiP() });
            GMTrace.o(4977464442880L, 37085);
            return;
          }
          this.kmJ = paramString;
          if (this.kmJ != null)
          {
            this.kmv = this.kmJ.aiO();
            akD();
            if (this.kmJ.aiE()) {
              al.ajP().tr(this.kmJ.aiO());
            }
          }
          if (this.kjz == 26) {
            this.kjz = 3;
          }
          akd();
        }
        akB();
        com.tencent.mm.plugin.card.b.l.amj();
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.g))
      {
        paramString = ((com.tencent.mm.plugin.card.sharecard.model.g)paramk).kpq;
        paramInt1 = ((com.tencent.mm.plugin.card.sharecard.model.g)paramk).kpr;
        paramk = ((com.tencent.mm.plugin.card.sharecard.model.g)paramk).kps;
        if (paramInt1 != 0)
        {
          paramString = paramk;
          if (TextUtils.isEmpty(paramk)) {
            paramString = getString(R.l.dEB);
          }
          com.tencent.mm.plugin.card.b.d.b(this, paramString);
          w.e("MicroMsg.CardDetailUI", "NetSceneShareCardItem onSceneEnd, accept card error, ret_msg:%s", new Object[] { paramString });
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        com.tencent.mm.ui.base.h.bl(this, getResources().getString(R.l.dEE));
        if (TextUtils.isEmpty(paramString))
        {
          w.e("MicroMsg.CardDetailUI", "NetSceneShareCardItem onSceneEnd, json is null");
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        this.kjz = 3;
        if (this.kmJ == null)
        {
          this.kmJ = new ShareCardInfo();
          com.tencent.mm.plugin.card.b.f.a((ShareCardInfo)this.kmJ, paramString);
          paramk = (ShareCardInfo)this.kmJ;
          if (!TextUtils.isEmpty(paramString)) {
            break label2146;
          }
          w.e("MicroMsg.CardInfoParser", "parserShareCardItemEncryptCodeForSingle jsonContent is null");
          label1877:
          if (!TextUtils.isEmpty(this.kmJ.aiO())) {
            this.kmv = this.kmJ.aiO();
          }
          if (TextUtils.isEmpty(this.kmJ.aiQ())) {
            ((ShareCardInfo)this.kmJ).field_from_username = com.tencent.mm.x.m.zF();
          }
          com.tencent.mm.plugin.card.b.l.a((ShareCardInfo)this.kmJ);
          akD();
          akd();
          com.tencent.mm.plugin.card.b.l.aml();
          al.ajJ().ahA();
          this.kuf = this.kmJ.aiU();
          if ((this.krw != 7) && (this.krw != 16)) {
            break label2238;
          }
          paramString = new Intent();
          paramString.putExtra("key_code", this.kuf);
          setResult(-1, paramString);
          lF(-1);
        }
        for (;;)
        {
          ap.AS();
          paramString = (Integer)com.tencent.mm.x.c.xi().get(w.a.uVz, Integer.valueOf(0));
          if ((paramString == null) || (paramString.intValue() != 1))
          {
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uVz, Integer.valueOf(1));
            com.tencent.mm.plugin.card.b.d.c(this, R.i.cOL, R.l.dGp, "");
          }
          if (this.kmJ.aiE()) {
            al.ajP().tr(this.kmJ.aiO());
          }
          GMTrace.o(4977464442880L, 37085);
          return;
          if (!(this.kmJ instanceof CardInfo)) {
            break;
          }
          this.kmJ = new ShareCardInfo();
          break;
          try
          {
            label2146:
            paramString = new JSONObject(paramString).optJSONArray("card_list");
            if (paramString == null) {
              break label1877;
            }
            paramk.knu = paramString.optJSONObject(0).optString("encrypt_code");
            w.i("MicroMsg.CardInfoParser", "encrypt_code:" + paramk.knu);
          }
          catch (JSONException paramString)
          {
            w.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
            w.e("MicroMsg.CardInfoParser", paramString.getMessage());
          }
          break label1877;
          label2238:
          if ((!this.kub) && (this.krw == 8)) {
            dy(true);
          }
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.c))
      {
        paramk = ((com.tencent.mm.plugin.card.sharecard.model.c)paramk).kpq;
        if (TextUtils.isEmpty(paramk))
        {
          w.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneGetShareCard json is null");
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        paramString = this.kmJ;
        this.kmJ = new ShareCardInfo();
        localObject = (ShareCardInfo)this.kmJ;
        if (TextUtils.isEmpty(paramk))
        {
          w.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
          if (paramString != null)
          {
            if (!TextUtils.isEmpty(paramString.aiQ())) {
              ((ShareCardInfo)this.kmJ).field_from_username = ((ShareCardInfo)paramString).field_from_username;
            }
            ((ShareCardInfo)this.kmJ).field_app_id = ((ShareCardInfo)paramString).field_app_id;
            ((ShareCardInfo)this.kmJ).field_consumer = ((ShareCardInfo)paramString).field_consumer;
            ((ShareCardInfo)this.kmJ).field_share_time = ((ShareCardInfo)paramString).field_share_time;
            ((ShareCardInfo)this.kmJ).field_updateTime = ((ShareCardInfo)paramString).field_updateTime;
            ((ShareCardInfo)this.kmJ).field_begin_time = ((ShareCardInfo)paramString).field_begin_time;
            ((ShareCardInfo)this.kmJ).field_end_time = ((ShareCardInfo)paramString).field_end_time;
            ((ShareCardInfo)this.kmJ).field_block_mask = ((ShareCardInfo)paramString).field_block_mask;
            this.kmJ.a(paramString.aiN());
            ((ShareCardInfo)this.kmJ).field_categoryType = ((ShareCardInfo)paramString).field_categoryType;
            ((ShareCardInfo)this.kmJ).field_itemIndex = ((ShareCardInfo)paramString).field_itemIndex;
            if (((ShareCardInfo)paramString).field_status != ((ShareCardInfo)this.kmJ).field_status)
            {
              w.i("MicroMsg.CardDetailUI", "getsharecared return, the status is " + ((ShareCardInfo)this.kmJ).field_status);
              com.tencent.mm.plugin.card.sharecard.a.b.a(this, this.kmJ);
            }
          }
          if (!TextUtils.isEmpty(this.kmJ.aiO())) {
            this.kmv = this.kmJ.aiO();
          }
          akd();
          akD();
          akB();
          if (this.kjz == 3)
          {
            if (!this.kuc) {
              break label2744;
            }
            com.tencent.mm.plugin.card.b.l.j(this.kmJ);
          }
        }
        for (;;)
        {
          if (this.kmJ.aiE()) {
            al.ajP().tr(this.kmJ.aiO());
          }
          GMTrace.o(4977464442880L, 37085);
          return;
          try
          {
            com.tencent.mm.plugin.card.b.f.a((ShareCardInfo)localObject, new JSONObject(paramk));
          }
          catch (JSONException paramk)
          {
            w.printErrStackTrace("MicroMsg.CardInfoParser", paramk, "", new Object[0]);
          }
          break;
          label2744:
          w.e("MicroMsg.CardDetailUI", "onSceneEnd() sharecard updateDataToDB is false");
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.a))
      {
        if (((com.tencent.mm.plugin.card.sharecard.model.a)paramk).kpr != 0)
        {
          com.tencent.mm.plugin.card.b.d.b(this, getString(R.l.dFb));
          GMTrace.o(4977464442880L, 37085);
          return;
        }
        w.i("MicroMsg.CardDetailUI", "delete share card, card id is " + this.kmJ.aiO());
        com.tencent.mm.plugin.card.sharecard.a.b.a(this, this.kmJ);
        com.tencent.mm.ui.base.h.bl(this, getResources().getString(R.l.dFd));
        al.ajJ().ajT();
        dy(true);
        GMTrace.o(4977464442880L, 37085);
      }
    }
    else
    {
      w.e("MicroMsg.CardDetailUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2 + " cmd:" + paramk.getType());
      dv(false);
      if (!(paramk instanceof af)) {
        break label3023;
      }
      dx(false);
      paramInt1 = ((af)paramk).kpr;
      paramk = ((af)paramk).kps;
      if (paramInt1 != 10000) {
        break label3086;
      }
      paramString = paramk;
      if (TextUtils.isEmpty(paramk)) {
        paramString = getString(R.l.dFo);
      }
    }
    label3023:
    label3086:
    for (;;)
    {
      paramk = paramString;
      if (TextUtils.isEmpty(paramString)) {
        paramk = getString(R.l.eZz);
      }
      Toast.makeText(this.vov.voR, paramk, 0).show();
      GMTrace.o(4977464442880L, 37085);
      return;
      if ((paramk instanceof com.tencent.mm.plugin.card.model.o))
      {
        lF(0);
        b(paramInt2, paramString, ((com.tencent.mm.plugin.card.model.o)paramk).kpr, ((com.tencent.mm.plugin.card.model.o)paramk).kps);
        GMTrace.o(4977464442880L, 37085);
        return;
      }
      if ((paramk instanceof v))
      {
        GMTrace.o(4977464442880L, 37085);
        return;
      }
    }
  }
  
  public final void aaU()
  {
    GMTrace.i(18899466715136L, 140812);
    com.tencent.mm.plugin.card.ui.view.g localg = this.ktS.kuo;
    if (localg != null) {
      localg.amf();
    }
    GMTrace.o(18899466715136L, 140812);
  }
  
  public final void ajc()
  {
    GMTrace.i(4980551450624L, 37108);
    w.i("MicroMsg.CardDetailUI", "code change");
    if ((this.ktS.kuo instanceof com.tencent.mm.plugin.card.ui.view.q))
    {
      ((com.tencent.mm.plugin.card.ui.view.q)this.ktS.kuo).kyD = al.ajP().getCode();
      this.ktS.akd();
    }
    GMTrace.o(4980551450624L, 37108);
  }
  
  public final void ajh()
  {
    GMTrace.i(4979611926528L, 37101);
    w.i("MicroMsg.CardDetailUI", "onVibrate");
    this.kiq.vibrate(300L);
    GMTrace.o(4979611926528L, 37101);
  }
  
  public final void aji()
  {
    GMTrace.i(4979746144256L, 37102);
    w.i("MicroMsg.CardDetailUI", "onFinishUI");
    GMTrace.o(4979746144256L, 37102);
  }
  
  public final void b(String paramString, i.b paramb)
  {
    GMTrace.i(4980014579712L, 37104);
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.kmv)))
    {
      w.e("MicroMsg.CardDetailUI", "onMarkSuccess(), the mark card id is diff from current id!");
      GMTrace.o(4980014579712L, 37104);
      return;
    }
    dv(false);
    w.i("MicroMsg.CardDetailUI", "onMarkSuccess()");
    w.i("MicroMsg.CardDetailUI", "markSucc:" + paramb.knd + " markCardId: " + paramb.kne);
    this.ktX = false;
    if (paramb.knd == 1)
    {
      if ((!TextUtils.isEmpty(paramb.kne)) && (!this.kmJ.aiO().equals(paramb.kne)))
      {
        w.i("MicroMsg.CardDetailUI", "markCardId is diff as now id!");
        if (this.kmJ.aiq())
        {
          paramString = al.ajK().tR(paramb.kne);
          if (paramString != null)
          {
            this.kmJ = paramString;
            this.kmv = paramb.kne;
            akd();
            al.ajN().d(this.kmJ);
            w.i("MicroMsg.CardDetailUI", "update the mCardInfo");
            this.ktW = true;
            a(paramb);
            GMTrace.o(4980014579712L, 37104);
            return;
          }
          w.e("MicroMsg.CardDetailUI", "The mark card id not exist the card info in DB!， mark failed!");
          com.tencent.mm.plugin.card.b.d.b(this, getString(R.l.dFF));
          this.ktW = false;
          GMTrace.o(4980014579712L, 37104);
        }
      }
      else
      {
        w.i("MicroMsg.CardDetailUI", "markCardId is same as now id!");
        this.ktW = true;
        a(paramb);
        GMTrace.o(4980014579712L, 37104);
      }
    }
    else
    {
      this.ktW = false;
      com.tencent.mm.plugin.card.b.d.b(this, getString(R.l.dFG));
    }
    GMTrace.o(4980014579712L, 37104);
  }
  
  public final void bu(String paramString1, String paramString2)
  {
    GMTrace.i(4980148797440L, 37105);
    if ((!TextUtils.isEmpty(paramString1)) && (!paramString1.equals(this.kmv)))
    {
      w.e("MicroMsg.CardDetailUI", "onMarkFail(), the mark card id is diff from current id!");
      GMTrace.o(4980148797440L, 37105);
      return;
    }
    w.i("MicroMsg.CardDetailUI", "onMarkFail()");
    this.ktW = false;
    this.ktX = false;
    dv(false);
    paramString1 = paramString2;
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = getString(R.l.dFF);
    }
    com.tencent.mm.plugin.card.b.d.b(this, paramString1);
    GMTrace.o(4980148797440L, 37105);
  }
  
  public final void f(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(4979477708800L, 37100);
    if (paramb == null)
    {
      w.e("MicroMsg.CardDetailUI", "cardInfo is empty, not to do onDataChange");
      GMTrace.o(4979477708800L, 37100);
      return;
    }
    if ((this.kmJ == null) || (!this.kmJ.aiO().equals(paramb.aiO())))
    {
      w.e("MicroMsg.CardDetailUI", "is not the same card, not to do onDataChange");
      GMTrace.o(4979477708800L, 37100);
      return;
    }
    if (!this.ktS.akZ())
    {
      w.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onDataChange");
      GMTrace.o(4979477708800L, 37100);
      return;
    }
    w.i("MicroMsg.CardDetailUI", "onDataChange");
    this.kmJ = paramb;
    this.kmv = this.kmJ.aiO();
    if ((this.kmJ.aiE()) && (al.ajP().isEmpty())) {
      al.ajP().tr(this.kmJ.aiO());
    }
    akd();
    GMTrace.o(4979477708800L, 37100);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4975853830144L, 37073);
    int i = R.i.cOc;
    GMTrace.o(4975853830144L, 37073);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4975988047872L, 37074);
    super.onCreate(paramBundle);
    this.mStartTime = System.currentTimeMillis();
    aky();
    paramBundle = al.ajN();
    ActionBarActivity localActionBarActivity = this.vov.voR;
    ap.wT().a(910, paramBundle);
    al.ajJ().a(paramBundle);
    com.tencent.mm.plugin.card.a.b localb = al.ajB();
    if (localb.kmu == null) {
      localb.kmu = new ArrayList();
    }
    if (paramBundle != null) {
      localb.kmu.add(new WeakReference(paramBundle));
    }
    paramBundle.YB = new WeakReference(localActionBarActivity);
    al.ajN().a(this);
    al.ajO().a(this);
    paramBundle = al.ajP();
    ap.wT().a(577, paramBundle);
    paramBundle.kmw.clear();
    paramBundle.kmx = 0;
    al.ajP().a(this);
    MH();
    GMTrace.o(4975988047872L, 37074);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4976390701056L, 37077);
    al.ajN().c(this);
    akz();
    al.ajN().b(this);
    al.ajN().release();
    al.ajO().b(this);
    al.ajP().b(this);
    al.ajP().release();
    e locale = this.ktS;
    Object localObject = locale.kuC;
    ((com.tencent.mm.plugin.card.a.f)localObject).kmJ = null;
    ((com.tencent.mm.plugin.card.a.f)localObject).kmN.clear();
    locale.kuC = null;
    localObject = locale.kuA;
    com.tencent.mm.plugin.card.b.l.u(((j)localObject).kyv);
    int i = ((j)localObject).kyC.size() - 1;
    while (i >= 0)
    {
      com.tencent.mm.plugin.card.b.l.u((Bitmap)((j)localObject).kyC.remove(i));
      i -= 1;
    }
    ((j)localObject).kyC.clear();
    if (((j)localObject).ioi.isShowing()) {
      ((j)localObject).ioi.dismiss();
    }
    ((j)localObject).ioi = null;
    ((j)localObject).aln();
    ((j)localObject).iqJ = null;
    ((j)localObject).kmJ = null;
    locale.kuA = null;
    if (locale.kun != null) {
      locale.kun.release();
    }
    locale.jFp.vow = null;
    com.tencent.mm.sdk.b.a.uLm.c(locale.kuL);
    locale.kuj.destroy();
    locale.kum.destroy();
    locale.kul.destroy();
    locale.kuy.destroy();
    if (locale.kuz != null) {
      locale.kuz.destroy();
    }
    if (locale.kur != null) {
      locale.kur.destroy();
    }
    if (locale.kuq != null) {
      locale.kuq.destroy();
    }
    if (locale.kus != null) {
      locale.kus.destroy();
    }
    if (locale.kut != null) {
      locale.kut.destroy();
    }
    if (locale.kuu != null) {
      locale.kuu.destroy();
    }
    if (locale.kuv != null) {
      locale.kuv.destroy();
    }
    if (locale.kuw != null) {
      locale.kuw.destroy();
    }
    if (locale.kux != null) {
      locale.kux.destroy();
    }
    if (locale.kuo != null) {
      locale.kuo.destroy();
    }
    locale.kui = null;
    localObject = al.ajS();
    long l;
    if ((((com.tencent.mm.plugin.card.a.g)localObject).kmu == null) || (locale == null))
    {
      al.ajS().release();
      this.kiq.cancel();
      aij();
      l = System.currentTimeMillis() - this.mStartTime;
      if (this.kmJ == null) {
        break label699;
      }
      com.tencent.mm.plugin.report.service.g.paX.i(13219, new Object[] { "CardDetailView", Integer.valueOf(this.kjz), this.kmJ.aiP(), this.kmJ.aiO(), Long.valueOf(l) });
      label544:
      if (((this.ktW) || (this.ktX)) && (this.kmJ != null) && (this.kmJ.aiq()))
      {
        if (!this.kmJ.aiD()) {
          break label752;
        }
        al.ajO().aH(this.kmv, 2);
      }
    }
    for (;;)
    {
      super.onDestroy();
      GMTrace.o(4976390701056L, 37077);
      return;
      i = 0;
      for (;;)
      {
        if (i >= ((com.tencent.mm.plugin.card.a.g)localObject).kmu.size()) {
          break label697;
        }
        WeakReference localWeakReference = (WeakReference)((com.tencent.mm.plugin.card.a.g)localObject).kmu.get(i);
        if (localWeakReference != null)
        {
          g.a locala = (g.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(locale)))
          {
            ((com.tencent.mm.plugin.card.a.g)localObject).kmu.remove(localWeakReference);
            break;
          }
        }
        i += 1;
      }
      label697:
      break;
      label699:
      com.tencent.mm.plugin.report.service.g.paX.i(13219, new Object[] { "CardDetailView", Integer.valueOf(this.kjz), this.kmv, this.kmv, Long.valueOf(l) });
      break label544;
      label752:
      al.ajO().aH(this.kmv, 1);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(4978403966976L, 37092);
    if (paramInt == 4)
    {
      w.e("MicroMsg.CardDetailUI", "onKeyDown finishUI");
      dy(false);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(4978403966976L, 37092);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(4976256483328L, 37076);
    akz();
    super.onPause();
    this.ktS.fBD = true;
    al.ajN().a(this, false);
    au.a(null);
    GMTrace.o(4976256483328L, 37076);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(4979209273344L, 37098);
    w.i("MicroMsg.CardDetailUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(4979209273344L, 37098);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        w.i("MicroMsg.CardDetailUI", "onMPermissionGranted LocationPermissionGranted " + this.ksF);
        if (!this.ksF)
        {
          this.ksF = true;
          akm();
        }
        GMTrace.o(4979209273344L, 37098);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.etS), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5029943574528L, 37476);
          CardDetailUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(5029943574528L, 37476);
        }
      }, null);
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(4976122265600L, 37075);
    super.onResume();
    aky();
    if (this.hpz != null) {
      this.hpz.a(this.gBY, true);
    }
    this.ktS.fBD = false;
    au.a(this);
    al.ajN().a(this, true);
    if (((this.ktW) || (this.ktX)) && (this.kmJ.aiq()))
    {
      if (this.kmJ.aiD())
      {
        al.ajO().aH(this.kmv, 2);
        localObject = al.ajN();
        String str = this.kmv;
        localObject = (Boolean)((com.tencent.mm.plugin.card.a.d)localObject).kmI.get(str);
        int i;
        if ((localObject != null) && (((Boolean)localObject).booleanValue()))
        {
          i = 1;
          if ((i == 0) || (TextUtils.isEmpty(al.ajN().kmL))) {
            break label201;
          }
          w.i("MicroMsg.CardDetailUI", "onResume, do launch succ UI!");
          tt(al.ajN().kmL);
        }
        for (;;)
        {
          this.ktS.kuo.d(com.tencent.mm.plugin.card.b.c.kAF);
          GMTrace.o(4976122265600L, 37075);
          return;
          i = 0;
          break;
          label201:
          w.i("MicroMsg.CardDetailUI", "onResume, not need launch succ ui or jsonRet is empty!");
        }
      }
      al.ajO().aH(this.kmv, 1);
      Object localObject = this.ktS.kuo;
      if (localObject != null) {
        ((com.tencent.mm.plugin.card.ui.view.g)localObject).d(com.tencent.mm.plugin.card.b.c.kAF);
      }
    }
    GMTrace.o(4976122265600L, 37075);
  }
  
  public final void onSuccess()
  {
    GMTrace.i(4980819886080L, 37110);
    if ((this.ktS.kuo instanceof com.tencent.mm.plugin.card.ui.view.q))
    {
      ((com.tencent.mm.plugin.card.ui.view.q)this.ktS.kuo).kyD = al.ajP().getCode();
      this.ktS.akd();
    }
    w.i("MicroMsg.CardDetailUI", "code get success");
    GMTrace.o(4980819886080L, 37110);
  }
  
  public final void tq(String paramString)
  {
    GMTrace.i(4980685668352L, 37109);
    if (!TextUtils.isEmpty(paramString)) {
      com.tencent.mm.plugin.card.b.d.a(this, paramString, true);
    }
    GMTrace.o(4980685668352L, 37109);
  }
  
  public final void tt(final String paramString)
  {
    GMTrace.i(4979880361984L, 37103);
    if (!this.ktS.akZ())
    {
      w.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onStartConsumedSuccUI");
      GMTrace.o(4979880361984L, 37103);
      return;
    }
    w.i("MicroMsg.CardDetailUI", "onStartConsumedSuccUI");
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5008602955776L, 37317);
        CardDetailUI.c(CardDetailUI.this, paramString);
        GMTrace.o(5008602955776L, 37317);
      }
    });
    GMTrace.o(4979880361984L, 37103);
  }
  
  public final void tw(String paramString)
  {
    GMTrace.i(4980283015168L, 37106);
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.kmv)))
    {
      w.e("MicroMsg.CardDetailUI", "onUnmarkSuccess(), the mark card id is diff from current id!");
      GMTrace.o(4980283015168L, 37106);
      return;
    }
    this.ktW = false;
    GMTrace.o(4980283015168L, 37106);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */