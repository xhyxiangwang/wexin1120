package com.tencent.mm.plugin.voip_cs.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.brandservice.a.j;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.k.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.ui.VoipBigIconButton;
import com.tencent.mm.plugin.voip.video.MovableVideoView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.plugin.voip.video.f;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Timer;
import java.util.TimerTask;

public final class b
  implements TextureView.SurfaceTextureListener, View.OnClickListener, k.a, f
{
  protected static int mScreenHeight;
  protected static int mScreenWidth;
  protected static final int[] rtF;
  public boolean fBD;
  public ae ham;
  public TextView kGW;
  public TextView kfQ;
  private Timer lZZ;
  public ImageButton obY;
  public ObservableTextureView ocA;
  private View ocp;
  public com.tencent.mm.plugin.voip.video.a ocy;
  public RelativeLayout rAA;
  public TextView rAB;
  public TextView rAC;
  public TextView rAD;
  private TextView rAE;
  public ImageView rAF;
  public ae rAG;
  private boolean rAH;
  protected long rAI;
  private boolean rAJ;
  private boolean rAK;
  public int rAL;
  public int rAM;
  public com.tencent.mm.plugin.voip_cs.c.a rAN;
  public String rAO;
  public String rAP;
  public aj rAQ;
  public aj rAR;
  a rAS;
  c rAT;
  b rAU;
  String rAV;
  Drawable rAW;
  public VoipCSMainUI rAz;
  public boolean ruO;
  private OpenGlView rua;
  public OpenGlView rub;
  public OpenGlRender ruc;
  public OpenGlRender rud;
  public VoipBigIconButton rux;
  private View.OnClickListener rvg;
  
  static
  {
    GMTrace.i(11271067926528L, 83976);
    rtF = new int[] { -1, R.l.eQB, R.l.eQG, R.l.eQF };
    GMTrace.o(11271067926528L, 83976);
  }
  
  public b(VoipCSMainUI paramVoipCSMainUI)
  {
    GMTrace.i(11264491257856L, 83927);
    this.ruO = false;
    this.fBD = false;
    this.rAH = false;
    this.rAI = -1L;
    this.rAJ = false;
    this.rAK = false;
    this.rAL = 60000;
    this.rAM = 5000;
    this.rAN = new com.tencent.mm.plugin.voip_cs.c.a();
    this.rAO = "";
    this.rAP = "";
    this.rAQ = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(11260867379200L, 83900);
        w.i("MicroMsg.voipcs.VoipCSViewManager", "voipcs invite time out!opposite not responese");
        com.tencent.mm.plugin.voip_cs.b.b.buy().aHe = 1;
        b.this.wr(6);
        GMTrace.o(11260867379200L, 83900);
        return true;
      }
    }, false);
    this.rAR = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(11259793637376L, 83892);
        b.this.rAC.setText(ab.getContext().getString(R.l.eQI));
        b.this.rAD.setVisibility(0);
        com.tencent.mm.plugin.voip_cs.c.a locala = b.this.rAN;
        TextView localTextView = b.this.rAD;
        Object localObject = b.rtF;
        if ((localObject == null) || (localTextView == null)) {
          w.e("MicroMsg.DynamicTextWrap", "textList or tv is null");
        }
        for (;;)
        {
          GMTrace.o(11259793637376L, 83892);
          return true;
          locala.btF();
          locala.rtR = 0;
          locala.rtP = ((int[])localObject);
          locala.jW = localTextView;
          locala.rtQ = 500;
          if (locala.ilg != null)
          {
            localObject = locala.ilg;
            long l = locala.rtQ;
            ((aj)localObject).w(l, l);
          }
          w.j("MicroMsg.DynamicTextWrap", "start textview:" + localTextView, new Object[0]);
        }
      }
    }, false);
    this.rvg = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11261941121024L, 83908);
        w.i("MicroMsg.voipcs.VoipCSViewManager", "switch camera");
        b.this.rux.setEnabled(false);
        if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr > 1) {
          b.this.buJ();
        }
        b.this.rux.setEnabled(true);
        if (b.this.ocy != null) {
          b.this.ocy.btX();
        }
        GMTrace.o(11261941121024L, 83908);
      }
    };
    this.rAS = new a();
    this.rAV = "";
    this.rAW = null;
    this.rAz = paramVoipCSMainUI;
    Object localObject = (WindowManager)paramVoipCSMainUI.getSystemService("window");
    int i = ((WindowManager)localObject).getDefaultDisplay().getHeight() / 5;
    int j = ((WindowManager)localObject).getDefaultDisplay().getWidth() * i / ((WindowManager)localObject).getDefaultDisplay().getHeight();
    if (Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
      ((RelativeLayout)paramVoipCSMainUI.findViewById(R.h.crS)).setPadding(0, 0, 0, BackwardSupportUtil.b.a(paramVoipCSMainUI.vov.voR, 40.0F));
    }
    this.rub = new MovableVideoView(paramVoipCSMainUI.getApplicationContext());
    ((MovableVideoView)this.rub).dp(j, i);
    this.rub.setVisibility(8);
    this.ruc = new OpenGlRender(this.rub, OpenGlRender.rxL);
    this.rub.a(this.ruc);
    this.rub.setRenderMode(0);
    if (Build.MODEL.equals("Nexus 6"))
    {
      this.rub.setZOrderOnTop(true);
      this.kGW = ((TextView)paramVoipCSMainUI.findViewById(R.h.cAQ));
      this.kGW.setVisibility(0);
      this.lZZ = new Timer("voip_cs_talking_time");
      this.rAB = ((TextView)paramVoipCSMainUI.findViewById(R.h.cGt));
      this.rAB.setVisibility(0);
      this.rAC = ((TextView)paramVoipCSMainUI.findViewById(R.h.cGy));
      if (!paramVoipCSMainUI.fQe.equals("1")) {
        break label1037;
      }
      if (!paramVoipCSMainUI.type.equals("video")) {
        break label1018;
      }
      this.rAC.setText(ab.getContext().getString(R.l.eQk));
      label461:
      this.rAC.setVisibility(0);
      this.kfQ = ((TextView)paramVoipCSMainUI.findViewById(R.h.cGA));
      this.kfQ.setVisibility(0);
      this.rAF = ((ImageView)paramVoipCSMainUI.findViewById(R.h.cGu));
      this.rAF.setVisibility(0);
      this.rAE = ((TextView)paramVoipCSMainUI.findViewById(R.h.cGx));
      this.rAD = ((TextView)paramVoipCSMainUI.findViewById(R.h.cGz));
      this.rux = ((VoipBigIconButton)paramVoipCSMainUI.findViewById(R.h.cGv));
      if ((paramVoipCSMainUI.rBf == null) || (!paramVoipCSMainUI.rBf.equals("1"))) {
        break label1088;
      }
      this.rux.setVisibility(0);
      this.rux.setOnClickListener(this.rvg);
      label594:
      this.ham = new ae();
      this.rAG = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(11260062072832L, 83894);
          switch (paramAnonymousMessage.what)
          {
          }
          for (;;)
          {
            GMTrace.o(11260062072832L, 83894);
            return;
            if (b.this.rAW != null)
            {
              b.this.rAF.setImageDrawable(b.this.rAW);
              GMTrace.o(11260062072832L, 83894);
              return;
            }
            b.this.rAF.setImageResource(R.g.aYg);
          }
        }
      };
      this.ocp = paramVoipCSMainUI.findViewById(R.h.cGr);
      this.obY = ((ImageButton)paramVoipCSMainUI.findViewById(R.h.cGw));
      this.rAA = ((RelativeLayout)paramVoipCSMainUI.findViewById(R.h.cGr));
      mScreenWidth = com.tencent.mm.bq.a.ef(paramVoipCSMainUI.vov.voR);
      mScreenHeight = com.tencent.mm.plugin.voip_cs.c.b.jdMethod_do(paramVoipCSMainUI.vov.voR);
      this.rua = ((OpenGlView)paramVoipCSMainUI.findViewById(R.h.cGs));
      this.rua.dq(mScreenWidth, mScreenHeight);
      this.rud = new OpenGlRender(this.rua, OpenGlRender.rxK);
      this.rua.a(this.rud);
      this.rua.setRenderMode(0);
      this.rua.setVisibility(0);
      w.i("MicroMsg.voipcs.VoipCSViewManager", "mScreenHeight %d", new Object[] { Integer.valueOf(mScreenHeight) });
      this.obY.setOnClickListener(this);
      this.rAA.addView(this.rub);
      this.rub.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11260598943744L, 83898);
          paramAnonymousView = b.this;
          if (!b.this.ruO) {}
          for (boolean bool = true;; bool = false)
          {
            paramAnonymousView.ruO = bool;
            paramAnonymousView = b.this.iB(b.this.ruO);
            b.this.rub.dr(paramAnonymousView.x, paramAnonymousView.y);
            GMTrace.o(11260598943744L, 83898);
            return;
          }
        }
      });
      this.ruc.rxr = true;
      this.rud.rxr = true;
      if (!com.tencent.mm.plugin.voip.b.d.dj(ab.getContext())) {
        com.tencent.mm.plugin.voip.b.d.dk(ab.getContext());
      }
      paramVoipCSMainUI = ab.bNb();
      this.rAO = paramVoipCSMainUI.getString(buG(), "");
      if ((this.rAz.iVM == null) || (this.rAz.iVM.equals(""))) {
        break label1100;
      }
      Jd(this.rAz.iVM);
    }
    for (;;)
    {
      this.rAP = paramVoipCSMainUI.getString(buH(), "");
      if (!com.tencent.pb.common.c.h.isNullOrEmpty(this.rAP)) {
        Jc(this.rAP);
      }
      paramVoipCSMainUI = com.tencent.mm.plugin.voip_cs.b.b.bux();
      localObject = this.rAz.rAs;
      w.d("MicroMsg.voipcs.VoipCSService", "start getBizInfo for username:" + (String)localObject);
      ap.wT().a(455, paramVoipCSMainUI);
      paramVoipCSMainUI = new j((String)localObject);
      ap.wT().a(paramVoipCSMainUI, 0);
      GMTrace.o(11264491257856L, 83927);
      return;
      this.rub.setZOrderMediaOverlay(true);
      break;
      label1018:
      this.rAC.setText(ab.getContext().getString(R.l.eQl));
      break label461;
      label1037:
      if (paramVoipCSMainUI.type.equals("video"))
      {
        this.rAC.setText(ab.getContext().getString(R.l.eQm));
        break label461;
      }
      this.rAC.setText(ab.getContext().getString(R.l.eQl));
      break label461;
      label1088:
      this.rux.setVisibility(8);
      break label594;
      label1100:
      if (!com.tencent.pb.common.c.h.isNullOrEmpty(this.rAO)) {
        Jd(this.rAO);
      }
    }
  }
  
  public static Drawable Je(String paramString)
  {
    GMTrace.i(11266236088320L, 83940);
    try
    {
      paramString = Drawable.createFromStream((InputStream)new URL(paramString).getContent(), "urlDrawable");
      GMTrace.o(11266236088320L, 83940);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.voipcs.VoipCSViewManager", "parse Drawable faill!");
      GMTrace.o(11266236088320L, 83940);
    }
    return null;
  }
  
  protected static String av(long paramLong)
  {
    GMTrace.i(11266370306048L, 83941);
    String str = String.format("%02d:%02d", new Object[] { Long.valueOf(paramLong / 60L), Long.valueOf(paramLong % 60L) });
    GMTrace.o(11266370306048L, 83941);
    return str;
  }
  
  private static float iy(boolean paramBoolean)
  {
    GMTrace.i(11265296564224L, 83933);
    float f1 = 0.74766356F;
    float f2;
    if (paramBoolean) {
      f2 = f1;
    }
    for (;;)
    {
      try
      {
        localObject = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.field_capInfo;
        f2 = f1;
        if (localObject != null)
        {
          f2 = f1;
          localObject = ByteBuffer.wrap((byte[])localObject);
          f2 = f1;
          if (((ByteBuffer)localObject).getInt() > 65535)
          {
            f2 = f1;
            ((ByteBuffer)localObject).order(ByteOrder.LITTLE_ENDIAN);
          }
          f2 = f1;
          ((ByteBuffer)localObject).getShort();
          f2 = f1;
          ((ByteBuffer)localObject).getShort();
          f2 = f1;
          float f3 = ((ByteBuffer)localObject).getInt() / 100.0F;
          if (f3 != 0.0F) {
            f1 = f3;
          }
          f2 = f1;
          w.d("MicroMsg.voipcs.VoipCSViewManager", "use rate: %s, changed: %s", new Object[] { Float.valueOf(f1), Boolean.valueOf(paramBoolean) });
          f2 = f1;
        }
      }
      catch (Exception localException)
      {
        Object localObject;
        w.e("MicroMsg.voipcs.VoipCSViewManager", "update failed: " + localException.getMessage());
        continue;
      }
      GMTrace.o(11265296564224L, 83933);
      return f2;
      f2 = f1;
      localObject = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rrM;
    }
  }
  
  private static int ws(int paramInt)
  {
    GMTrace.i(11266638741504L, 83943);
    if (paramInt == 1)
    {
      paramInt = R.l.eQj;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (paramInt == 0)
    {
      paramInt = R.l.eQo;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if ((paramInt == -1) || (paramInt == 5))
    {
      paramInt = R.l.eQz;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if ((paramInt == 403) || (paramInt == 404))
    {
      paramInt = R.l.eQH;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (paramInt == 6)
    {
      paramInt = R.l.eQC;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (paramInt == 1001)
    {
      paramInt = R.l.eQy;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (paramInt == 10)
    {
      paramInt = R.l.eQn;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr < 2)
    {
      paramInt = R.l.eQi;
      GMTrace.o(11266638741504L, 83943);
      return paramInt;
    }
    paramInt = R.l.eQo;
    GMTrace.o(11266638741504L, 83943);
    return paramInt;
  }
  
  public final void Jc(String paramString)
  {
    GMTrace.i(11264625475584L, 83928);
    if (this.rAz.rBi) {}
    for (paramString = paramString + ab.getContext().getString(R.l.eQe);; paramString = paramString + ab.getContext().getString(R.l.eQf))
    {
      this.kfQ.setText(paramString);
      GMTrace.o(11264625475584L, 83928);
      return;
    }
  }
  
  public final void Jd(String paramString)
  {
    GMTrace.i(11264759693312L, 83929);
    if (!com.tencent.pb.common.c.h.isNullOrEmpty(paramString))
    {
      this.rAU = new b();
      if ((this.rAz.iVM == null) || (this.rAz.iVM.equals(""))) {
        break label86;
      }
    }
    label86:
    for (this.rAV = this.rAz.iVM;; this.rAV = paramString)
    {
      e.b(this.rAU, "VOIPCS_netPic", 10);
      GMTrace.o(11264759693312L, 83929);
      return;
    }
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11267041394688L, 83946);
    w.d("MicroMsg.voipcs.VoipCSViewManager", "receive frame data , isPause : " + this.fBD);
    if (this.fBD)
    {
      GMTrace.o(11267041394688L, 83946);
      return;
    }
    if (this.rAS.oaK == null)
    {
      this.rAS.w = paramInt1;
      this.rAS.h = paramInt2;
      this.rAS.oaK = new int[this.rAS.w * this.rAS.h];
    }
    int i;
    if (this.ocy.bub())
    {
      i = OpenGlRender.rxJ;
      if (!this.ocy.buc()) {
        break label290;
      }
    }
    label290:
    for (int j = OpenGlRender.rxI;; j = OpenGlRender.rxH)
    {
      if (this.rAJ)
      {
        int k = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.videoEncodeToSend(paramArrayOfByte, paramArrayOfByte.length, paramInt1, paramInt2, paramInt3);
        w.d("MicroMsg.voipcs.VoipCSViewManager", "videoEncodeToSend , ret = " + k);
        v2protocal localv2protocal = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp;
        localv2protocal.rsV += 1;
      }
      com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.videoEncodeToLocal(paramArrayOfByte, (int)paramLong, paramInt1, paramInt2, paramInt3, 75, this.rAS.oaK);
      if (OpenGlRender.rxW != 1) {
        break label335;
      }
      if (!this.ruO) {
        break label298;
      }
      this.ruc.a(this.rAS.oaK, paramInt1, paramInt2, OpenGlRender.rxC + i + j);
      GMTrace.o(11267041394688L, 83946);
      return;
      i = 0;
      break;
    }
    label298:
    this.rud.a(this.rAS.oaK, paramInt1, paramInt2, OpenGlRender.rxC + i + j);
    GMTrace.o(11267041394688L, 83946);
    return;
    label335:
    if (OpenGlRender.rxW == 2)
    {
      if (this.ruO)
      {
        this.ruc.b(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.rxG + i + j);
        GMTrace.o(11267041394688L, 83946);
        return;
      }
      this.rud.b(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.rxG + i + j);
    }
    GMTrace.o(11267041394688L, 83946);
  }
  
  public final void aGI()
  {
    GMTrace.i(11266101870592L, 83939);
    this.rAQ.MM();
    this.rAR.MM();
    this.rAN.btF();
    this.rAD.setVisibility(8);
    this.rAC.setText(R.l.eQE);
    this.rAB.setText(R.l.eQs);
    wq(0);
    this.ocp.setOnClickListener(this);
    if ((this.rAz.rBg != null) && (this.rAz.rBg.equals("1")))
    {
      this.rub.setVisibility(0);
      this.ruO = true;
      localObject = iB(this.ruO);
      ((MovableVideoView)this.rub).dp(((Point)localObject).x, ((Point)localObject).y);
      buK();
    }
    buJ();
    this.rAJ = true;
    if (this.lZZ == null) {
      this.lZZ = new Timer("voip_cs_talking_time");
    }
    if (this.rAH)
    {
      GMTrace.o(11266101870592L, 83939);
      return;
    }
    if (this.rAI == -1L) {
      this.rAI = bg.Po();
    }
    this.rAH = true;
    Object localObject = new TimerTask()
    {
      public final void run()
      {
        GMTrace.i(11263820169216L, 83922);
        b.this.ham.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11259525201920L, 83890);
            String str = b.av(bg.aE(b.this.rAI));
            b.this.kGW.setText(str);
            GMTrace.o(11259525201920L, 83890);
          }
        });
        GMTrace.o(11263820169216L, 83922);
      }
    };
    this.lZZ.schedule((TimerTask)localObject, 1000L, 1000L);
    k.bsI().bsJ();
    k.bsI().rqn = this;
    GMTrace.o(11266101870592L, 83939);
  }
  
  public final void aGJ()
  {
    GMTrace.i(11266772959232L, 83944);
    this.rAE.setVisibility(0);
    this.rAE.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    this.rAE.setBackgroundResource(R.g.beU);
    this.rAE.setCompoundDrawables(null, null, null, null);
    this.rAE.setCompoundDrawablePadding(0);
    this.rAE.setText(ws(1001));
    GMTrace.o(11266772959232L, 83944);
  }
  
  public final void aGK()
  {
    GMTrace.i(11266907176960L, 83945);
    this.rAE.setVisibility(8);
    GMTrace.o(11266907176960L, 83945);
  }
  
  public final void aQN()
  {
    GMTrace.i(11267175612416L, 83947);
    w.e("MicroMsg.voipcs.VoipCSViewManager", "init camera fail！");
    GMTrace.o(11267175612416L, 83947);
  }
  
  public final String buG()
  {
    GMTrace.i(11264893911040L, 83930);
    String str = "voip_cs_headImageUrl_" + this.rAz.rAs;
    GMTrace.o(11264893911040L, 83930);
    return str;
  }
  
  public final String buH()
  {
    GMTrace.i(11265028128768L, 83931);
    String str = "voip_cs_nickname_" + this.rAz.rAs;
    GMTrace.o(11265028128768L, 83931);
    return str;
  }
  
  public final void buI()
  {
    GMTrace.i(11265699217408L, 83936);
    w.i("MicroMsg.voipcs.VoipCSViewManager", "stop capture render");
    if (this.ocA != null)
    {
      this.rAA.removeView(this.ocA);
      this.ocA = null;
    }
    if (this.ocy != null)
    {
      this.ocy.btZ();
      com.tencent.mm.plugin.voip.video.a.bua();
      this.ocy = null;
    }
    GMTrace.o(11265699217408L, 83936);
  }
  
  public final void buJ()
  {
    GMTrace.i(11265833435136L, 83937);
    w.i("MicroMsg.voipcs.VoipCSViewManager", "trigger dismiss button");
    this.ham.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11262209556480L, 83910);
        w.i("MicroMsg.voipcs.VoipCSViewManager", "dismiss button");
        if (b.this.rAz.isFinishing())
        {
          GMTrace.o(11262209556480L, 83910);
          return;
        }
        b.this.obY.setVisibility(8);
        b.this.kGW.setVisibility(8);
        b.this.rAB.setVisibility(8);
        b.this.wq(8);
        b.this.iA(false);
        GMTrace.o(11262209556480L, 83910);
      }
    }, 10000L);
    GMTrace.o(11265833435136L, 83937);
  }
  
  public final void buK()
  {
    GMTrace.i(11267309830144L, 83948);
    buL();
    this.rAT = new c();
    e.b(this.rAT, "VOIPCS_VideoDecode", 10);
    w.d("MicroMsg.voipcs.VoipCSViewManager", "start video decode thread..");
    GMTrace.o(11267309830144L, 83948);
  }
  
  public final void buL()
  {
    GMTrace.i(11267444047872L, 83949);
    if (this.rAT != null)
    {
      w.d("MicroMsg.voipcs.VoipCSViewManager", "stop videodecode thread...");
      this.rAT.rov = true;
      e.remove(this.rAT);
      this.rAT = null;
    }
    GMTrace.o(11267444047872L, 83949);
  }
  
  public final void iA(boolean paramBoolean)
  {
    GMTrace.i(11265967652864L, 83938);
    if (Build.MANUFACTURER.equalsIgnoreCase("sony"))
    {
      w.i("MicroMsg.voipcs.VoipCSViewManager", "sony is not compatible,so we return.");
      GMTrace.o(11265967652864L, 83938);
      return;
    }
    if (!paramBoolean)
    {
      this.rAz.getWindow().setFlags(1024, 1024);
      GMTrace.o(11265967652864L, 83938);
      return;
    }
    this.rAz.getWindow().clearFlags(1024);
    GMTrace.o(11265967652864L, 83938);
  }
  
  public final Point iB(boolean paramBoolean)
  {
    GMTrace.i(11265162346496L, 83932);
    int i = ((WindowManager)this.rAz.getSystemService("window")).getDefaultDisplay().getHeight() / 5;
    float f = i;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Point localPoint = new Point((int)(iy(paramBoolean) * f), i);
      GMTrace.o(11265162346496L, 83932);
      return localPoint;
    }
  }
  
  public final void onClick(View paramView)
  {
    boolean bool = false;
    GMTrace.i(11265430781952L, 83934);
    if (paramView.getId() == R.h.cGw)
    {
      if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr < 2) {}
      for (com.tencent.mm.plugin.voip_cs.b.b.buy().aHe = 2;; com.tencent.mm.plugin.voip_cs.b.b.buy().aHe = 4)
      {
        paramView = com.tencent.mm.plugin.voip_cs.b.b.buy();
        paramView.rzu = 1;
        paramView.rzR = 1;
        paramView.rzv = ((int)(System.currentTimeMillis() / 1000L));
        paramView = com.tencent.mm.plugin.voip_cs.b.b.buy();
        w.d("MicroMsg.VoipCSReportHelper", "selfCancel");
        if (paramView.rzO == 0)
        {
          paramView.rzJ = 3;
          if ((paramView.rzS == 0L) && (paramView.rAe != 0)) {
            paramView.rzS = ((int)(System.currentTimeMillis() / 1000L) - paramView.rAe);
          }
        }
        com.tencent.mm.plugin.voip_cs.b.b.buy().buz();
        w.d("MicroMsg.voipcs.VoipCSViewManager", "user click hangup button!");
        wr(0);
        GMTrace.o(11265430781952L, 83934);
        return;
      }
    }
    if (this.obY.getVisibility() == 0) {}
    for (int i = 8;; i = 0)
    {
      this.obY.setVisibility(i);
      this.kGW.setVisibility(i);
      this.rAB.setVisibility(i);
      wq(i);
      if (i == 0) {
        bool = true;
      }
      iA(bool);
      GMTrace.o(11265430781952L, 83934);
      return;
    }
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(11267578265600L, 83950);
    GMTrace.o(11267578265600L, 83950);
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(11267846701056L, 83952);
    GMTrace.o(11267846701056L, 83952);
    return false;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(11267712483328L, 83951);
    GMTrace.o(11267712483328L, 83951);
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(11267980918784L, 83953);
    GMTrace.o(11267980918784L, 83953);
  }
  
  public final void wq(int paramInt)
  {
    GMTrace.i(11265564999680L, 83935);
    if ((this.rAz.rBf != null) && (this.rAz.rBf.equals("1")))
    {
      this.rux.setVisibility(paramInt);
      GMTrace.o(11265564999680L, 83935);
      return;
    }
    this.rux.setVisibility(8);
    GMTrace.o(11265564999680L, 83935);
  }
  
  public final void wr(int paramInt)
  {
    GMTrace.i(11266504523776L, 83942);
    w.i("MicroMsg.voipcs.VoipCSViewManager", "onFinish for action:" + paramInt);
    if (this.lZZ != null)
    {
      this.lZZ.cancel();
      this.lZZ = null;
    }
    if (!this.rAQ.bNt()) {
      this.rAQ.MM();
    }
    if (!this.rAR.bNt()) {
      this.rAR.MM();
    }
    this.rAN.btF();
    this.rAH = false;
    this.rAE.setVisibility(0);
    this.rAE.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    this.rAE.setBackgroundResource(R.g.beU);
    this.rAE.setCompoundDrawables(null, null, null, null);
    this.rAE.setCompoundDrawablePadding(0);
    this.rAE.setText(ws(paramInt));
    if (com.tencent.mm.plugin.voip_cs.b.b.bux().rAr == 2) {
      e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11264357040128L, 83926);
          a locala = a.buE();
          if (locala.rqS != null) {
            locala.rqS.d(R.k.dqe, false, 0);
          }
          GMTrace.o(11264357040128L, 83926);
        }
      }, "VoipCS_play_end_sound");
    }
    this.ham.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11260330508288L, 83896);
        b.this.rAz.finish();
        GMTrace.o(11260330508288L, 83896);
      }
    }, 2000L);
    GMTrace.o(11266504523776L, 83942);
  }
  
  private final class a
  {
    public int h;
    public int[] oaK;
    public int w;
    
    public a()
    {
      GMTrace.i(11263954386944L, 83923);
      GMTrace.o(11263954386944L, 83923);
    }
  }
  
  final class b
    implements Runnable
  {
    b()
    {
      GMTrace.i(11262343774208L, 83911);
      GMTrace.o(11262343774208L, 83911);
    }
    
    public final void run()
    {
      GMTrace.i(11262477991936L, 83912);
      b.this.rAW = b.Je(b.this.rAV);
      Message localMessage = new Message();
      localMessage.what = 12;
      b.this.rAG.sendMessage(localMessage);
      e.remove(b.this.rAU);
      GMTrace.o(11262477991936L, 83912);
    }
  }
  
  final class c
    implements Runnable
  {
    boolean rov;
    
    c()
    {
      GMTrace.i(11262612209664L, 83913);
      this.rov = false;
      GMTrace.o(11262612209664L, 83913);
    }
    
    public final void run()
    {
      GMTrace.i(11262746427392L, 83914);
      if ((!this.rov) && (!b.this.fBD))
      {
        int i;
        int j;
        if (com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.videoDecode(com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rsC) == 1)
        {
          i = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.field_remoteImgWidth;
          j = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.field_remoteImgHeight;
          if (OpenGlRender.rxW != 1) {
            break label168;
          }
          if (!b.this.ruO) {
            break label137;
          }
          b.this.rud.a(com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rsC, i, j, OpenGlRender.rxB + OpenGlRender.rxH);
        }
        for (;;)
        {
          try
          {
            Thread.sleep(20L);
          }
          catch (InterruptedException localInterruptedException)
          {
            w.printErrStackTrace("MicroMsg.voipcs.VoipCSViewManager", localInterruptedException, "", new Object[0]);
          }
          break;
          label137:
          b.this.ruc.a(com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rsC, i, j, OpenGlRender.rxB + OpenGlRender.rxH);
          continue;
          label168:
          if (b.this.ruO) {
            b.this.rud.a(com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rsC, i, j, OpenGlRender.rxE + OpenGlRender.rxH);
          } else {
            b.this.ruc.a(com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.rsC, i, j, OpenGlRender.rxE + OpenGlRender.rxH);
          }
        }
      }
      GMTrace.o(11262746427392L, 83914);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */