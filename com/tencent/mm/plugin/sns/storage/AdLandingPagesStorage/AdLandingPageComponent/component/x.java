package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

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
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.b;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView.a;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class x
  extends w
{
  private Context context;
  public ae ham;
  public String iVt;
  int lyG;
  public View ocG;
  public long oed;
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
  public int qrl;
  private int qrm;
  public int qrn;
  public int qro;
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
  
  public x(final Context paramContext, t paramt, ViewGroup paramViewGroup)
  {
    super(paramContext, paramt, paramViewGroup);
    GMTrace.i(8248753127424L, 61458);
    this.qrc = null;
    this.qri = true;
    this.oed = 0L;
    this.qrl = 0;
    this.qrm = 0;
    this.qrn = 0;
    this.qro = 0;
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
        GMTrace.i(17128195358720L, 127615);
        Intent localIntent = new Intent("com.tencent.mm.adlanding.video_progressbar_change");
        if (paramAnonymousBoolean) {}
        for (int i = 1;; i = 0)
        {
          localIntent.putExtra("show", i);
          android.support.v4.content.d.l(paramContext).a(localIntent);
          GMTrace.o(17128195358720L, 127615);
          return;
        }
      }
    };
    GMTrace.o(8248753127424L, 61458);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8250363740160L, 61470);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8250363740160L, 61470);
      return false;
    }
    try
    {
      paramJSONObject.put("streamVideoDuraion", this.qrg * 1000);
      paramJSONObject.put("playTimeInterval", this.qrl);
      paramJSONObject.put("playCount", this.qrm);
      paramJSONObject.put("playCompletedCount", this.qrn);
      paramJSONObject.put("clickPlayControlCount", this.qro);
      paramJSONObject.put("clickVoiceControlCount", this.qrs);
      if (this.qrA) {}
      for (String str = "1";; str = "0")
      {
        paramJSONObject.put("isAutoPlay", str);
        JSONObject localJSONObject;
        if (!this.qrB)
        {
          str = com.tencent.mm.sdk.platformtools.aa.QW(((t)this.qpH).qnM);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("thumbUrlInfo", localJSONObject);
        }
        if (!this.qrC)
        {
          str = com.tencent.mm.sdk.platformtools.aa.QW(((t)this.qpH).qnh);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("streamVideoUrlInfo", localJSONObject);
        }
        GMTrace.o(8250363740160L, 61470);
        return true;
      }
      return false;
    }
    catch (JSONException paramJSONObject)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", paramJSONObject, "", new Object[0]);
      GMTrace.o(8250363740160L, 61470);
    }
  }
  
  public final void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8250229522432L, 61469);
    super.O(paramInt1, paramInt2, paramInt3);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "height " + paramInt2);
    if ((paramInt1 == 0) || (paramInt2 == 0))
    {
      GMTrace.o(8250229522432L, 61469);
      return;
    }
    this.qru = paramInt1;
    this.lyG = paramInt2;
    if (paramInt1 < 0)
    {
      GMTrace.o(8250229522432L, 61469);
      return;
    }
    if (paramInt1 >= 0.5F * paramInt2)
    {
      if ((this.qry) && (!this.qrz))
      {
        GMTrace.o(8250229522432L, 61469);
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
          this.qre.setVisibility(0);
          this.qrr.setVisibility(0);
          this.ocG.setVisibility(0);
        }
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17124839915520L, 127590);
            if (x.this.qrx)
            {
              GMTrace.o(17124839915520L, 127590);
              return;
            }
            if (x.this.qrc != null) {
              x.this.qrc.hU(false);
            }
            x.this.qre.setVisibility(4);
            x.this.qrr.setVisibility(8);
            x.this.ocG.setVisibility(4);
            GMTrace.o(17124839915520L, 127590);
          }
        }, 3000L);
      }
      if (this.qrw)
      {
        if ((localNetworkInfo == null) || ((localNetworkInfo != null) && (localNetworkInfo.getType() != 1)))
        {
          this.qrh.setVisibility(0);
          this.qri = false;
          this.qrA = false;
        }
      }
      else
      {
        if (this.qrv != 0) {
          break label355;
        }
        if ((localNetworkInfo != null) && (localNetworkInfo.getType() == 1))
        {
          if (!this.qrt) {
            break label343;
          }
          bit();
          label312:
          this.qrv = 1;
        }
      }
      for (;;)
      {
        anF();
        label343:
        label355:
        do
        {
          GMTrace.o(8250229522432L, 61469);
          return;
          this.qrA = true;
          this.qrw = false;
          break;
          bix();
          this.qrG = true;
          break label312;
          if (this.qrv == 2)
          {
            if (this.qrt) {
              bit();
            }
            for (;;)
            {
              anF();
              this.qrv = 1;
              GMTrace.o(8250229522432L, 61469);
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
    GMTrace.o(8250229522432L, 61469);
  }
  
  protected final int aWs()
  {
    GMTrace.i(8248887345152L, 61459);
    int i = i.g.pOu;
    GMTrace.o(8248887345152L, 61459);
    return i;
  }
  
  public final void anF()
  {
    GMTrace.i(8249155780608L, 61461);
    if (this.qrE)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "last download fail ,try again");
      this.qrd.blS();
      GMTrace.o(8249155780608L, 61461);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "starting play");
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
        GMTrace.i(8243384418304L, 61418);
        OfflineVideoView localOfflineVideoView = x.this.qrd;
        VideoPlayerTextureView localVideoPlayerTextureView;
        int i;
        boolean bool;
        if ((localOfflineVideoView.kwz instanceof VideoPlayerTextureView))
        {
          localVideoPlayerTextureView = (VideoPlayerTextureView)localOfflineVideoView.kwz;
          if (localVideoPlayerTextureView.nTk == null)
          {
            i = 0;
            if ((i == 0) || (!localOfflineVideoView.isPlaying())) {
              break label110;
            }
            bool = true;
          }
        }
        for (;;)
        {
          if (bool) {
            break label123;
          }
          x.this.qre.cr(true);
          x.this.qrd.blU();
          GMTrace.o(8243384418304L, 61418);
          return;
          if (localVideoPlayerTextureView.tmO)
          {
            i = 0;
            break;
          }
          i = 1;
          break;
          label110:
          bool = false;
          continue;
          bool = localOfflineVideoView.isPlaying();
        }
        label123:
        x.this.qrd.aao();
        GMTrace.o(8243384418304L, 61418);
      }
    });
    this.oed = System.currentTimeMillis();
    this.qrm += 1;
    GMTrace.o(8249155780608L, 61461);
  }
  
  public final View biL()
  {
    boolean bool2 = true;
    GMTrace.i(8249021562880L, 61460);
    if (!e.aZ(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dz("adId", ((t)this.qpH).qnM))) {
      this.qrB = false;
    }
    if (!e.aZ(Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages/adId_stream_" + com.tencent.mm.sdk.platformtools.aa.QW(((t)this.qpH).qnh))) {
      this.qrC = false;
    }
    View localView = this.iiK.findViewById(i.f.pLA);
    Object localObject1 = (ViewGroup)localView.findViewById(i.f.pLt);
    this.qrd = new OfflineVideoView(this.context);
    Object localObject2 = new LinearLayout.LayoutParams(-1, -1);
    ((ViewGroup)localObject1).addView(this.qrd, 0, (ViewGroup.LayoutParams)localObject2);
    int i;
    if (((t)this.qpH).qnN == 1) {
      if ((int)((t)this.qpH).width > 0)
      {
        i = this.kic * (int)((t)this.qpH).height / (int)((t)this.qpH).width;
        localObject2 = new RelativeLayout.LayoutParams(this.kic, i);
        localView.setPadding((int)((t)this.qpH).qns, (int)((t)this.qpH).qnq, (int)((t)this.qpH).qnt, (int)((t)this.qpH).qnr);
        ((ViewGroup)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localView.setMinimumHeight(i);
        localObject1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dz("adId", ((t)this.qpH).qnM);
        if (!FileOp.aZ((String)localObject1)) {
          break label1053;
        }
        this.qrd.Ih((String)localObject1);
        label328:
        this.qrk = ((TextView)localView.findViewById(i.f.pJK));
        this.qrk.setText(this.context.getString(i.j.dQj));
        this.ocG = localView.findViewById(i.f.pLE);
        if (this.ocG != null)
        {
          localObject1 = new RelativeLayout.LayoutParams(this.kic, this.kid);
          localObject2 = this.ocG.getParent();
          if ((localObject2 instanceof ViewGroup)) {
            ((ViewGroup)localObject2).removeView(this.ocG);
          }
          ((ViewGroup)localView).addView(this.ocG, (ViewGroup.LayoutParams)localObject1);
        }
        localObject1 = new RelativeLayout.LayoutParams(this.kic - com.tencent.mm.bq.a.fromDPToPix(this.context, 30), -2);
        ((RelativeLayout.LayoutParams)localObject1).addRule(12);
        ((RelativeLayout.LayoutParams)localObject1).bottomMargin = BackwardSupportUtil.b.a(this.context, this.context.getResources().getDimension(i.d.pGw));
        this.qre = new VideoPlayerSeekBar(this.context);
        this.qre.setVisibility(4);
        if (this.qrc != null)
        {
          localObject2 = this.qrc;
          if (this.qre.getVisibility() != 0) {
            break label1085;
          }
          bool1 = true;
          label544:
          ((aa)localObject2).hU(bool1);
        }
        this.qre.pBX = new b()
        {
          public final void Xh()
          {
            GMTrace.i(17127658487808L, 127611);
            if (x.this.qrd != null) {
              x.this.qrd.blT();
            }
            GMTrace.o(17127658487808L, 127611);
          }
          
          public final void iH(int paramAnonymousInt)
          {
            GMTrace.i(17127792705536L, 127612);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "onSeek time " + paramAnonymousInt);
            if (x.this.qrt) {
              x.this.bit();
            }
            for (;;)
            {
              x.this.qrd.I(paramAnonymousInt, x.this.qre.fBB);
              GMTrace.o(17127792705536L, 127612);
              return;
              x.this.bix();
            }
          }
        };
        this.qre.d(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8283381301248L, 61716);
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "btn onclick view [%b] bar[%b]", new Object[] { Boolean.valueOf(x.this.qrd.isPlaying()), Boolean.valueOf(x.this.qre.fBB) });
            x.this.qri = true;
            if (x.this.qre.fBB)
            {
              x.this.bjj();
              x.this.qrv = 4;
              if (x.this.qmD)
              {
                paramAnonymousView = x.this;
                paramAnonymousView.qro += 1;
              }
              GMTrace.o(8283381301248L, 61716);
              return;
            }
            if (x.this.qrt) {
              x.this.bit();
            }
            for (;;)
            {
              x.this.anF();
              x.this.qrv = 3;
              if (!x.this.qmB) {
                break;
              }
              x.this.biy();
              break;
              x.this.bix();
              x.this.qrG = true;
            }
          }
        });
        this.qre.cr(this.qrd.isPlaying());
        this.qre.seek(0);
        ((ViewGroup)localView).addView(this.qre, (ViewGroup.LayoutParams)localObject1);
        this.qrr = ((ImageView)localView.findViewById(i.f.pLF));
        this.qrr.setVisibility(0);
        this.qrr.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8263248642048L, 61566);
            paramAnonymousView = x.this;
            paramAnonymousView.qrs += 1;
            if (x.this.qrt)
            {
              x.this.biy();
              x.this.bix();
              x.this.qrG = true;
            }
            for (;;)
            {
              x.this.qrq = true;
              GMTrace.o(8263248642048L, 61566);
              return;
              x.this.bit();
            }
          }
        });
        this.qrr.setPadding(0, 0, com.tencent.mm.bq.a.fromDPToPix(this.context, 8), com.tencent.mm.bq.a.fromDPToPix(this.context, 13));
        localObject1 = this.qrr.getParent();
        if ((localObject1 instanceof ViewGroup)) {
          ((ViewGroup)localObject1).removeView(this.qrr);
        }
        ((ViewGroup)localView).addView(this.qrr);
        this.qrh = ((ImageView)localView.findViewById(i.f.cyW));
        this.qrh.setImageDrawable(com.tencent.mm.bq.a.b(this.context, i.i.dqL));
        this.qrh.setVisibility(8);
        this.qrh.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17125376786432L, 127594);
            x.this.qri = true;
            x.this.anF();
            x.this.qrw = false;
            if (x.this.qrq) {
              if (x.this.qrt) {
                x.this.bit();
              }
            }
            for (;;)
            {
              x.this.qrv = 3;
              x.this.qre.setVisibility(0);
              x.this.qrr.setVisibility(0);
              x.this.ocG.setVisibility(0);
              if (x.this.qrc != null) {
                x.this.qrc.hU(true);
              }
              af.i(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(17131416584192L, 127639);
                  if (x.this.qrx)
                  {
                    GMTrace.o(17131416584192L, 127639);
                    return;
                  }
                  if (x.this.qrc != null) {
                    x.this.qrc.hU(false);
                  }
                  x.this.qre.setVisibility(4);
                  x.this.qrr.setVisibility(8);
                  x.this.ocG.setVisibility(4);
                  GMTrace.o(17131416584192L, 127639);
                }
              }, 10000L);
              GMTrace.o(17125376786432L, 127594);
              return;
              x.this.bix();
              x.this.qrG = true;
              continue;
              x.this.bix();
              x.this.qrG = true;
              x.this.qrq = true;
            }
          }
        });
        this.qrd.qCZ = new OfflineVideoView.a()
        {
          public final boolean a(PString paramAnonymousPString)
          {
            GMTrace.i(17836864962560L, 132895);
            String str1 = x.this.bjl().qnh;
            String str2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.dA("adId", str1);
            if (FileOp.aZ(str2))
            {
              paramAnonymousPString.value = str2;
              x.this.qrD = true;
              GMTrace.o(17836864962560L, 132895);
              return true;
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", str1, false, 62, new d.b()
            {
              public final void Hr(String paramAnonymous2String)
              {
                GMTrace.i(17127390052352L, 127609);
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "video download fail %s", new Object[] { paramAnonymous2String });
                x.this.qrE = true;
                GMTrace.o(17127390052352L, 127609);
              }
              
              public final void Hs(String paramAnonymous2String)
              {
                GMTrace.i(17127524270080L, 127610);
                com.tencent.mm.sdk.platformtools.w.v("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "video view height " + x.this.iiK.getHeight() + ", player height " + x.this.qrd.getHeight());
                x.this.qrE = false;
                x.this.iVt = paramAnonymous2String;
                if (x.this.qre.fBB)
                {
                  x.this.qrd.xC(paramAnonymous2String);
                  x.this.qrD = true;
                }
                GMTrace.o(17127524270080L, 127610);
              }
            });
            GMTrace.o(17836864962560L, 132895);
            return false;
          }
          
          public final void onStart(int paramAnonymousInt)
          {
            boolean bool = false;
            GMTrace.i(17129000665088L, 127621);
            x.this.qrj = true;
            x.this.qrg = paramAnonymousInt;
            if (x.this.qre.pCe != paramAnonymousInt) {
              x.this.qre.tI(x.this.qrg);
            }
            x.this.qre.setVisibility(0);
            x.this.qrr.setVisibility(0);
            if (x.this.qrc != null)
            {
              localObject = x.this.qrc;
              if (x.this.qre.getVisibility() == 0) {
                bool = true;
              }
              ((aa)localObject).hU(bool);
            }
            Object localObject = x.this;
            if ((((x)localObject).qrd != null) && (((x)localObject).qre != null) && (Math.abs(((x)localObject).qrd.getCurrentPosition() - ((x)localObject).qre.jR) > 1)) {
              ((x)localObject).qrd.B(((x)localObject).qre.jR, true);
            }
            GMTrace.o(17129000665088L, 127621);
          }
          
          public final void qq()
          {
            boolean bool = false;
            GMTrace.i(17128866447360L, 127620);
            Object localObject = x.this;
            ((x)localObject).qrn += 1;
            x.this.qre.setVisibility(0);
            x.this.qrr.setVisibility(0);
            x.this.ocG.setVisibility(0);
            if (x.this.qrc != null)
            {
              localObject = x.this.qrc;
              if (x.this.qre.getVisibility() == 0) {
                bool = true;
              }
              ((aa)localObject).hU(bool);
            }
            x.this.ham.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17126047875072L, 127599);
                x.this.qrd.B(0, false);
                x.this.qre.cr(false);
                x.this.qre.seek(0);
                GMTrace.o(17126047875072L, 127599);
              }
            });
            if (x.this.oed != 0L)
            {
              x.this.qrl = ((int)(x.this.qrl + (System.currentTimeMillis() - x.this.oed)));
              x.this.oed = 0L;
            }
            x.this.qrv = 5;
            GMTrace.o(17128866447360L, 127620);
          }
          
          public final void uu(final int paramAnonymousInt)
          {
            GMTrace.i(17129134882816L, 127622);
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17098399023104L, 127393);
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "play time " + paramAnonymousInt + " video time " + x.this.qrg);
                if (x.this.qre.pCe != x.this.qrg) {
                  x.this.qre.tI(x.this.qrg);
                }
                x.this.qre.seek(paramAnonymousInt);
                x.this.qre.cr(x.this.qrd.isPlaying());
                if (x.this.qrd.isPlaying()) {
                  x.this.qrj = true;
                }
                GMTrace.o(17098399023104L, 127393);
              }
            });
            GMTrace.o(17129134882816L, 127622);
          }
        };
        this.qre.setVisibility(4);
        this.qrr.setVisibility(8);
        this.ocG.setVisibility(4);
        if (this.qrc != null)
        {
          localObject1 = this.qrc;
          if (this.qre.getVisibility() != 0) {
            break label1090;
          }
        }
      }
    }
    label1053:
    label1085:
    label1090:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((aa)localObject1).hU(bool1);
      this.qrd.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          boolean bool = true;
          GMTrace.i(17127926923264L, 127613);
          if (x.this.qrj)
          {
            x.this.qrx = true;
            if (x.this.qre.getVisibility() != 0) {
              break label122;
            }
            x.this.qre.setVisibility(4);
            x.this.qrr.setVisibility(8);
            x.this.ocG.setVisibility(4);
            if (x.this.qrc != null)
            {
              paramAnonymousView = x.this.qrc;
              if (x.this.qre.getVisibility() != 0) {
                break label158;
              }
            }
          }
          for (;;)
          {
            paramAnonymousView.hU(bool);
            GMTrace.o(17127926923264L, 127613);
            return;
            label122:
            x.this.qre.setVisibility(0);
            x.this.qrr.setVisibility(0);
            x.this.ocG.setVisibility(0);
            break;
            label158:
            bool = false;
          }
        }
      });
      this.qrf = ((ProgressBar)localView.findViewById(i.f.cle));
      this.qrf.setVisibility(8);
      localView = this.iiK;
      GMTrace.o(8249021562880L, 61460);
      return localView;
      ((ViewGroup)localObject1).setLayoutParams(new RelativeLayout.LayoutParams(this.kic, this.kid));
      localView.setLayoutParams(new RelativeLayout.LayoutParams(this.kic, this.kid));
      localView.setMinimumHeight(this.kid);
      break;
      i = this.kid;
      localObject2 = new RelativeLayout.LayoutParams(this.kic, i);
      localView.setPadding((int)((t)this.qpH).qns, (int)((t)this.qpH).qnq, (int)((t)this.qpH).qnt, (int)((t)this.qpH).qnr);
      ((ViewGroup)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localView.setMinimumHeight(i);
      break;
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", ((t)this.qpH).qnM, false, 1000000001, 0, new d.a()
      {
        public final void Hp(String paramAnonymousString)
        {
          GMTrace.i(17131282366464L, 127638);
          x.this.qrd.Ih(paramAnonymousString);
          GMTrace.o(17131282366464L, 127638);
        }
        
        public final void biT()
        {
          GMTrace.i(17131013931008L, 127636);
          GMTrace.o(17131013931008L, 127636);
        }
        
        public final void biU()
        {
          GMTrace.i(17131148148736L, 127637);
          GMTrace.o(17131148148736L, 127637);
        }
      });
      break label328;
      bool1 = false;
      break label544;
    }
  }
  
  protected final void biR()
  {
    GMTrace.i(8250497957888L, 61471);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", getClass().getName() + "not support update now");
    GMTrace.o(8250497957888L, 61471);
  }
  
  public final void bit()
  {
    GMTrace.i(8249424216064L, 61463);
    super.bit();
    this.qrr.setImageDrawable(com.tencent.mm.bq.a.b(this.context, i.e.pGT));
    this.qrd.ck(true);
    this.qrt = true;
    GMTrace.o(8249424216064L, 61463);
  }
  
  public final void biu()
  {
    GMTrace.i(8250095304704L, 61468);
    super.biu();
    this.qrd.onDestroy();
    GMTrace.o(8250095304704L, 61468);
  }
  
  public final void biv()
  {
    GMTrace.i(8249826869248L, 61466);
    super.biv();
    GMTrace.o(8249826869248L, 61466);
  }
  
  public final void biw()
  {
    GMTrace.i(8249961086976L, 61467);
    super.biw();
    bjj();
    this.qrG = false;
    if ((!this.qry) && (!this.qrz))
    {
      GMTrace.o(8249961086976L, 61467);
      return;
    }
    this.qrz = false;
    this.qry = false;
    if (this.qrv == 1) {
      this.qrv = 2;
    }
    GMTrace.o(8249961086976L, 61467);
  }
  
  public final void bix()
  {
    GMTrace.i(8249558433792L, 61464);
    super.bix();
    this.qrr.setImageDrawable(com.tencent.mm.bq.a.b(this.context, i.e.pGU));
    this.qrd.ck(false);
    this.qrt = false;
    GMTrace.o(8249558433792L, 61464);
  }
  
  public final void bjj()
  {
    GMTrace.i(8249289998336L, 61462);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "pause play");
    if (!this.qri) {
      this.qrh.setVisibility(0);
    }
    this.ham.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8233183870976L, 61342);
        x.this.qrd.blT();
        x.this.qre.cr(false);
        GMTrace.o(8233183870976L, 61342);
      }
    });
    if (this.oed != 0L)
    {
      this.qrl = ((int)(this.qrl + (System.currentTimeMillis() - this.oed)));
      this.oed = 0L;
    }
    GMTrace.o(8249289998336L, 61462);
  }
  
  public final int bjk()
  {
    GMTrace.i(17125511004160L, 127595);
    if (this.qre.getVisibility() == 0)
    {
      int[] arrayOfInt = new int[2];
      this.qre.getLocationOnScreen(arrayOfInt);
      int i = this.kid;
      int j = arrayOfInt[1];
      int k = this.qre.getHeight();
      GMTrace.o(17125511004160L, 127595);
      return i - j - (k >>> 1);
    }
    GMTrace.o(17125511004160L, 127595);
    return -1;
  }
  
  public final t bjl()
  {
    GMTrace.i(16043179245568L, 119531);
    t localt = (t)this.qpH;
    GMTrace.o(16043179245568L, 119531);
    return localt;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */