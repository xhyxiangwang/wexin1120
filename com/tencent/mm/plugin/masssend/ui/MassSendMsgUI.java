package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.c.a;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.mmsight.model.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.protocal.c.amj;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MassSendMsgUI
  extends MMActivity
  implements com.tencent.mm.ac.e
{
  private static String nHo;
  private String filePath;
  private q ikZ;
  private ChatFooter nGF;
  private String nGH;
  private List<String> nGI;
  private boolean nGJ;
  private TextView nHn;
  private com.tencent.mm.ui.base.i nHp;
  private b nHq;
  private AppPanel.a nHr;
  private TextView neY;
  
  static
  {
    GMTrace.i(11224762810368L, 83631);
    nHo = "";
    GMTrace.o(11224762810368L, 83631);
  }
  
  public MassSendMsgUI()
  {
    GMTrace.i(11220602060800L, 83600);
    this.ikZ = null;
    this.nGJ = false;
    this.nHr = new AppPanel.a()
    {
      public final void aMI()
      {
        GMTrace.i(11225299681280L, 83635);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.eoL), 0).show();
        GMTrace.o(11225299681280L, 83635);
      }
      
      public final void aMJ()
      {
        GMTrace.i(11225433899008L, 83636);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.eoz), 0).show();
        GMTrace.o(11225433899008L, 83636);
      }
      
      public final void aMK()
      {
        GMTrace.i(11225568116736L, 83637);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.eoJ), 0).show();
        GMTrace.o(11225568116736L, 83637);
      }
      
      public final void aML()
      {
        GMTrace.i(11225702334464L, 83638);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.eoF), 0).show();
        GMTrace.o(11225702334464L, 83638);
      }
      
      public final void aMM()
      {
        GMTrace.i(11225836552192L, 83639);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.eoz), 0).show();
        GMTrace.o(11225836552192L, 83639);
      }
      
      public final void aMN()
      {
        GMTrace.i(11226239205376L, 83642);
        com.tencent.mm.plugin.masssend.a.ifM.aq(MassSendMsgUI.this);
        GMTrace.o(11226239205376L, 83642);
      }
      
      public final void aMO()
      {
        GMTrace.i(11226373423104L, 83643);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.eoz), 0).show();
        GMTrace.o(11226373423104L, 83643);
      }
      
      public final void aMP()
      {
        GMTrace.i(11226507640832L, 83644);
        GMTrace.o(11226507640832L, 83644);
      }
      
      public final void aMQ()
      {
        GMTrace.i(11226641858560L, 83645);
        Intent localIntent = new Intent();
        localIntent.putExtra("preceding_scence", 13);
        com.tencent.mm.bi.d.b(MassSendMsgUI.this, "emoji", ".ui.v2.EmojiStoreV2UI", localIntent);
        GMTrace.o(11226641858560L, 83645);
      }
      
      public final void aMR()
      {
        GMTrace.i(11226910294016L, 83647);
        Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.eoG), 0).show();
        GMTrace.o(11226910294016L, 83647);
      }
      
      public final void aMS()
      {
        GMTrace.i(11227044511744L, 83648);
        GMTrace.o(11227044511744L, 83648);
      }
      
      public final void aMT()
      {
        GMTrace.i(11227178729472L, 83649);
        GMTrace.o(11227178729472L, 83649);
      }
      
      public final void aMU()
      {
        GMTrace.i(11227312947200L, 83650);
        GMTrace.o(11227312947200L, 83650);
      }
      
      public final void b(com.tencent.mm.pluginsdk.model.app.f paramAnonymousf)
      {
        GMTrace.i(11226104987648L, 83641);
        GMTrace.o(11226104987648L, 83641);
      }
      
      public final void qc(int paramAnonymousInt)
      {
        GMTrace.i(11225970769920L, 83640);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(11225970769920L, 83640);
          return;
          com.tencent.mm.pluginsdk.ui.tools.k.a(MassSendMsgUI.this, 1, 1, 0, 3, false, null);
          GMTrace.o(11225970769920L, 83640);
          return;
          File localFile = new File(com.tencent.mm.compatible.util.e.gKA);
          if ((!localFile.exists()) && (!localFile.mkdir()))
          {
            Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dKc), 1).show();
            GMTrace.o(11225970769920L, 83640);
            return;
          }
          boolean bool = com.tencent.mm.pluginsdk.h.a.a(MassSendMsgUI.this.vov.voR, "android.permission.CAMERA", 16, "", "");
          w.i("MicroMsg.MassSendMsgUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bOd(), MassSendMsgUI.this.vov.voR });
          if (!bool)
          {
            GMTrace.o(11225970769920L, 83640);
            return;
          }
          MassSendMsgUI.c(MassSendMsgUI.this);
        }
      }
      
      public final void qd(int paramAnonymousInt)
      {
        GMTrace.i(11226776076288L, 83646);
        MassSendMsgUI.d(MassSendMsgUI.this);
        GMTrace.o(11226776076288L, 83646);
      }
    };
    GMTrace.o(11220602060800L, 83600);
  }
  
  public static void Bl(String paramString)
  {
    GMTrace.i(11221004713984L, 83603);
    nHo = paramString;
    GMTrace.o(11221004713984L, 83603);
  }
  
  private static void Bm(String paramString)
  {
    GMTrace.i(11223017979904L, 83618);
    long l = com.tencent.mm.a.e.aY(paramString);
    int i = bg.e((Integer)g.a((int)(l / 1024L), new int[] { 512, 1024, 2048, 5120, 8192, 10240, 15360, 20480 }, 247, 255));
    g.paX.a(106L, i, 1L, false);
    g.paX.a(106L, 246L, 1L, false);
    w.d("MicroMsg.MassSendMsgUI", "report video size res : " + i + " hadCompress : true fileLen : " + l / 1024L + "K");
    GMTrace.o(11223017979904L, 83618);
  }
  
  private void M(final Intent paramIntent)
  {
    GMTrace.i(11222078455808L, 83611);
    Object localObject = paramIntent.getStringExtra("VideoRecorder_FileName");
    int i = paramIntent.getIntExtra("VideoRecorder_VideoLength", 0);
    paramIntent = new com.tencent.mm.plugin.masssend.a.a();
    paramIntent.nGo = this.nGH;
    paramIntent.nGp = this.nGI.size();
    paramIntent.filename = ((String)localObject);
    paramIntent.nGq = i;
    paramIntent.msgType = 43;
    paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.nGJ);
    ap.wT().a(paramIntent, 0);
    localObject = this.vov.voR;
    getString(R.l.dxm);
    this.ikZ = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.eFT), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11234426486784L, 83703);
        ap.wT().c(paramIntent);
        GMTrace.o(11234426486784L, 83703);
      }
    });
    GMTrace.o(11222078455808L, 83611);
  }
  
  private void N(final Intent paramIntent)
  {
    GMTrace.i(11222212673536L, 83612);
    Object localObject = paramIntent.getStringExtra("CropImage_OutputPath");
    if (localObject == null)
    {
      GMTrace.o(11222212673536L, 83612);
      return;
    }
    if (m.a((String)localObject, null, paramIntent.getBooleanExtra("CropImage_Compress_Img", true))) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.plugin.masssend.a.h.aMy();
      paramIntent = com.tencent.mm.plugin.masssend.a.b.h((String)localObject, this.nGH, this.nGI.size(), i);
      if (paramIntent != null) {
        break;
      }
      GMTrace.o(11222212673536L, 83612);
      return;
    }
    paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.nGJ, i);
    ap.wT().a(paramIntent, 0);
    localObject = this.vov.voR;
    getString(R.l.dxm);
    this.ikZ = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.eFT), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11249593090048L, 83816);
        ap.wT().c(paramIntent);
        GMTrace.o(11249593090048L, 83816);
      }
    });
    GMTrace.o(11222212673536L, 83612);
  }
  
  private void O(final Intent paramIntent)
  {
    GMTrace.i(11222481108992L, 83614);
    if (!aa.bu(this))
    {
      com.tencent.mm.ui.base.h.a(this, R.l.eOO, R.l.dxm, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11228923559936L, 83662);
          MassSendMsgUI.b(MassSendMsgUI.this, paramIntent);
          GMTrace.o(11228923559936L, 83662);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11218857230336L, 83587);
          GMTrace.o(11218857230336L, 83587);
        }
      });
      GMTrace.o(11222481108992L, 83614);
      return;
    }
    P(paramIntent);
    GMTrace.o(11222481108992L, 83614);
  }
  
  private void P(Intent paramIntent)
  {
    GMTrace.i(11222615326720L, 83615);
    final com.tencent.mm.modelvideo.c localc = new com.tencent.mm.modelvideo.c();
    getString(R.l.dxm);
    this.ikZ = com.tencent.mm.ui.base.h.a(this, getString(R.l.dxB), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11228118253568L, 83656);
        localc.hSg = null;
        GMTrace.o(11228118253568L, 83656);
      }
    });
    localc.a(this, paramIntent, new c.a()
    {
      public final void a(int paramAnonymousInt1, final String paramAnonymousString1, final String paramAnonymousString2, final int paramAnonymousInt2)
      {
        GMTrace.i(11229863084032L, 83669);
        w.d("MicroMsg.MassSendMsgUI", "onImportFinish, ret: %s, fileName: %s, importPath: %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString1, paramAnonymousString2 });
        if ((paramAnonymousInt1 < 0) && (paramAnonymousInt1 != -50002))
        {
          Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.eOM), 0).show();
          if (MassSendMsgUI.e(MassSendMsgUI.this) != null)
          {
            MassSendMsgUI.e(MassSendMsgUI.this).dismiss();
            MassSendMsgUI.f(MassSendMsgUI.this);
            GMTrace.o(11229863084032L, 83669);
          }
        }
        else
        {
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11227581382656L, 83652);
              if (MassSendMsgUI.a(MassSendMsgUI.this, paramAnonymousString1, paramAnonymousString2))
              {
                af.u(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(11240063631360L, 83745);
                    MassSendMsgUI.a(MassSendMsgUI.this, MassSendMsgUI.5.1.this.lJV, MassSendMsgUI.5.1.this.jaR);
                    GMTrace.o(11240063631360L, 83745);
                  }
                });
                GMTrace.o(11227581382656L, 83652);
                return;
              }
              af.u(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(11237513494528L, 83726);
                  Toast.makeText(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.eON), 0).show();
                  if (MassSendMsgUI.e(MassSendMsgUI.this) != null)
                  {
                    MassSendMsgUI.e(MassSendMsgUI.this).dismiss();
                    MassSendMsgUI.f(MassSendMsgUI.this);
                  }
                  GMTrace.o(11237513494528L, 83726);
                }
              });
              GMTrace.o(11227581382656L, 83652);
            }
          }, "MassSend_Remux");
        }
        GMTrace.o(11229863084032L, 83669);
      }
    });
    GMTrace.o(11222615326720L, 83615);
  }
  
  private void ahh()
  {
    GMTrace.i(11221810020352L, 83609);
    if (!com.tencent.mm.pluginsdk.ui.tools.k.c(this, com.tencent.mm.compatible.util.e.gKA, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
      Toast.makeText(this, getString(R.l.eFk), 1).show();
    }
    GMTrace.o(11221810020352L, 83609);
  }
  
  private boolean cL(String paramString1, String paramString2)
  {
    GMTrace.i(11222749544448L, 83616);
    boolean bool = am.is2G(this);
    if (bool)
    {
      i = 10485760;
      label25:
      if (!bool) {
        break label155;
      }
    }
    label155:
    for (double d = 60000.0D;; d = 300000.0D)
    {
      i = SightVideoJNI.shouldRemuxing(paramString2, 660, 500, i, d, 1000000);
      w.i("MicroMsg.MassSendMsgUI", "check remuxing, ret %d", new Object[] { Integer.valueOf(i) });
      switch (i)
      {
      default: 
        GMTrace.o(11222749544448L, 83616);
        return false;
        i = 20971520;
        break label25;
      }
    }
    com.tencent.mm.modelvideo.o.Na();
    Bm(s.lX(paramString1));
    GMTrace.o(11222749544448L, 83616);
    return true;
    GMTrace.o(11222749544448L, 83616);
    return false;
    com.tencent.mm.modelvideo.o.Na();
    String str = s.lX(paramString1);
    MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
    localMediaMetadataRetriever.setDataSource(paramString2);
    w.i("MicroMsg.MassSendMsgUI", "start remux, targetPath: %s", new Object[] { str });
    int k = bg.getInt(localMediaMetadataRetriever.extractMetadata(18), 0);
    int m = bg.getInt(localMediaMetadataRetriever.extractMetadata(19), 0);
    int n = 0;
    int i = m;
    int j = k;
    int i1;
    int i2;
    if (n < 3)
    {
      if ((j % 2 != 0) || (i % 2 != 0))
      {
        GMTrace.o(11222749544448L, 83616);
        return false;
      }
      if (j >= i)
      {
        i1 = j;
        i2 = i;
        if (j > 640)
        {
          i1 = j;
          i2 = i;
          if (i <= 480) {}
        }
      }
      else
      {
        if (j > i) {
          break label444;
        }
        i1 = j;
        i2 = i;
        if (j > 480)
        {
          if (i > 640) {
            break label444;
          }
          i2 = i;
          i1 = j;
        }
      }
    }
    for (;;)
    {
      localMediaMetadataRetriever.release();
      i = SightVideoJNI.remuxing(paramString2, str, i1, i2, com.tencent.mm.plugin.sight.base.b.pAL, com.tencent.mm.plugin.sight.base.b.pAK, 8, 2, 25.0F, com.tencent.mm.plugin.sight.base.b.pAM, null, 0, com.tencent.mm.plugin.sight.base.b.pAJ);
      if (i < 0)
      {
        w.w("MicroMsg.MassSendMsgUI", "remuxing video error");
        GMTrace.o(11222749544448L, 83616);
        return false;
        label444:
        j /= 2;
        i /= 2;
        n += 1;
        break;
      }
      Bm(str);
      com.tencent.mm.modelvideo.o.Na();
      paramString1 = s.lY(paramString1);
      if (!FileOp.aZ(paramString1)) {
        w.i("MicroMsg.MassSendMsgUI", "thumb not exist create one, thumbPath: %s", new Object[] { paramString1 });
      }
      try
      {
        paramString2 = ThumbnailUtils.createVideoThumbnail(str, 1);
        if (paramString2 != null) {
          com.tencent.mm.sdk.platformtools.d.a(paramString2, 60, Bitmap.CompressFormat.JPEG, paramString1, true);
        }
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MassSendMsgUI", paramString1, "", new Object[0]);
          w.e("MicroMsg.MassSendMsgUI", "create thumb error: %s", new Object[] { paramString1.getMessage() });
        }
      }
      w.i("MicroMsg.MassSendMsgUI", "do remux, targetPath: %s, outputWidth: %s, outputHeight: %s, retDuration: %s", new Object[] { str, Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i) });
      GMTrace.o(11222749544448L, 83616);
      return true;
      i1 = k;
      i2 = m;
    }
  }
  
  protected final void MH()
  {
    boolean bool = false;
    GMTrace.i(11221541584896L, 83607);
    oC(R.l.daa);
    this.nHn = ((TextView)findViewById(R.h.cby));
    this.neY = ((TextView)findViewById(R.h.cbx));
    TextView localTextView = this.nHn;
    int j = (int)this.nHn.getTextSize();
    if (this.nGI == null) {}
    for (Object localObject = new SpannableString("");; localObject = com.tencent.mm.pluginsdk.ui.d.h.c(this, ((StringBuilder)localObject).toString(), j))
    {
      localTextView.setText((CharSequence)localObject);
      this.neY.setText(getResources().getQuantityString(R.j.dkl, this.nGI.size(), new Object[] { Integer.valueOf(this.nGI.size()) }));
      this.nGF = ((ChatFooter)findViewById(R.h.ceI));
      ((MassSendLayout)findViewById(R.h.cbC)).jrT = this.nGF.teM;
      this.nGF.yQ(R.h.cbC);
      this.nHq = new b(this, this.nGF, this.nGH, this.nGI, this.nGJ);
      this.nGF.teS = this.nHq;
      localObject = new d(this);
      this.nGF.b((com.tencent.mm.pluginsdk.ui.chat.f)localObject);
      localObject = this.nGF;
      ap.AS();
      j = ((Integer)com.tencent.mm.x.c.xi().get(18, Integer.valueOf(-1))).intValue();
      int i = j;
      if (j == -1) {
        i = 1;
      }
      ((ChatFooter)localObject).T(i, true);
      this.nGF.OB("masssendapp");
      this.nGF.bJD();
      ap.AS();
      if (((Boolean)com.tencent.mm.x.c.xi().get(66832, Boolean.valueOf(false))).booleanValue())
      {
        this.nGF.bJB();
        this.nGF.bJy();
      }
      this.nGF.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(11238855671808L, 83736);
          GMTrace.o(11238855671808L, 83736);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(11238587236352L, 83734);
          GMTrace.o(11238587236352L, 83734);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(11238721454080L, 83735);
          paramAnonymousCharSequence = String.valueOf(paramAnonymousCharSequence);
          final String str = paramAnonymousCharSequence.substring(paramAnonymousInt1, paramAnonymousInt1 + paramAnonymousInt3);
          if (((MassSendMsgUI.a(MassSendMsgUI.this) == null) || (!MassSendMsgUI.a(MassSendMsgUI.this).isShowing())) && (com.tencent.mm.sdk.platformtools.o.QM(str)))
          {
            Bitmap localBitmap = com.tencent.mm.sdk.platformtools.d.d(str, 300, 300, false);
            if (localBitmap == null)
            {
              w.e("MicroMsg.MassSendMsgUI", "showAlert fail, bmp is null");
              GMTrace.o(11238721454080L, 83735);
              return;
            }
            ImageView localImageView = new ImageView(MassSendMsgUI.this);
            localImageView.setImageBitmap(localBitmap);
            paramAnonymousInt2 = MassSendMsgUI.this.getResources().getDimensionPixelSize(R.f.aRS);
            localImageView.setPadding(paramAnonymousInt2, paramAnonymousInt2, paramAnonymousInt2, paramAnonymousInt2);
            MassSendMsgUI.a(MassSendMsgUI.this, com.tencent.mm.ui.base.h.a(MassSendMsgUI.this, MassSendMsgUI.this.getString(R.l.dJU), localImageView, MassSendMsgUI.this.getString(R.l.dwr), MassSendMsgUI.this.getString(R.l.duP), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(11236439752704L, 83718);
                paramAnonymous2DialogInterface = new Intent();
                paramAnonymous2DialogInterface.putExtra("CropImage_OutputPath", str);
                MassSendMsgUI.a(MassSendMsgUI.this, paramAnonymous2DialogInterface);
                GMTrace.o(11236439752704L, 83718);
              }
            }, null));
            paramAnonymousCharSequence = paramAnonymousCharSequence.substring(0, paramAnonymousInt1) + paramAnonymousCharSequence.substring(paramAnonymousInt1 + paramAnonymousInt3);
            MassSendMsgUI.b(MassSendMsgUI.this).p(paramAnonymousCharSequence, -1, false);
            MassSendMsgUI.Bn(paramAnonymousCharSequence);
          }
          GMTrace.o(11238721454080L, 83735);
        }
      });
      this.nGF.bJx();
      this.nGF.bJp();
      this.nGF.bJw();
      this.nGF.bJs();
      this.nGF.bJv();
      this.nGF.kc(true);
      this.nGF.a(this.nHr);
      localObject = this.nGF;
      com.tencent.mm.bi.d.bKF();
      if ((com.tencent.mm.ao.b.Jp()) || ((m.zQ() & 0x2000000) != 0)) {
        bool = true;
      }
      ((ChatFooter)localObject).kd(bool);
      this.nGF.bJr();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11230668390400L, 83675);
          MassSendMsgUI.this.finish();
          GMTrace.o(11230668390400L, 83675);
          return true;
        }
      });
      GMTrace.o(11221541584896L, 83607);
      return;
      localObject = new StringBuilder();
      i = 0;
      if (i < this.nGI.size())
      {
        String str = com.tencent.mm.x.n.fc((String)this.nGI.get(i));
        if (i == this.nGI.size() - 1) {
          ((StringBuilder)localObject).append(str);
        }
        for (;;)
        {
          i += 1;
          break;
          ((StringBuilder)localObject).append(str + ",  ");
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(11222883762176L, 83617);
    w.i("MicroMsg.MassSendMsgUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ikZ != null)
    {
      this.ikZ.dismiss();
      this.ikZ = null;
    }
    if (this.nHq != null)
    {
      b localb = this.nHq;
      if (localb.ikZ != null)
      {
        localb.ikZ.dismiss();
        localb.ikZ = null;
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      nHo = "";
      paramString = new Intent(this, MassSendHistoryUI.class);
      paramString.addFlags(67108864);
      startActivity(paramString);
      finish();
      GMTrace.o(11222883762176L, 83617);
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -24))
    {
      w.e("MicroMsg.MassSendMsgUI", "onSceneEnd, masssend err spam");
      Toast.makeText(this, R.l.eoD, 0).show();
      GMTrace.o(11222883762176L, 83617);
      return;
    }
    if ((paramInt1 == 2) || (paramInt1 == 1) || (paramInt1 == 3)) {
      this.nGF.p(nHo, -1, true);
    }
    com.tencent.mm.plugin.masssend.a.ifN.a(this.vov.voR, paramInt1, paramInt2, paramString);
    switch (paramInt2)
    {
    default: 
      Toast.makeText(this, R.l.eFR, 0).show();
      GMTrace.o(11222883762176L, 83617);
      return;
    case -71: 
      paramInt1 = ((amj)((com.tencent.mm.plugin.masssend.a.f)paramk).gMC.hlV.hmc).uhv;
      com.tencent.mm.ui.base.h.a(this, getString(R.l.eoK, new Object[] { Integer.valueOf(paramInt1) }), getString(R.l.dxm), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11228655124480L, 83660);
          MassSendMsgUI.this.finish();
          GMTrace.o(11228655124480L, 83660);
        }
      });
      GMTrace.o(11222883762176L, 83617);
      return;
    }
    Toast.makeText(this, R.l.eoC, 0).show();
    GMTrace.o(11222883762176L, 83617);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11221407367168L, 83606);
    int i = R.i.daa;
    GMTrace.o(11221407367168L, 83606);
    return i;
  }
  
  protected void onActivityResult(final int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(11222346891264L, 83613);
    w.i("MicroMsg.MassSendMsgUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(11222346891264L, 83613);
      return;
    }
    final Object localObject;
    switch (paramInt1)
    {
    case 3: 
    default: 
      w.e("MicroMsg.MassSendMsgUI", "onActivityResult: not found this requestCode");
      GMTrace.o(11222346891264L, 83613);
      return;
    case 1: 
      if (paramIntent == null)
      {
        GMTrace.o(11222346891264L, 83613);
        return;
      }
      if (paramIntent.getBooleanExtra("is_video", false))
      {
        paramIntent = paramIntent.getStringExtra("video_full_path");
        localObject = new Intent();
        ((Intent)localObject).setData(Uri.parse("file://" + paramIntent));
        O((Intent)localObject);
        GMTrace.o(11222346891264L, 83613);
        return;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("CropImageMode", 4);
      ((Intent)localObject).putExtra("CropImage_Filter", true);
      com.tencent.mm.pluginsdk.i locali = com.tencent.mm.plugin.masssend.a.ifM;
      ap.AS();
      locali.a(this, paramIntent, (Intent)localObject, com.tencent.mm.x.c.yV(), 4, null);
      GMTrace.o(11222346891264L, 83613);
      return;
    case 2: 
      localObject = getApplicationContext();
      ap.AS();
      this.filePath = com.tencent.mm.pluginsdk.ui.tools.k.b((Context)localObject, paramIntent, com.tencent.mm.x.c.yV());
      if (this.filePath == null)
      {
        GMTrace.o(11222346891264L, 83613);
        return;
      }
      paramIntent = new Intent();
      paramIntent.putExtra("CropImageMode", 4);
      paramIntent.putExtra("CropImage_Filter", true);
      paramIntent.putExtra("CropImage_ImgPath", this.filePath);
      com.tencent.mm.plugin.masssend.a.ifM.a(this.vov.voR, paramIntent, 4);
      GMTrace.o(11222346891264L, 83613);
      return;
    case 4: 
      N(paramIntent);
      GMTrace.o(11222346891264L, 83613);
      return;
    case 8: 
      paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
      if (paramIntent != null)
      {
        if (paramIntent.nJS)
        {
          localObject = paramIntent.nKa;
          if (!bg.mZ((String)localObject)) {
            try
            {
              boolean bool = paramIntent.nJT;
              w.i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", new Object[] { localObject });
              com.tencent.mm.plugin.masssend.a.h.aMy();
              paramIntent = com.tencent.mm.plugin.masssend.a.b.h((String)localObject, this.nGH, this.nGI.size(), 0);
              if (paramIntent == null)
              {
                GMTrace.o(11222346891264L, 83613);
                return;
              }
              paramIntent = new com.tencent.mm.plugin.masssend.a.f(paramIntent, this.nGJ, 0);
              ap.wT().a(paramIntent, 0);
              localObject = this.vov.voR;
              getString(R.l.dxm);
              this.ikZ = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.eFT), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                {
                  GMTrace.i(11225031245824L, 83633);
                  ap.wT().c(paramIntent);
                  GMTrace.o(11225031245824L, 83633);
                }
              });
              GMTrace.o(11222346891264L, 83613);
              return;
            }
            catch (Exception paramIntent)
            {
              w.e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", new Object[] { paramIntent.getMessage() });
            }
          }
          GMTrace.o(11222346891264L, 83613);
          return;
        }
        w.i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", new Object[] { paramIntent.nJU, paramIntent.nJV });
        com.tencent.mm.modelvideo.o.Na();
        localObject = s.lX(paramIntent.nJW);
        if (!paramIntent.nJU.equals(localObject))
        {
          w.i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", new Object[] { paramIntent.nJU, localObject });
          FileOp.ak(paramIntent.nJU, (String)localObject);
        }
        localObject = paramIntent.nJW;
        paramInt1 = paramIntent.nJY;
        paramIntent = new com.tencent.mm.modelvideo.c();
        getString(R.l.dxm);
        this.ikZ = com.tencent.mm.ui.base.h.a(this, getString(R.l.dxB), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(11234158051328L, 83701);
            paramIntent.hSg = null;
            GMTrace.o(11234158051328L, 83701);
          }
        });
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11229594648576L, 83667);
            VideoTransPara localVideoTransPara = com.tencent.mm.modelcontrol.d.Gs().Gt();
            aly localaly = new aly();
            localaly.ugK = true;
            if (l.a(localObject, localVideoTransPara, localaly, new com.tencent.mm.plugin.mmsight.model.d()
            {
              public final boolean aMV()
              {
                GMTrace.i(11242076897280L, 83760);
                GMTrace.o(11242076897280L, 83760);
                return false;
              }
            })) {
              l.b(localObject, localVideoTransPara, localaly, new com.tencent.mm.plugin.mmsight.model.d()
              {
                public final boolean aMV()
                {
                  GMTrace.i(11232279003136L, 83687);
                  GMTrace.o(11232279003136L, 83687);
                  return false;
                }
              });
            }
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11219125665792L, 83589);
                MassSendMsgUI.a(MassSendMsgUI.this, MassSendMsgUI.15.this.lUT, MassSendMsgUI.15.this.jaR);
                GMTrace.o(11219125665792L, 83589);
              }
            });
            GMTrace.o(11229594648576L, 83667);
          }
        }, "MassSend_Remux");
      }
      GMTrace.o(11222346891264L, 83613);
      return;
    case 7: 
      if (paramIntent != null)
      {
        if (paramIntent.getBooleanExtra("from_record", false))
        {
          M(paramIntent);
          GMTrace.o(11222346891264L, 83613);
          return;
        }
        O(paramIntent);
        GMTrace.o(11222346891264L, 83613);
        return;
      }
      break;
    case 5: 
      M(paramIntent);
      GMTrace.o(11222346891264L, 83613);
      return;
    case 6: 
      O(paramIntent);
      GMTrace.o(11222346891264L, 83613);
      return;
    }
    GMTrace.o(11222346891264L, 83613);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11220736278528L, 83601);
    super.onCreate(paramBundle);
    ap.wT().a(193, this);
    this.nGJ = getIntent().getBooleanExtra("mass_send_again", false);
    this.nGH = getIntent().getStringExtra("mass_send_contact_list");
    paramBundle = this.nGH;
    this.nGI = new ArrayList();
    if ((paramBundle == null) || (paramBundle.equals(""))) {}
    for (;;)
    {
      MH();
      GMTrace.o(11220736278528L, 83601);
      return;
      paramBundle = paramBundle.split(";");
      if ((paramBundle != null) && (paramBundle.length > 0)) {
        this.nGI = bg.f(paramBundle);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11221138931712L, 83604);
    ap.wT().b(193, this);
    super.onDestroy();
    if (this.nGF != null) {
      this.nGF.destroy();
    }
    GMTrace.o(11221138931712L, 83604);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11221675802624L, 83608);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0) && (this.nGF.bJE()))
    {
      this.nGF.bJG();
      GMTrace.o(11221675802624L, 83608);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11221675802624L, 83608);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11221273149440L, 83605);
    this.nGF.ayn();
    this.nGF.onPause();
    super.onPause();
    GMTrace.o(11221273149440L, 83605);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11221944238080L, 83610);
    w.i("MicroMsg.MassSendMsgUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11221944238080L, 83610);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        ahh();
        GMTrace.o(11221944238080L, 83610);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.etQ), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11237781929984L, 83728);
          MassSendMsgUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11237781929984L, 83728);
        }
      }, null);
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(11220870496256L, 83602);
    super.onResume();
    if (this.nGF != null)
    {
      this.nGF.p(nHo, -1, true);
      this.nGF.a(this.vov.voR, this);
    }
    GMTrace.o(11220870496256L, 83602);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/MassSendMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */