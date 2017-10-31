package com.tencent.mm.plugin.collect.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.sb;
import com.tencent.mm.g.a.sb.b;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.collect.b.d.a;
import com.tencent.mm.plugin.collect.b.f.a;
import com.tencent.mm.plugin.collect.b.s;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.ui.k.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.amv;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.jw;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.au.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CollectMainUI
  extends WalletPreferenceUI
  implements d.a, au.a
{
  private static int kOM;
  private static int kON;
  private static int kOO;
  private static int kOP;
  private static int kOv;
  private int fQa;
  private com.tencent.mm.ui.base.preference.f jqf;
  protected ScrollView kMb;
  private long kNC;
  private Vibrator kNQ;
  private ImageView kNR;
  private TextView kNS;
  private TextView kNT;
  private TextView kNU;
  private TextView kNV;
  private TextView kNW;
  private View kNX;
  private TextView kNY;
  private Dialog kNZ;
  private com.tencent.mm.plugin.collect.b.f kOA;
  private int kOB;
  private String kOC;
  private String kOD;
  private String kOE;
  protected CdnImageView kOF;
  protected TextView kOG;
  protected TextView kOH;
  protected ImageView kOI;
  protected ViewGroup kOJ;
  protected View kOK;
  private j.a kOL;
  private View kOa;
  private View kOb;
  private boolean kOc;
  private View kOd;
  private ImageView kOe;
  private TextView kOf;
  private TextView kOg;
  private TextView kOh;
  protected TextView kOi;
  private RelativeLayout kOj;
  private Bitmap kOk;
  protected String kOl;
  protected String kOm;
  protected String kOn;
  private String kOo;
  private List<a> kOp;
  private double kOq;
  private String kOr;
  private String kOs;
  protected boolean kOt;
  private long kOu;
  private View kOw;
  private b kOx;
  private SpannableStringBuilder kOy;
  private SpannableStringBuilder kOz;
  
  static
  {
    GMTrace.i(5411121922048L, 40316);
    kOM = -1;
    kON = -1;
    kOO = -1;
    kOP = -1;
    GMTrace.o(5411121922048L, 40316);
  }
  
  public CollectMainUI()
  {
    GMTrace.i(5404545253376L, 40267);
    this.kNR = null;
    this.kNS = null;
    this.kNT = null;
    this.kNU = null;
    this.kNV = null;
    this.kNW = null;
    this.kNX = null;
    this.kNY = null;
    this.jqf = null;
    this.kNZ = null;
    this.kOa = null;
    this.kOb = null;
    this.kMb = null;
    this.kOc = false;
    this.kOd = null;
    this.kOk = null;
    this.kOl = null;
    this.kOm = null;
    this.kOn = null;
    this.kOo = null;
    this.kOp = new LinkedList();
    this.kOr = null;
    this.kOs = null;
    this.kOt = false;
    this.kOx = new b();
    this.kOB = 0;
    this.kOL = new j.a()
    {
      public final void k(String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(20344186339328L, 151576);
        if ((paramAnonymousString == null) || (CollectMainUI.a(CollectMainUI.this) == null))
        {
          GMTrace.o(20344186339328L, 151576);
          return;
        }
        if (paramAnonymousString.equals(CollectMainUI.a(CollectMainUI.this)))
        {
          w.i("MicroMsg.CollectMainUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", new Object[] { CollectMainUI.a(CollectMainUI.this), paramAnonymousString });
          CollectMainUI.this.aom();
        }
        GMTrace.o(20344186339328L, 151576);
      }
    };
    GMTrace.o(5404545253376L, 40267);
  }
  
  private void aon()
  {
    GMTrace.i(5405350559744L, 40273);
    getWindow().getDecorView().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5402800422912L, 40254);
        int i = com.tencent.mm.bq.a.fromDPToPix(CollectMainUI.this.vov.voR, 37);
        ViewGroup.LayoutParams localLayoutParams = CollectMainUI.g(CollectMainUI.this).getLayoutParams();
        localLayoutParams.height = i;
        CollectMainUI.g(CollectMainUI.this).setLayoutParams(localLayoutParams);
        CollectMainUI.g(CollectMainUI.this).requestLayout();
        GMTrace.o(5402800422912L, 40254);
      }
    });
    GMTrace.o(5405350559744L, 40273);
  }
  
  private void aoo()
  {
    GMTrace.i(5405618995200L, 40275);
    double d;
    if ((this.kOp != null) && (this.kOp.size() > 0))
    {
      this.kOa.setBackgroundResource(R.g.aXZ);
      this.jqf.removeAll();
      int i = 0;
      d = 0.0D;
      if (i < this.kOp.size())
      {
        a locala = (a)this.kOp.get(i);
        c localc;
        if (i == this.kOp.size() - 1)
        {
          localc = new c(this, R.i.cQR);
          label107:
          localc.setKey(String.valueOf(i));
          String str2 = locala.gEW;
          String str1 = str2;
          if (bg.mZ(str2))
          {
            str1 = str2;
            if (!bg.mZ(locala.username)) {
              str1 = com.tencent.mm.wallet_core.ui.e.fc(locala.username);
            }
          }
          localc.mTitle = str1;
          localc.gDm = locala.username;
          if (locala.status != 0) {
            break label224;
          }
          localc.setSummary(R.l.dLn);
        }
        for (;;)
        {
          this.jqf.a(localc);
          i += 1;
          break;
          localc = new c(this);
          break label107;
          label224:
          if (locala.status == 1)
          {
            if (locala.kvv)
            {
              d += locala.kKX;
              localc.setSummary(com.tencent.mm.wallet_core.ui.e.d(locala.kKX, locala.fvV));
            }
            for (;;)
            {
              this.jqf.a(localc);
              break;
              localc.setSummary(R.l.dLm);
            }
          }
          if (locala.status == 2) {
            localc.setSummary(R.l.dLl);
          }
        }
      }
      this.jqf.notifyDataSetChanged();
      this.kNV.setText(com.tencent.mm.wallet_core.ui.e.d(d, ((a)this.kOp.get(0)).fvV));
      this.kNV.setVisibility(0);
    }
    for (;;)
    {
      if ((this.kOp != null) && (this.kOp.size() > 0))
      {
        this.kOJ.setBackgroundResource(R.g.aYa);
        this.kNX.setVisibility(0);
        if ((d > 0.0D) && (this.kOp.size() > 0))
        {
          this.kOK.setVisibility(0);
          this.kOb.setVisibility(0);
          GMTrace.o(5405618995200L, 40275);
        }
      }
      else
      {
        this.kNV.setVisibility(8);
        this.kNX.setVisibility(8);
        this.kOb.setVisibility(8);
      }
      GMTrace.o(5405618995200L, 40275);
      return;
      d = 0.0D;
    }
  }
  
  private static amv aop()
  {
    GMTrace.i(18057250471936L, 134537);
    try
    {
      ap.AS();
      amv localamv = z(new JSONObject((String)com.tencent.mm.x.c.xi().get(w.a.vdh, "")));
      GMTrace.o(18057250471936L, 134537);
      return localamv;
    }
    catch (JSONException localJSONException)
    {
      w.printErrStackTrace("MicroMsg.CollectMainUI", localJSONException, "", new Object[0]);
      GMTrace.o(18057250471936L, 134537);
    }
    return null;
  }
  
  private static List<amv> aoq()
  {
    GMTrace.i(18057384689664L, 134538);
    localArrayList = new ArrayList();
    try
    {
      ap.AS();
      Object localObject = (String)com.tencent.mm.x.c.xi().get(w.a.vdj, "");
      if (!bg.mZ((String)localObject))
      {
        localObject = new JSONArray((String)localObject);
        int i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          localArrayList.add(z(((JSONArray)localObject).getJSONObject(i)));
          i += 1;
        }
      }
      return localArrayList;
    }
    catch (JSONException localJSONException)
    {
      w.printErrStackTrace("MicroMsg.CollectMainUI", localJSONException, "", new Object[0]);
      GMTrace.o(18057384689664L, 134538);
    }
  }
  
  private Bitmap uM(String paramString)
  {
    GMTrace.i(20340159807488L, 151546);
    String str1 = com.tencent.mm.x.m.zF();
    int i = this.kOB;
    String str2 = this.kOE;
    j.a locala = this.kOL;
    paramString = com.tencent.mm.plugin.collect.b.b.a(this, paramString, str1, i, str2, true, BackwardSupportUtil.b.a(this, 197.0F), locala);
    GMTrace.o(20340159807488L, 151546);
    return paramString;
  }
  
  private static amv z(JSONObject paramJSONObject)
  {
    GMTrace.i(18057518907392L, 134539);
    amv localamv = new amv();
    localamv.type = paramJSONObject.optInt("type", -1);
    localamv.url = paramJSONObject.optString("url", "");
    localamv.fEM = paramJSONObject.optString("wording", "");
    localamv.uiO = paramJSONObject.optString("waapp_username", "");
    localamv.uiP = paramJSONObject.optString("waapp_path", "");
    GMTrace.o(18057518907392L, 134539);
    return localamv;
  }
  
  protected final void MH()
  {
    GMTrace.i(5404947906560L, 40270);
    oC(R.l.etr);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20340025589760L, 151545);
        CollectMainUI.this.finish();
        GMTrace.o(20340025589760L, 151545);
        return true;
      }
    });
    this.jqf = this.vOv;
    this.kNX = findViewById(R.h.bwp);
    this.kOK = findViewById(R.h.bwq);
    this.kNT = ((TextView)findViewById(R.h.bwh));
    this.kNS = ((TextView)findViewById(R.h.bwg));
    this.kNU = ((TextView)findViewById(R.h.bwi));
    this.kNV = ((TextView)findViewById(R.h.bwo));
    this.kOi = ((TextView)findViewById(R.h.ble));
    this.kOa = ((RelativeLayout)findViewById(R.h.bwn));
    this.kOb = findViewById(R.h.bwl);
    this.kOw = LayoutInflater.from(this).inflate(R.i.cQP, null, false);
    this.kNW = ((TextView)findViewById(R.h.bwy));
    final Object localObject = new SpannableStringBuilder(getString(R.l.bwy));
    ((SpannableStringBuilder)localObject).setSpan(new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
    {
      public final void anY()
      {
        GMTrace.i(5417564372992L, 40364);
        CollectMainUI.b(CollectMainUI.this);
        g.paX.i(13944, new Object[] { Integer.valueOf(5) });
        GMTrace.o(5417564372992L, 40364);
      }
    }), 0, ((SpannableStringBuilder)localObject).length(), 18);
    this.kNW.setText((CharSequence)localObject);
    this.kNW.setClickable(true);
    this.kNW.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
    this.nep.addFooterView(this.kOw, null, false);
    this.nep.setFooterDividersEnabled(false);
    this.kNR = ((ImageView)findViewById(R.h.bwk));
    this.kNY = ((TextView)findViewById(R.h.bwD));
    this.kOh = ((TextView)findViewById(R.h.bwO));
    this.kOh.setClickable(true);
    this.kOh.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
    this.kOy = new SpannableStringBuilder(getString(R.l.dLh));
    this.kOz = new SpannableStringBuilder(getString(R.l.dLi));
    localObject = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
    {
      public final void anY()
      {
        GMTrace.i(5413806276608L, 40336);
        Intent localIntent = new Intent();
        localIntent.setClass(CollectMainUI.this.vov.voR, CollectCreateQRCodeUI.class);
        localIntent.putExtra("key_currency_unit", CollectMainUI.this.kOn);
        CollectMainUI.this.startActivityForResult(localIntent, 4096);
        GMTrace.o(5413806276608L, 40336);
      }
    });
    com.tencent.mm.plugin.wallet_core.ui.k localk = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
    {
      public final void anY()
      {
        GMTrace.i(20339488718848L, 151541);
        CollectMainUI.this.kOt = false;
        CollectMainUI.this.aom();
        CollectMainUI.d(CollectMainUI.this).setText(CollectMainUI.c(CollectMainUI.this));
        CollectMainUI.e(CollectMainUI.this);
        GMTrace.o(20339488718848L, 151541);
      }
    });
    this.kOy.setSpan(localObject, 0, this.kOy.length(), 18);
    this.kOz.setSpan(localk, 0, this.kOz.length(), 18);
    this.kOh.setText(this.kOy);
    this.kOj = ((RelativeLayout)findViewById(R.h.bwE));
    this.kNR.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(20339220283392L, 151539);
        paramAnonymousView = new LinkedList();
        LinkedList localLinkedList = new LinkedList();
        paramAnonymousView.add(CollectMainUI.this.getString(R.l.dLo));
        localLinkedList.add(Integer.valueOf(0));
        com.tencent.mm.ui.base.h.a(CollectMainUI.this.vov.voR, CollectMainUI.this.getString(R.l.dLq), paramAnonymousView, localLinkedList, null, true, new h.d()
        {
          public final void bQ(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(17423071707136L, 129812);
            switch (paramAnonymous2Int2)
            {
            }
            for (;;)
            {
              GMTrace.o(17423071707136L, 129812);
              return;
              CollectMainUI.b(CollectMainUI.this);
              g.paX.i(13944, new Object[] { Integer.valueOf(6) });
            }
          }
        });
        GMTrace.o(20339220283392L, 151539);
        return true;
      }
    });
    this.kOd = findViewById(R.h.bwr);
    this.kOe = ((ImageView)findViewById(R.h.bwG));
    this.kOf = ((TextView)findViewById(R.h.bwI));
    this.kOg = ((TextView)findViewById(R.h.bwH));
    this.kOF = ((CdnImageView)findViewById(R.h.bvH));
    this.kOG = ((TextView)findViewById(R.h.bvK));
    this.kOH = ((TextView)findViewById(R.h.bvL));
    this.kOI = ((ImageView)findViewById(R.h.bvJ));
    this.kOJ = ((ViewGroup)findViewById(R.h.bvI));
    this.kOa.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17413944901632L, 129744);
        int[] arrayOfInt = new int[2];
        CollectMainUI.f(CollectMainUI.this).getLocationInWindow(arrayOfInt);
        CollectMainUI.md(arrayOfInt[1]);
        GMTrace.o(17413944901632L, 129744);
      }
    }, 300L);
    localObject = new sb();
    ((sb)localObject).fQc.fQe = "8";
    ((sb)localObject).fwM = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17414884425728L, 129751);
        if (!bg.mZ(localObject.fQd.fQf))
        {
          com.tencent.mm.wallet_core.ui.e.a((TextView)CollectMainUI.this.findViewById(R.h.ble), localObject.fQd.fQf, localObject.fQd.content, localObject.fQd.url);
          GMTrace.o(17414884425728L, 129751);
          return;
        }
        w.i("MicroMsg.CollectMainUI", "no bulletin data");
        GMTrace.o(17414884425728L, 129751);
      }
    };
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    GMTrace.o(5404947906560L, 40270);
  }
  
  public final int QD()
  {
    GMTrace.i(5405887430656L, 40277);
    int i = R.o.fhk;
    GMTrace.o(5405887430656L, 40277);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(5406290083840L, 40280);
    GMTrace.o(5406290083840L, 40280);
    return false;
  }
  
  public final void aaU()
  {
    GMTrace.i(5406961172480L, 40285);
    w.i("MicroMsg.CollectMainUI", "do screen shot");
    g.paX.i(13944, new Object[] { Integer.valueOf(9) });
    com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.dLs), "", getString(R.l.dLr), getString(R.l.duP), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(17425890279424L, 129833);
        CollectMainUI.b(CollectMainUI.this);
        g.paX.i(13944, new Object[] { Integer.valueOf(10) });
        GMTrace.o(17425890279424L, 129833);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20344320557056L, 151577);
        GMTrace.o(20344320557056L, 151577);
      }
    });
    GMTrace.o(5406961172480L, 40285);
  }
  
  public final int ahR()
  {
    GMTrace.i(5406021648384L, 40278);
    int i = R.i.cQQ;
    GMTrace.o(5406021648384L, 40278);
    return i;
  }
  
  protected final void al(final List<amv> paramList)
  {
    GMTrace.i(18057653125120L, 134540);
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        amv localamv = (amv)localIterator.next();
        if (localamv.type == 1) {
          g.paX.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(1), localamv.fEM, "", "", "", Integer.valueOf(1) });
        } else if (localamv.type == 2) {
          g.paX.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(2), localamv.fEM, "", "", localamv.url, Integer.valueOf(1) });
        } else if (localamv.type == 3) {
          g.paX.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(3), localamv.fEM, localamv.uiO, localamv.uiP, "", Integer.valueOf(1) });
        }
      }
    }
    this.kOj.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20344588992512L, 151579);
        paramAnonymousView = new com.tencent.mm.ui.widget.e(CollectMainUI.this.vov.voR, com.tencent.mm.ui.widget.e.wSP, false);
        paramAnonymousView.qQS = new o.c()
        {
          public final void a(com.tencent.mm.ui.base.m paramAnonymous2m)
          {
            GMTrace.i(20339891372032L, 151544);
            com.tencent.mm.plugin.collect.a.a.anz();
            if (com.tencent.mm.plugin.collect.a.a.anB()) {
              paramAnonymous2m.add(0, 1, 0, R.l.dLc);
            }
            while (CollectMainUI.9.this.kOT != null)
            {
              int i = 0;
              while (i < CollectMainUI.9.this.kOT.size())
              {
                amv localamv = (amv)CollectMainUI.9.this.kOT.get(i);
                if (!bg.mZ(localamv.fEM)) {
                  paramAnonymous2m.add(0, i + 1 + 1, 0, localamv.fEM);
                }
                i += 1;
              }
              paramAnonymous2m.add(0, 1, 0, R.l.dLj);
            }
            GMTrace.o(20339891372032L, 151544);
          }
        };
        paramAnonymousView.qQT = new o.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(20339757154304L, 151543);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            default: 
              paramAnonymous2Int = paramAnonymous2MenuItem.getItemId() - 1 - 1;
              if (paramAnonymous2Int < 0)
              {
                w.w("MicroMsg.CollectMainUI", "illegal pos: %s", new Object[] { Integer.valueOf(paramAnonymous2Int) });
                GMTrace.o(20339757154304L, 151543);
                return;
              }
              break;
            case 1: 
              com.tencent.mm.plugin.collect.a.a.anz();
              if (com.tencent.mm.plugin.collect.a.a.anB())
              {
                CollectMainUI.t(CollectMainUI.this);
                Toast.makeText(CollectMainUI.this.vov.voR, R.l.dLd, 1).show();
                g.paX.i(13944, new Object[] { Integer.valueOf(8) });
                GMTrace.o(20339757154304L, 151543);
                return;
              }
              CollectMainUI.u(CollectMainUI.this);
              Toast.makeText(CollectMainUI.this.vov.voR, R.l.dLk, 1).show();
              g.paX.i(13944, new Object[] { Integer.valueOf(7) });
              GMTrace.o(20339757154304L, 151543);
              return;
            }
            paramAnonymous2MenuItem = (amv)CollectMainUI.9.this.kOT.get(paramAnonymous2Int);
            if (paramAnonymous2MenuItem.type == 1)
            {
              w.w("MicroMsg.CollectMainUI", "wrong native type: %s", new Object[] { paramAnonymous2MenuItem.url });
              g.paX.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(1), paramAnonymous2MenuItem.fEM, "", "", "", Integer.valueOf(2) });
              GMTrace.o(20339757154304L, 151543);
              return;
            }
            if (paramAnonymous2MenuItem.type == 2)
            {
              if (!bg.mZ(paramAnonymous2MenuItem.url))
              {
                com.tencent.mm.wallet_core.ui.e.m(CollectMainUI.this.vov.voR, paramAnonymous2MenuItem.url, false);
                g.paX.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(2), paramAnonymous2MenuItem.fEM, "", "", paramAnonymous2MenuItem.url, Integer.valueOf(2) });
                GMTrace.o(20339757154304L, 151543);
              }
            }
            else if (paramAnonymous2MenuItem.type == 3)
            {
              px localpx = new px();
              localpx.fNL.userName = paramAnonymous2MenuItem.uiO;
              localpx.fNL.fNN = bg.ap(paramAnonymous2MenuItem.uiP, "");
              localpx.fNL.scene = 1072;
              localpx.fNL.fNO = 0;
              com.tencent.mm.sdk.b.a.uLm.m(localpx);
              g.paX.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(3), paramAnonymous2MenuItem.fEM, paramAnonymous2MenuItem.uiO, paramAnonymous2MenuItem.uiP, "", Integer.valueOf(2) });
            }
            GMTrace.o(20339757154304L, 151543);
          }
        };
        paramAnonymousView.bCV();
        GMTrace.o(20344588992512L, 151579);
      }
    });
    GMTrace.o(18057653125120L, 134540);
  }
  
  protected final void amr()
  {
    GMTrace.i(5405082124288L, 40271);
    if (bg.mZ(this.kOl))
    {
      w.w("MicroMsg.CollectMainUI", "func[refreshView], mPayUrl null.");
      GMTrace.o(5405082124288L, 40271);
      return;
    }
    if (this.kOB == 1)
    {
      if (!bg.mZ(this.kOC)) {
        this.kNY.setText(this.kOC);
      }
      if (!bg.mZ(this.kOD))
      {
        localObject = (TextView)findViewById(R.h.bwm);
        ((TextView)localObject).setText(this.kOD);
        ((TextView)localObject).setVisibility(0);
      }
    }
    aom();
    aoo();
    Object localObject = com.tencent.mm.plugin.wallet_core.model.h.bww();
    if (this.kOt) {}
    for (int i = 33;; i = 32)
    {
      if (localObject != null) {
        g.paX.i(13447, new Object[] { Integer.valueOf(i), ((at)localObject).tuj, ((at)localObject).tuk, this.kOl, Double.valueOf(this.kOq), Long.valueOf(bg.Po()), Long.valueOf(((at)localObject).tui), ((at)localObject).tul, ((at)localObject).tum });
      }
      GMTrace.o(5405082124288L, 40271);
      return;
    }
  }
  
  protected void aoi()
  {
    GMTrace.i(17418776739840L, 129780);
    this.kOA = new com.tencent.mm.plugin.collect.b.f();
    Object localObject = this.kOA;
    ap.wT().a(1588, (com.tencent.mm.ac.e)localObject);
    com.tencent.mm.plugin.collect.b.f localf = this.kOA;
    f.a local7 = new f.a()
    {
      public final void a(boolean paramAnonymousBoolean, jw paramAnonymousjw)
      {
        GMTrace.i(20344857427968L, 151581);
        w.i("MicroMsg.CollectMainUI", "get from cgi: %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (paramAnonymousBoolean)
        {
          CollectMainUI.this.kOl = paramAnonymousjw.url;
          CollectMainUI.this.kOm = paramAnonymousjw.rMv;
          CollectMainUI.a(CollectMainUI.this, paramAnonymousjw.oWr);
          CollectMainUI.b(CollectMainUI.this, paramAnonymousjw.oWs);
          CollectMainUI.a(CollectMainUI.this, paramAnonymousjw.oWt);
          CollectMainUI.c(CollectMainUI.this, paramAnonymousjw.tGf);
          CollectMainUI.a(CollectMainUI.this, paramAnonymousjw.tGc);
          CollectMainUI.this.al(paramAnonymousjw.tGb);
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xz().xi().a(w.a.vdP, Integer.valueOf(CollectMainUI.s(CollectMainUI.this)));
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xz().xi().a(w.a.vdQ, CollectMainUI.a(CollectMainUI.this));
          CollectMainUI.this.amr();
        }
        GMTrace.o(20344857427968L, 151581);
      }
      
      public final void bG(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(20344723210240L, 151580);
        w.i("MicroMsg.CollectMainUI", "get cache: %s, %s", new Object[] { paramAnonymousString1, paramAnonymousString2 });
        CollectMainUI.this.kOl = paramAnonymousString1;
        CollectMainUI.this.kOm = paramAnonymousString2;
        paramAnonymousString1 = CollectMainUI.p(CollectMainUI.this);
        paramAnonymousString2 = CollectMainUI.q(CollectMainUI.this);
        CollectMainUI.a(CollectMainUI.this, paramAnonymousString1);
        CollectMainUI.this.al(paramAnonymousString2);
        if (CollectMainUI.r(CollectMainUI.this) == 1)
        {
          paramAnonymousString1 = CollectMainUI.this;
          com.tencent.mm.kernel.h.xA();
          CollectMainUI.a(paramAnonymousString1, ((Integer)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdP, Integer.valueOf(-1))).intValue());
          paramAnonymousString1 = CollectMainUI.this;
          com.tencent.mm.kernel.h.xA();
          CollectMainUI.a(paramAnonymousString1, (String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdQ, ""));
        }
        GMTrace.o(20344723210240L, 151580);
      }
    };
    ap.AS();
    String str1 = (String)com.tencent.mm.x.c.xi().get(w.a.vdf, "");
    ap.AS();
    String str2 = (String)com.tencent.mm.x.c.xi().get(w.a.vdg, "");
    localObject = str1;
    if (bg.mZ(str1))
    {
      w.i("MicroMsg.F2fGetPayUrlManager", "use old payurl");
      localObject = com.tencent.mm.plugin.wallet_core.model.m.bwE().bxb();
    }
    local7.bG((String)localObject, str2);
    localObject = new com.tencent.mm.plugin.collect.b.k();
    localf.gMM.put(localObject, local7);
    ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
    GMTrace.o(17418776739840L, 129780);
  }
  
  protected String aoj()
  {
    GMTrace.i(17418910957568L, 129781);
    if (bg.mZ(this.kOm))
    {
      this.kOm = com.tencent.mm.plugin.wallet_core.model.m.bwE().aoj();
      this.kOm = com.tencent.mm.wallet_core.ui.e.WC(this.kOm);
    }
    String str = this.kOm;
    GMTrace.o(17418910957568L, 129781);
    return str;
  }
  
  protected String aok()
  {
    GMTrace.i(17419045175296L, 129782);
    String str = com.tencent.mm.wallet_core.ui.e.Wz(this.kOr);
    GMTrace.o(17419045175296L, 129782);
    return str;
  }
  
  protected void aol()
  {
    GMTrace.i(17419313610752L, 129784);
    GMTrace.o(17419313610752L, 129784);
  }
  
  protected void aom()
  {
    GMTrace.i(5405216342016L, 40272);
    this.kNR.setImageBitmap(null);
    if (this.kOt)
    {
      if (bg.mZ(this.kOo))
      {
        w.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
        GMTrace.o(5405216342016L, 40272);
        return;
      }
      this.kOk = uM(this.kOo);
      if ((this.kOk == null) || (this.kOk.isRecycled())) {
        break label252;
      }
      this.kNR.setImageBitmap(this.kOk);
      label93:
      if (!this.kOt) {
        break label296;
      }
      this.kNU.setText(aok());
      this.kNT.setText(com.tencent.mm.wallet_core.ui.e.r(this.kOq));
      this.kNT.setVisibility(0);
      this.kNU.setVisibility(0);
      if (bg.mZ(this.kOs)) {
        break label284;
      }
      this.kNS.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.vov.voR, this.kOs, this.kNS.getTextSize()));
      this.kNS.setVisibility(0);
    }
    for (;;)
    {
      findViewById(R.h.bwj).setVisibility(0);
      GMTrace.o(5405216342016L, 40272);
      return;
      if (bg.mZ(this.kOl))
      {
        w.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mPayUrl null");
        GMTrace.o(5405216342016L, 40272);
        return;
      }
      this.kOk = uM(this.kOl);
      break;
      label252:
      w.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : bmp null ,mFixedPayUrl=" + bg.mY(this.kOo));
      break label93;
      label284:
      this.kNS.setVisibility(8);
    }
    label296:
    this.kNU.setVisibility(8);
    this.kNT.setVisibility(8);
    this.kNS.setVisibility(8);
    findViewById(R.h.bwj).setVisibility(8);
    GMTrace.o(5405216342016L, 40272);
  }
  
  public final void b(s params)
  {
    int k = 0;
    GMTrace.i(5406424301568L, 40281);
    w.d("MicroMsg.CollectMainUI", "func[onRecv]:Recv payerMsg");
    int i;
    if (((this.fQa != 1) && (this.fQa != 0)) || ((params.msgType == 9) || ((this.fQa == 8) && (params.msgType == 26))))
    {
      if (this.kNQ != null) {
        this.kNQ.vibrate(50L);
      }
      if (params.kKY < this.kOu)
      {
        w.d("MicroMsg.CollectMainUI", "Recieve but time out ");
        GMTrace.o(5406424301568L, 40281);
        return;
      }
      i = 0;
      if (i >= this.kOp.size()) {
        break label519;
      }
      if ((params.status != 0) || (!bg.mY(params.username).equals(((a)this.kOp.get(i)).username)) || (((a)this.kOp.get(i)).status != 2)) {
        break label329;
      }
      this.kOp.remove(i);
      this.kOp.add(i, new a(params));
      i = 1;
    }
    for (;;)
    {
      label215:
      if (i == 0) {
        i = 0;
      }
      for (;;)
      {
        int j = k;
        Object localObject;
        if (i < this.kOp.size())
        {
          localObject = (s)this.kOp.get(i);
          if (params.kKY > ((s)localObject).kKY)
          {
            this.kOp.add(i, new a(params));
            j = 1;
          }
        }
        else
        {
          if (j == 0) {
            this.kOp.add(new a(params));
          }
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5425483218944L, 40423);
              CollectMainUI.h(CollectMainUI.this);
              CollectMainUI.i(CollectMainUI.this).aaZ();
              CollectMainUI.e(CollectMainUI.this);
              GMTrace.o(5425483218944L, 40423);
            }
          });
          GMTrace.o(5406424301568L, 40281);
          return;
          label329:
          if (params.fKK.equals(((a)this.kOp.get(i)).fKK))
          {
            w.v("MicroMsg.CollectMainUI", "func[onRecv] Duplicated msg, transId=" + params.fKK);
            if (((a)this.kOp.get(i)).status == 0)
            {
              ((a)this.kOp.get(i)).status = params.status;
              ((a)this.kOp.get(i)).kKX = params.kKX;
              ((a)this.kOp.get(i)).fvV = params.fvV;
              if (params.status == 1)
              {
                localObject = this.kOx;
                a locala = (a)this.kOp.get(i);
                ((b)localObject).kOY.add(locala);
              }
            }
            i = 1;
            break label215;
          }
          i += 1;
          break;
        }
        i += 1;
      }
      label519:
      i = 0;
    }
  }
  
  public boolean f(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(5406155866112L, 40279);
    GMTrace.o(5406155866112L, 40279);
    return false;
  }
  
  public void finish()
  {
    GMTrace.i(5407095390208L, 40286);
    super.finish();
    overridePendingTransition(R.a.aMn, R.a.aMq);
    GMTrace.o(5407095390208L, 40286);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5405753212928L, 40276);
    int i = R.i.cQO;
    GMTrace.o(5405753212928L, 40276);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5406558519296L, 40282);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(5406558519296L, 40282);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        this.kOo = paramIntent.getStringExtra("ftf_pay_url");
        this.kOq = paramIntent.getDoubleExtra("ftf_fixed_fee", 0.0D);
        this.kOr = paramIntent.getStringExtra("ftf_fixed_fee_type");
        this.kOs = paramIntent.getStringExtra("ftf_fixed_desc");
        this.kOn = paramIntent.getStringExtra("key_currency_unit");
        this.kOh.setText(this.kOz);
      }
      for (this.kOt = true;; this.kOt = false)
      {
        amr();
        aon();
        GMTrace.o(5406558519296L, 40282);
        return;
      }
      this.kNC = com.tencent.mm.x.m.zK();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5404679471104L, 40268);
    super.onCreate(paramBundle);
    paramBundle = getWindow().getAttributes();
    if (paramBundle.screenBrightness < 0.85F)
    {
      paramBundle.screenBrightness = 0.85F;
      getWindow().setAttributes(paramBundle);
    }
    cO().cP().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.e.aMW)));
    paramBundle = cO().cP().getCustomView();
    if (paramBundle != null)
    {
      View localView = paramBundle.findViewById(R.h.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(R.e.aOF));
      }
      paramBundle = paramBundle.findViewById(16908309);
      if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
        ((TextView)paramBundle).setTextColor(getResources().getColor(R.e.white));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.setStatusBarColor(getResources().getColor(R.e.aMX));
    }
    ap.AS();
    this.fQa = ((Integer)com.tencent.mm.x.c.xi().get(w.a.uYH, Integer.valueOf(0))).intValue();
    this.kNC = com.tencent.mm.x.m.zK();
    int i = getIntent().getIntExtra("key_from_scene", 1);
    g.paX.i(14021, new Object[] { Integer.valueOf(2), Integer.valueOf(i) });
    ap.AS();
    boolean bool = ((String)com.tencent.mm.x.c.xi().get(327731, "0")).equals("0");
    overridePendingTransition(R.a.aMp, R.a.aMo);
    if (bool)
    {
      paramBundle = this.vov.voR;
      if (!com.tencent.mm.x.m.zS()) {
        break label553;
      }
    }
    label553:
    for (i = R.l.dLf;; i = R.l.dLe)
    {
      com.tencent.mm.ui.base.h.a(paramBundle, i, R.l.dLg, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5414074712064L, 40338);
          GMTrace.o(5414074712064L, 40338);
        }
      });
      ap.AS();
      com.tencent.mm.x.c.xi().set(327731, "1");
      ap.AS();
      com.tencent.mm.x.c.xi().kz(true);
      com.tencent.mm.plugin.collect.a.a.anz();
      paramBundle = com.tencent.mm.plugin.collect.a.a.anA();
      if (!paramBundle.kmu.contains(this)) {
        paramBundle.kmu.add(this);
      }
      MH();
      aoi();
      amr();
      this.kNQ = ((Vibrator)getSystemService("vibrator"));
      this.kOu = bg.Po();
      if (kOM < 0)
      {
        paramBundle = new DisplayMetrics();
        ((WindowManager)getSystemService("window")).getDefaultDisplay().getMetrics(paramBundle);
        kOM = paramBundle.widthPixels / 2 - BackwardSupportUtil.b.a(this.vov.voR, 20.0F);
        kON = BackwardSupportUtil.b.a(this.vov.voR, 60.0F);
        kOO = BackwardSupportUtil.b.a(this.vov.voR, 40.0F);
        kOP = BackwardSupportUtil.b.a(this.vov.voR, 70.0F);
      }
      aon();
      o.eK(16, 0);
      GMTrace.o(5404679471104L, 40268);
      return;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5404813688832L, 40269);
    if (this.kNR != null) {
      this.kNR.setImageBitmap(null);
    }
    Object localObject = this.kOk;
    if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
    {
      w.i("MicroMsg.CollectMainUI", "bitmap recycle %s", new Object[] { localObject });
      ((Bitmap)localObject).recycle();
    }
    if (this.kNZ != null) {
      this.kNZ.dismiss();
    }
    com.tencent.mm.plugin.collect.a.a.anz();
    com.tencent.mm.plugin.collect.a.a.anA().kmu.remove(this);
    this.kNQ.cancel();
    if (this.kOA != null)
    {
      localObject = this.kOA;
      Iterator localIterator = ((com.tencent.mm.plugin.collect.b.f)localObject).gMM.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        w.i("MicroMsg.F2fGetPayUrlManager", "uninit, do cancel netscene");
        ap.wT().c((com.tencent.mm.ac.k)localEntry.getKey());
      }
      ((com.tencent.mm.plugin.collect.b.f)localObject).gMM.clear();
      ap.wT().b(1588, (com.tencent.mm.ac.e)localObject);
    }
    j.c(this.kOL);
    super.onDestroy();
    GMTrace.o(5404813688832L, 40269);
  }
  
  protected void onPause()
  {
    GMTrace.i(5406826954752L, 40284);
    super.onPause();
    au.a(null);
    GMTrace.o(5406826954752L, 40284);
  }
  
  protected void onResume()
  {
    GMTrace.i(5406692737024L, 40283);
    super.onResume();
    au.a(this);
    GMTrace.o(5406692737024L, 40283);
  }
  
  final class a
    extends s
  {
    public boolean kvv;
    
    public a(s params)
    {
      GMTrace.i(5436086419456L, 40502);
      this.kvv = false;
      this.username = params.username;
      this.fKK = params.fKK;
      this.kKX = params.kKX;
      this.kKY = params.kKY;
      this.scene = params.scene;
      this.status = params.status;
      this.gEW = params.gEW;
      GMTrace.o(5436086419456L, 40502);
    }
  }
  
  private final class b
  {
    public boolean kOX;
    LinkedList<CollectMainUI.a> kOY;
    
    public b()
    {
      GMTrace.i(5414880018432L, 40344);
      this.kOY = new LinkedList();
      GMTrace.o(5414880018432L, 40344);
    }
    
    public final void aaZ()
    {
      GMTrace.i(5415014236160L, 40345);
      if (!this.kOX)
      {
        if (!this.kOY.isEmpty())
        {
          final Object localObject = (CollectMainUI.a)this.kOY.poll();
          this.kOX = true;
          CollectMainUI.h(CollectMainUI.this);
          CollectMainUI.k(CollectMainUI.this).setLayoutParams(new LinearLayout.LayoutParams(CollectMainUI.f(CollectMainUI.this).getWidth(), CollectMainUI.f(CollectMainUI.this).getHeight()));
          if (CollectMainUI.this.kOt) {
            CollectMainUI.k(CollectMainUI.this).setPadding(0, CollectMainUI.aou(), 0, 0);
          }
          final AnimationSet localAnimationSet;
          int j;
          for (;;)
          {
            CollectMainUI.l(CollectMainUI.this).setText(com.tencent.mm.pluginsdk.ui.d.h.b(CollectMainUI.this.vov.voR, ((CollectMainUI.a)localObject).gEW, CollectMainUI.l(CollectMainUI.this).getTextSize()));
            a.b.a(CollectMainUI.m(CollectMainUI.this), ((CollectMainUI.a)localObject).username);
            CollectMainUI.n(CollectMainUI.this).setText(com.tencent.mm.wallet_core.ui.e.d(((CollectMainUI.a)localObject).kKX, ((CollectMainUI.a)localObject).fvV));
            CollectMainUI.k(CollectMainUI.this).setVisibility(0);
            localAnimationSet = new AnimationSet(false);
            localAnimationSet.addAnimation(new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F));
            j = 0;
            int i = 0;
            while (i < CollectMainUI.o(CollectMainUI.this).size())
            {
              if (((CollectMainUI.a)CollectMainUI.o(CollectMainUI.this).get(i)).fKK.equals(((CollectMainUI.a)localObject).fKK)) {
                j = i;
              }
              i += 1;
            }
            CollectMainUI.k(CollectMainUI.this).setPadding(0, CollectMainUI.aov(), 0, 0);
          }
          float f3 = CollectMainUI.aor();
          float f2 = 0.0F + CollectMainUI.f(CollectMainUI.this).getHeight() / 2;
          float f1 = f2;
          if (CollectMainUI.j(CollectMainUI.this).getVisibility() == 0) {
            f1 = f2 + CollectMainUI.j(CollectMainUI.this).getHeight();
          }
          f2 = j * CollectMainUI.aos() + CollectMainUI.aos() / 2;
          int[] arrayOfInt = new int[2];
          CollectMainUI.f(CollectMainUI.this).getLocationInWindow(arrayOfInt);
          localAnimationSet.addAnimation(new TranslateAnimation(0.0F, f3, 0.0F, (int)(f1 + f2 + (arrayOfInt[1] - CollectMainUI.aot()))));
          localAnimationSet.setDuration(300L);
          localAnimationSet.setInterpolator(new DecelerateInterpolator());
          localAnimationSet.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5423872606208L, 40411);
              CollectMainUI.k(CollectMainUI.this).setVisibility(8);
              w.d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Animation end. TransId=" + localObject.fKK);
              int i = 0;
              for (;;)
              {
                if (i < CollectMainUI.o(CollectMainUI.this).size())
                {
                  if (((CollectMainUI.a)CollectMainUI.o(CollectMainUI.this).get(i)).fKK.equals(localObject.fKK))
                  {
                    ((CollectMainUI.a)CollectMainUI.o(CollectMainUI.this).get(i)).kvv = true;
                    w.d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Update msg animation status. TransId=" + localObject.fKK);
                  }
                }
                else
                {
                  CollectMainUI.h(CollectMainUI.this);
                  CollectMainUI.b.this.kOX = false;
                  CollectMainUI.b.this.aaZ();
                  GMTrace.o(5423872606208L, 40411);
                  return;
                }
                i += 1;
              }
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5424006823936L, 40412);
              GMTrace.o(5424006823936L, 40412);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5424141041664L, 40413);
              GMTrace.o(5424141041664L, 40413);
            }
          });
          localObject = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
          ((ScaleAnimation)localObject).setDuration(300L);
          ((ScaleAnimation)localObject).setInterpolator(new LinearInterpolator());
          ((ScaleAnimation)localObject).setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5426691178496L, 40432);
              localAnimationSet.setStartOffset(1700L);
              CollectMainUI.k(CollectMainUI.this).startAnimation(localAnimationSet);
              GMTrace.o(5426691178496L, 40432);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5426825396224L, 40433);
              GMTrace.o(5426825396224L, 40433);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5426959613952L, 40434);
              CollectMainUI.k(CollectMainUI.this).setVisibility(0);
              GMTrace.o(5426959613952L, 40434);
            }
          });
          CollectMainUI.k(CollectMainUI.this).startAnimation((Animation)localObject);
          GMTrace.o(5415014236160L, 40345);
        }
      }
      else {
        w.d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Animating, wait. QueueSize=" + this.kOY.size());
      }
      GMTrace.o(5415014236160L, 40345);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */