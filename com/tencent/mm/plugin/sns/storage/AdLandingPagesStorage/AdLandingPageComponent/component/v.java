package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView.a;
import com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class v
  extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a
{
  public static int qrF;
  private Context context;
  private ae ham;
  public String iVt;
  int lyG;
  public View ocG;
  private long oed;
  public int pWM;
  public int pWN;
  public int pWO;
  private boolean qrA;
  boolean qrB;
  boolean qrC;
  public boolean qrD;
  public boolean qrE;
  public boolean qrG;
  aa qrc;
  public OfflineVideoView qrd;
  VideoPlayerSeekBar qre;
  private ProgressBar qrf;
  public int qrg;
  private ImageView qrh;
  public boolean qri;
  public boolean qrj;
  private TextView qrk;
  private int qrl;
  private int qrm;
  public int qrn;
  public int qro;
  private int qrp;
  public boolean qrq;
  ImageView qrr;
  int qrs;
  boolean qrt;
  int qru;
  public int qrv;
  public boolean qrw;
  public boolean qrx;
  private boolean qry;
  private boolean qrz;
  
  static
  {
    GMTrace.i(18578552127488L, 138421);
    qrF = 999;
    GMTrace.o(18578552127488L, 138421);
  }
  
  public v(final Context paramContext, n paramn, ViewGroup paramViewGroup)
  {
    super(paramContext, paramn, paramViewGroup);
    GMTrace.i(8280294293504L, 61693);
    this.qrc = null;
    this.qri = true;
    this.oed = 0L;
    this.qrl = 0;
    this.qrm = 0;
    this.qrn = 0;
    this.qro = 0;
    this.qrp = 0;
    this.pWM = 0;
    this.pWN = 0;
    this.pWO = 0;
    this.qrq = false;
    this.qrs = 0;
    this.qrt = true;
    this.qru = 0;
    this.lyG = 0;
    this.qrv = 0;
    this.qrw = true;
    this.qrx = false;
    this.qry = false;
    this.qrz = true;
    this.qrA = false;
    this.qrB = true;
    this.qrC = true;
    this.qrE = false;
    this.qrG = false;
    this.context = paramContext;
    this.ham = new ae(Looper.getMainLooper());
    this.qrc = new aa()
    {
      public final void hU(boolean paramAnonymousBoolean)
      {
        GMTrace.i(17124571480064L, 127588);
        Intent localIntent = new Intent("com.tencent.mm.adlanding.video_progressbar_change");
        if (paramAnonymousBoolean) {}
        for (int i = 1;; i = 0)
        {
          localIntent.putExtra("show", i);
          android.support.v4.content.d.l(paramContext).a(localIntent);
          GMTrace.o(17124571480064L, 127588);
          return;
        }
      }
    };
    GMTrace.o(8280294293504L, 61693);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8282039123968L, 61706);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8282039123968L, 61706);
      return false;
    }
    try
    {
      paramJSONObject.put("sightDuration", this.qrg * 1000);
      paramJSONObject.put("playTimeInterval", this.qrl);
      paramJSONObject.put("playCount", this.qrm);
      paramJSONObject.put("playCompletedCount", this.qrn);
      paramJSONObject.put("clickVoiceControlCount", this.qrs);
      if (this.qrA) {}
      for (String str = "1";; str = "0")
      {
        paramJSONObject.put("isAutoPlay", str);
        JSONObject localJSONObject;
        if (!this.qrC)
        {
          str = com.tencent.mm.sdk.platformtools.aa.QW(((n)this.qpH).qnf);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("sightUrlInfo", localJSONObject);
        }
        if (!this.qrB)
        {
          str = com.tencent.mm.sdk.platformtools.aa.QW(((n)this.qpH).qng);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("thumbUrlInfo", localJSONObject);
        }
        paramJSONObject.put("streamVideoEnterCount", this.qrp);
        paramJSONObject.put("streamVideoPlayCount", this.pWM);
        paramJSONObject.put("streamVideoPlayCompleteCount", this.pWN);
        paramJSONObject.put("streamVideoTotalPlayTimeInMs", this.pWO);
        GMTrace.o(8282039123968L, 61706);
        return true;
      }
      return false;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.Sns.AdLandingPageSightVideoComponent", paramJSONObject, "", new Object[0]);
      GMTrace.o(8282039123968L, 61706);
    }
  }
  
  public final void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8281904906240L, 61705);
    super.O(paramInt1, paramInt2, paramInt3);
    w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "height " + paramInt2);
    if ((paramInt1 == 0) || (paramInt2 == 0))
    {
      GMTrace.o(8281904906240L, 61705);
      return;
    }
    this.qru = paramInt1;
    this.lyG = paramInt2;
    if (paramInt1 < 0)
    {
      GMTrace.o(8281904906240L, 61705);
      return;
    }
    if (paramInt1 >= 0.5F * paramInt2)
    {
      if ((this.qry) && (!this.qrz))
      {
        GMTrace.o(8281904906240L, 61705);
        return;
      }
      this.qrG = false;
      this.qrz = false;
      this.qry = true;
      NetworkInfo localNetworkInfo = ((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
      if ((!this.qrw) || ((this.qrw) && (localNetworkInfo != null) && (localNetworkInfo.getType() == 1)))
      {
        if (this.qrc != null) {
          this.qrc.hU(true);
        }
        if (this.qre.pCe > 0)
        {
          this.qre.setVisibility(4);
          this.qrr.setVisibility(0);
          this.ocG.setVisibility(0);
        }
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18579357433856L, 138427);
            if (v.this.qrx)
            {
              GMTrace.o(18579357433856L, 138427);
              return;
            }
            if (v.this.qrc != null) {
              v.this.qrc.hU(false);
            }
            v.this.qre.setVisibility(4);
            v.this.qrr.setVisibility(8);
            v.this.ocG.setVisibility(4);
            GMTrace.o(18579357433856L, 138427);
          }
        }, 3000L);
      }
      if (this.qrw)
      {
        if (localNetworkInfo == null)
        {
          this.qrh.setVisibility(0);
          this.qri = false;
          this.qrA = false;
        }
      }
      else
      {
        if (this.qrv != 0) {
          break label339;
        }
        if (localNetworkInfo != null)
        {
          if (!this.qrt) {
            break label327;
          }
          bit();
          label295:
          this.qrv = 1;
        }
      }
      for (;;)
      {
        anF();
        label327:
        label339:
        do
        {
          GMTrace.o(8281904906240L, 61705);
          return;
          this.qrA = true;
          this.qrw = false;
          break;
          bix();
          this.qrG = true;
          break label295;
          if (this.qrv == 2)
          {
            if (this.qrt) {
              bit();
            }
            for (;;)
            {
              anF();
              this.qrv = 1;
              GMTrace.o(8281904906240L, 61705);
              return;
              bix();
              this.qrG = true;
            }
          }
        } while (this.qrv != 3);
        if (this.qrt)
        {
          bit();
        }
        else
        {
          bix();
          this.qrG = true;
        }
      }
    }
    this.qrG = false;
    this.qrz = false;
    this.qry = false;
    bjj();
    if (this.qrv == 1) {
      this.qrv = 2;
    }
    GMTrace.o(8281904906240L, 61705);
  }
  
  protected final int aWs()
  {
    GMTrace.i(8280428511232L, 61694);
    int i = i.g.pOu;
    GMTrace.o(8280428511232L, 61694);
    return i;
  }
  
  public final void anF()
  {
    GMTrace.i(8280965382144L, 61698);
    if (this.qrE)
    {
      w.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "last download fail ,try again");
      this.qrd.blS();
      GMTrace.o(8280965382144L, 61698);
      return;
    }
    w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "starting play");
    if ((!this.qrD) && (!TextUtils.isEmpty(this.iVt)))
    {
      this.qrd.xC(this.iVt);
      this.qrD = true;
    }
    this.qrh.setVisibility(8);
    this.ham.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8236941967360L, 61370);
        v.this.qre.cr(true);
        v.this.qrd.blU();
        GMTrace.o(8236941967360L, 61370);
      }
    });
    this.oed = System.currentTimeMillis();
    this.qrm += 1;
    GMTrace.o(8280965382144L, 61698);
  }
  
  public final View biL()
  {
    int i = 1;
    GMTrace.i(8280696946688L, 61696);
    if (!e.aZ(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dz("adId", ((n)this.qpH).qng))) {
      this.qrB = false;
    }
    if (!e.aZ(Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages/adId_stream_" + com.tencent.mm.sdk.platformtools.aa.QW(((n)this.qpH).qnf))) {
      this.qrC = false;
    }
    Object localObject1 = this.iiK.findViewById(i.f.pLA);
    Object localObject2 = (ViewGroup)((View)localObject1).findViewById(i.f.pLt);
    this.qrd = new OfflineVideoView(this.context);
    Object localObject3 = new LinearLayout.LayoutParams(-1, -1);
    ((ViewGroup)localObject2).addView(this.qrd, 0, (ViewGroup.LayoutParams)localObject3);
    label322:
    boolean bool;
    if (((n)this.qpH).qnl == 1) {
      if ((int)((n)this.qpH).width > 0)
      {
        int j = this.kic * (int)((n)this.qpH).height / (int)((n)this.qpH).width;
        localObject3 = new RelativeLayout.LayoutParams(this.kic, j);
        ((View)localObject1).setPadding((int)((n)this.qpH).qns, (int)((n)this.qpH).qnq, (int)((n)this.qpH).qnt, (int)((n)this.qpH).qnr);
        ((ViewGroup)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject3);
        localObject2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dz("adId", ((n)this.qpH).qng);
        if (!FileOp.aZ((String)localObject2)) {
          break label1192;
        }
        this.qrd.Ih((String)localObject2);
        this.qrk = ((TextView)((View)localObject1).findViewById(i.f.pJK));
        this.qrk.setText(this.context.getString(i.j.dQj));
        this.ocG = ((View)localObject1).findViewById(i.f.pLE);
        if (this.ocG != null)
        {
          localObject2 = new RelativeLayout.LayoutParams(this.kic, this.kid);
          localObject3 = this.ocG.getParent();
          if ((localObject3 instanceof ViewGroup)) {
            ((ViewGroup)localObject3).removeView(this.ocG);
          }
          ((ViewGroup)localObject1).addView(this.ocG, (ViewGroup.LayoutParams)localObject2);
        }
        localObject2 = new RelativeLayout.LayoutParams(this.kic - com.tencent.mm.bq.a.fromDPToPix(this.context, 30), -2);
        ((RelativeLayout.LayoutParams)localObject2).addRule(12);
        ((RelativeLayout.LayoutParams)localObject2).bottomMargin = BackwardSupportUtil.b.a(this.context, this.context.getResources().getDimension(i.d.pGw));
        this.qre = new VideoPlayerSeekBar(this.context);
        this.qre.setVisibility(4);
        if (this.qrc != null)
        {
          localObject3 = this.qrc;
          if (this.qre.getVisibility() != 0) {
            break label1224;
          }
          bool = true;
          label538:
          ((aa)localObject3).hU(bool);
        }
        this.qre.pBX = new b()
        {
          public final void Xh()
          {
            GMTrace.i(8246605643776L, 61442);
            if (v.this.qrd != null) {
              v.this.qrd.blT();
            }
            GMTrace.o(8246605643776L, 61442);
          }
          
          public final void iH(int paramAnonymousInt)
          {
            GMTrace.i(8246739861504L, 61443);
            w.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onSeek time " + paramAnonymousInt);
            if (v.this.qrt) {
              v.this.bit();
            }
            for (;;)
            {
              v.this.qrd.I(paramAnonymousInt, v.this.qre.fBB);
              GMTrace.o(8246739861504L, 61443);
              return;
              v.this.bix();
            }
          }
        };
        this.qre.d(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8222043799552L, 61259);
            w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "btn onclick view [%b] bar[%b]", new Object[] { Boolean.valueOf(v.this.qrd.isPlaying()), Boolean.valueOf(v.this.qre.fBB) });
            v.this.qri = true;
            if (v.this.qre.fBB)
            {
              v.this.bjj();
              v.this.qrv = 4;
              paramAnonymousView = v.this;
              paramAnonymousView.qro += 1;
              GMTrace.o(8222043799552L, 61259);
              return;
            }
            if (v.this.qrt) {
              v.this.bit();
            }
            for (;;)
            {
              v.this.anF();
              v.this.qrv = 3;
              if (!v.this.qmB) {
                break;
              }
              v.this.biy();
              break;
              v.this.bix();
              v.this.qrG = true;
            }
          }
        });
        this.qre.cr(this.qrd.isPlaying());
        this.qre.seek(0);
        ((ViewGroup)localObject1).addView(this.qre, (ViewGroup.LayoutParams)localObject2);
        this.qrr = ((ImageView)((View)localObject1).findViewById(i.f.pLF));
        this.qrr.setVisibility(0);
        this.qrr.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17098533240832L, 127394);
            paramAnonymousView = v.this;
            paramAnonymousView.qrs += 1;
            if (v.this.qrt)
            {
              v.this.biy();
              v.this.bix();
              v.this.qrG = true;
            }
            for (;;)
            {
              v.this.qrq = true;
              GMTrace.o(17098533240832L, 127394);
              return;
              v.this.bit();
            }
          }
        });
        this.qrr.setPadding(0, 0, com.tencent.mm.bq.a.fromDPToPix(this.context, 8), com.tencent.mm.bq.a.fromDPToPix(this.context, 13));
        localObject2 = this.qrr.getParent();
        if ((localObject2 instanceof ViewGroup)) {
          ((ViewGroup)localObject2).removeView(this.qrr);
        }
        ((ViewGroup)localObject1).addView(this.qrr);
        this.qrh = ((ImageView)((View)localObject1).findViewById(i.f.cyW));
        this.qrh.setImageDrawable(com.tencent.mm.bq.a.b(this.context, i.i.dqL));
        this.qrh.setVisibility(8);
        this.qrh.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17125242568704L, 127593);
            v.this.qri = true;
            v.this.anF();
            v.this.qrw = false;
            if (v.this.qrq) {
              if (v.this.qrt) {
                v.this.bit();
              }
            }
            for (;;)
            {
              v.this.qrv = 3;
              v.this.qre.setVisibility(4);
              v.this.qrr.setVisibility(0);
              v.this.ocG.setVisibility(0);
              if (v.this.qrc != null) {
                v.this.qrc.hU(true);
              }
              af.i(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(17125779439616L, 127597);
                  if (v.this.qrx)
                  {
                    GMTrace.o(17125779439616L, 127597);
                    return;
                  }
                  if (v.this.qrc != null) {
                    v.this.qrc.hU(false);
                  }
                  v.this.qre.setVisibility(4);
                  v.this.qrr.setVisibility(8);
                  v.this.ocG.setVisibility(4);
                  GMTrace.o(17125779439616L, 127597);
                }
              }, 10000L);
              GMTrace.o(17125242568704L, 127593);
              return;
              v.this.bix();
              v.this.qrG = true;
              continue;
              v.this.bix();
              v.this.qrG = true;
              v.this.qrq = true;
            }
          }
        });
        this.qrd.qCZ = new OfflineVideoView.a()
        {
          public final boolean a(PString paramAnonymousPString)
          {
            GMTrace.i(17836999180288L, 132896);
            String str1 = v.this.bjg().qnf;
            String str2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dA("adId", str1);
            if (FileOp.aZ(str2))
            {
              paramAnonymousPString.value = str2;
              v.this.qrD = true;
              GMTrace.o(17836999180288L, 132896);
              return true;
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", str1, false, 62, new d.a()
            {
              public final void Hp(String paramAnonymous2String)
              {
                GMTrace.i(17836730744832L, 132894);
                w.v("MicroMsg.Sns.AdLandingPageSightVideoComponent", "video view height " + v.this.iiK.getHeight() + ", player height " + v.this.qrd.getHeight());
                v.this.qrE = false;
                v.this.iVt = paramAnonymous2String;
                if (v.this.qre.fBB)
                {
                  v.this.qrd.xC(paramAnonymous2String);
                  v.this.qrD = true;
                }
                GMTrace.o(17836730744832L, 132894);
              }
              
              public final void biT()
              {
                GMTrace.i(17836462309376L, 132892);
                GMTrace.o(17836462309376L, 132892);
              }
              
              public final void biU()
              {
                GMTrace.i(17836596527104L, 132893);
                w.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "video download fail");
                v.this.qrE = true;
                GMTrace.o(17836596527104L, 132893);
              }
            });
            GMTrace.o(17836999180288L, 132896);
            return false;
          }
          
          public final void onStart(int paramAnonymousInt)
          {
            boolean bool = true;
            GMTrace.i(17130745495552L, 127634);
            v.this.qrj = true;
            v.this.qrg = paramAnonymousInt;
            if (v.this.qre.pCe != paramAnonymousInt) {
              v.this.qre.tI(v.this.qrg);
            }
            v.this.qre.setVisibility(4);
            v.this.qrr.setVisibility(0);
            aa localaa;
            if (v.this.qrc != null)
            {
              localaa = v.this.qrc;
              if (v.this.qre.getVisibility() != 0) {
                break label133;
              }
            }
            for (;;)
            {
              localaa.hU(bool);
              v.this.bji();
              GMTrace.o(17130745495552L, 127634);
              return;
              label133:
              bool = false;
            }
          }
          
          public final void qq()
          {
            GMTrace.i(17130611277824L, 127633);
            v localv = v.this;
            localv.qrn += 1;
            localv = v.this;
            localv.qre.seek(0);
            localv.bji();
            GMTrace.o(17130611277824L, 127633);
          }
          
          public final void uu(final int paramAnonymousInt)
          {
            GMTrace.i(17130879713280L, 127635);
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17128598011904L, 127618);
                w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "play time " + paramAnonymousInt + " video time " + v.this.qrg);
                if (v.this.qre.pCe != v.this.qrg) {
                  v.this.qre.tI(v.this.qrg);
                }
                v.this.qre.seek(paramAnonymousInt);
                v.this.qre.cr(v.this.qrd.isPlaying());
                if (v.this.qrd.isPlaying()) {
                  v.this.qrj = true;
                }
                GMTrace.o(17128598011904L, 127618);
              }
            });
            GMTrace.o(17130879713280L, 127635);
          }
        };
        this.qre.setVisibility(4);
        this.qrr.setVisibility(8);
        this.ocG.setVisibility(4);
        if (this.qrc != null)
        {
          localObject2 = this.qrc;
          if (this.qre.getVisibility() != 0) {
            break label1229;
          }
          bool = true;
          label839:
          ((aa)localObject2).hU(bool);
        }
        this.qrd.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            boolean bool = true;
            GMTrace.i(15274514317312L, 113804);
            if (v.this.qrj)
            {
              v.this.qrx = true;
              if (v.this.qre.getVisibility() != 0) {
                break label122;
              }
              v.this.qre.setVisibility(4);
              v.this.qrr.setVisibility(8);
              v.this.ocG.setVisibility(4);
              if (v.this.qrc != null)
              {
                paramAnonymousView = v.this.qrc;
                if (v.this.qre.getVisibility() != 0) {
                  break label158;
                }
              }
            }
            for (;;)
            {
              paramAnonymousView.hU(bool);
              GMTrace.o(15274514317312L, 113804);
              return;
              label122:
              v.this.qre.setVisibility(4);
              v.this.qrr.setVisibility(0);
              v.this.ocG.setVisibility(0);
              break;
              label158:
              bool = false;
            }
          }
        });
        this.qrf = ((ProgressBar)((View)localObject1).findViewById(i.f.cle));
        this.qrf.setVisibility(8);
        localObject1 = (n)this.qpH;
        if ((((n)localObject1).fvu != 1) || (((n)localObject1).qni.length() <= 0) || (((n)localObject1).qnh.length() <= 0)) {
          break label1234;
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject1 = this.iiK.findViewById(i.f.pLu);
        ((View)localObject1).setVisibility(0);
        localObject2 = (Button)((View)localObject1).findViewById(i.f.pLv);
        ((Button)localObject2).setTextColor(((n)this.qpH).qnj);
        ((Button)localObject2).setText(((n)this.qpH).qni);
        ((Button)localObject2).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18578686345216L, 138422);
            v.this.bjh();
            GMTrace.o(18578686345216L, 138422);
          }
        });
        ((View)localObject1).findViewById(i.f.pLw).setBackgroundColor(((n)this.qpH).qnk);
      }
      localObject1 = this.iiK;
      GMTrace.o(8280696946688L, 61696);
      return (View)localObject1;
      ((ViewGroup)localObject2).setLayoutParams(new RelativeLayout.LayoutParams(this.kic, this.kid));
      ((View)localObject1).setLayoutParams(new RelativeLayout.LayoutParams(this.kic, this.kid));
      ((View)localObject1).setMinimumHeight(this.kid);
      break;
      localObject3 = new RelativeLayout.LayoutParams((int)((n)this.qpH).width, (int)((n)this.qpH).height);
      ((View)localObject1).setPadding((int)((n)this.qpH).qns, (int)((n)this.qpH).qnq, (int)((n)this.qpH).qnt, (int)((n)this.qpH).qnr);
      ((ViewGroup)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
      ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject3);
      break;
      label1192:
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", ((n)this.qpH).qng, false, 1000000001, 0, new d.a()
      {
        public final void Hp(String paramAnonymousString)
        {
          GMTrace.i(17129537536000L, 127625);
          v.this.qrd.Ih(paramAnonymousString);
          GMTrace.o(17129537536000L, 127625);
        }
        
        public final void biT()
        {
          GMTrace.i(17129269100544L, 127623);
          GMTrace.o(17129269100544L, 127623);
        }
        
        public final void biU()
        {
          GMTrace.i(17129403318272L, 127624);
          GMTrace.o(17129403318272L, 127624);
        }
      });
      break label322;
      label1224:
      bool = false;
      break label538;
      label1229:
      bool = false;
      break label839;
      label1234:
      i = 0;
    }
  }
  
  protected final void biR()
  {
    GMTrace.i(8280562728960L, 61695);
    w.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", getClass().getName() + "not support update now");
    GMTrace.o(8280562728960L, 61695);
  }
  
  public final void bit()
  {
    GMTrace.i(8281233817600L, 61700);
    super.bit();
    this.qrr.setImageDrawable(com.tencent.mm.bq.a.b(this.context, i.e.pGT));
    this.qrd.ck(true);
    this.qrt = true;
    GMTrace.o(8281233817600L, 61700);
  }
  
  public final void biu()
  {
    GMTrace.i(8281770688512L, 61704);
    super.biu();
    this.qrd.onDestroy();
    GMTrace.o(8281770688512L, 61704);
  }
  
  public final void biv()
  {
    GMTrace.i(8281502253056L, 61702);
    super.biv();
    GMTrace.o(8281502253056L, 61702);
  }
  
  public final void biw()
  {
    GMTrace.i(8281636470784L, 61703);
    super.biw();
    bjj();
    this.qrG = false;
    if ((!this.qry) && (!this.qrz))
    {
      GMTrace.o(8281636470784L, 61703);
      return;
    }
    this.qrz = false;
    this.qry = false;
    if (this.qrv == 1) {
      this.qrv = 2;
    }
    GMTrace.o(8281636470784L, 61703);
  }
  
  public final void bix()
  {
    GMTrace.i(8281368035328L, 61701);
    super.bix();
    this.qrr.setImageDrawable(com.tencent.mm.bq.a.b(this.context, i.e.pGU));
    this.qrd.ck(false);
    this.qrt = false;
    GMTrace.o(8281368035328L, 61701);
  }
  
  public final n bjg()
  {
    GMTrace.i(17124974133248L, 127591);
    n localn = (n)this.qpH;
    GMTrace.o(17124974133248L, 127591);
    return localn;
  }
  
  public final void bjh()
  {
    GMTrace.i(18578417909760L, 138420);
    n localn = (n)this.qpH;
    if (bg.mZ(localn.qnh))
    {
      w.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click without streamVideoUrl!");
      GMTrace.o(18578417909760L, 138420);
      return;
    }
    if (!(this.context instanceof Activity))
    {
      w.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click but context not activity!");
      GMTrace.o(18578417909760L, 138420);
      return;
    }
    w.v("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click, jumpto [%s]", new Object[] { localn.qnh });
    Intent localIntent = new Intent();
    localIntent.setClass(this.context, VideoAdPlayerUI.class);
    localIntent.putExtra("IsAd", true);
    localIntent.putExtra("KMediaId", com.tencent.mm.sdk.platformtools.aa.QW(localn.qnh));
    localIntent.putExtra("KThumUrl", localn.qng);
    localIntent.putExtra("KStremVideoUrl", localn.qnh);
    localIntent.putExtra("ForceLandscape", true);
    localIntent.putExtra("ShareBtnHidden", 1);
    localIntent.putExtra("KComponentCid", biW());
    ((Activity)this.context).startActivityForResult(localIntent, qrF);
    this.qrp += 1;
    GMTrace.o(18578417909760L, 138420);
  }
  
  public final void bji()
  {
    GMTrace.i(17125108350976L, 127592);
    if ((this.qrd != null) && (this.qre != null) && (Math.abs(this.qrd.getCurrentPosition() - this.qre.jR) > 1)) {
      this.qrd.B(this.qre.jR, true);
    }
    GMTrace.o(17125108350976L, 127592);
  }
  
  public final void bjj()
  {
    GMTrace.i(8281099599872L, 61699);
    w.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "pause play");
    if (!this.qri) {
      this.qrh.setVisibility(0);
    }
    this.ham.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15275453841408L, 113811);
        v.this.qrd.blT();
        v.this.qre.cr(false);
        GMTrace.o(15275453841408L, 113811);
      }
    });
    if (this.oed != 0L)
    {
      this.qrl = ((int)(this.qrl + (System.currentTimeMillis() - this.oed)));
      this.oed = 0L;
    }
    GMTrace.o(8281099599872L, 61699);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */