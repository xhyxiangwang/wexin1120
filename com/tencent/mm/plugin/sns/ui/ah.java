package com.tencent.mm.plugin.sns.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView;
import com.tencent.mm.plugin.sns.ui.previewimageview.c.a;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.bcv;
import com.tencent.mm.protocal.c.bea;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.tools.a.a;
import com.tencent.mm.x.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ah
  extends a
{
  private String appId;
  private String appName;
  public MMActivity fsU;
  private String iFw;
  private boolean qAp;
  private boolean qBW;
  private boolean qBX;
  private WXMediaMessage qBY;
  public b qDU;
  private w qDV;
  Map<String, Exif.a> qDW;
  private Map<String, bea> qDX;
  private int qDY;
  private boolean qDZ;
  akv qEa;
  private b qyD;
  private int qyx;
  
  public ah(MMActivity paramMMActivity)
  {
    GMTrace.i(8667109785600L, 64575);
    this.qDU = new b();
    this.qAp = false;
    this.qDW = new HashMap();
    this.qDX = new HashMap();
    this.qDY = 0;
    this.qBW = false;
    this.qDZ = false;
    this.qBX = false;
    this.qBY = null;
    this.qyD = null;
    this.fsU = paramMMActivity;
    GMTrace.o(8667109785600L, 64575);
  }
  
  private boolean G(Bundle paramBundle)
  {
    GMTrace.i(8667378221056L, 64577);
    if (paramBundle == null)
    {
      GMTrace.o(8667378221056L, 64577);
      return false;
    }
    paramBundle = paramBundle.getStringArrayList("sns_media_latlong_list");
    if (paramBundle == null)
    {
      GMTrace.o(8667378221056L, 64577);
      return false;
    }
    paramBundle = paramBundle.iterator();
    while (paramBundle.hasNext())
    {
      String[] arrayOfString = ((String)paramBundle.next()).split("\n");
      if (3 != arrayOfString.length)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "invalid params");
        GMTrace.o(8667378221056L, 64577);
        return true;
      }
      try
      {
        this.qDW.put(arrayOfString[0].trim(), new Exif.a(bg.getDouble(arrayOfString[1], 0.0D), bg.getDouble(arrayOfString[2], 0.0D), 0.0D));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", localNumberFormatException.toString());
      }
    }
    GMTrace.o(8667378221056L, 64577);
    return true;
  }
  
  private static aw a(aw paramaw, List<com.tencent.mm.plugin.sns.data.h> paramList)
  {
    GMTrace.i(8667915091968L, 64581);
    paramaw.br(paramList);
    GMTrace.o(8667915091968L, 64581);
    return paramaw;
  }
  
  public final void D(Bundle paramBundle)
  {
    GMTrace.i(8667244003328L, 64576);
    this.qyD = b.q(this.fsU.getIntent());
    this.qAp = this.fsU.getIntent().getBooleanExtra("Kis_take_photo", false);
    this.appId = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.qBW = this.fsU.getIntent().getBooleanExtra("KThrid_app", false);
    this.qDZ = this.fsU.getIntent().getBooleanExtra("KBlockAdd", false);
    this.qBX = this.fsU.getIntent().getBooleanExtra("KSnsAction", false);
    this.qyx = this.fsU.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.iFw = bg.ap(this.fsU.getIntent().getStringExtra("reportSessionId"), "");
    Object localObject1 = this.fsU.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (localObject1 != null) {
      this.qBY = new SendMessageToWX.Req((Bundle)localObject1).message;
    }
    Object localObject3 = this.fsU.getIntent().getStringExtra("sns_kemdia_path");
    Object localObject4 = this.fsU.getIntent().getByteArrayExtra("Ksnsupload_imgbuf");
    localObject1 = localObject4;
    if (localObject4 == null)
    {
      localObject1 = localObject4;
      if (this.qBY != null)
      {
        localObject1 = localObject4;
        if (this.qBY.mediaObject != null)
        {
          localObject1 = localObject4;
          if ((this.qBY.mediaObject instanceof WXImageObject)) {
            localObject1 = ((WXImageObject)this.qBY.mediaObject).imageData;
          }
        }
      }
    }
    if ((bg.mZ((String)localObject3)) && (!bg.bp((byte[])localObject1)))
    {
      localObject3 = com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(new StringBuilder(" ").append(System.currentTimeMillis()).toString().getBytes());
      FileOp.deleteFile((String)localObject3);
      FileOp.b((String)localObject3, (byte[])localObject1, localObject1.length);
    }
    label958:
    label972:
    Object localObject2;
    for (localObject1 = localObject3;; localObject2 = localObject3)
    {
      int j = this.fsU.getIntent().getIntExtra("KFilterId", 0);
      if (paramBundle == null) {}
      boolean bool;
      for (localObject3 = null;; localObject3 = paramBundle.getString("sns_kemdia_path_list"))
      {
        G(paramBundle);
        bool = G(this.fsU.getIntent().getExtras());
        this.qDY = 0;
        if (bg.mZ((String)localObject3)) {
          break;
        }
        this.qDU.Ik((String)localObject3);
        GMTrace.o(8667244003328L, 64576);
        return;
      }
      if (!bg.mZ((String)localObject1))
      {
        paramBundle = com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + "pre_temp_sns_pic" + com.tencent.mm.a.g.n(((String)localObject1).getBytes());
        localObject3 = new File(paramBundle);
        if (!((File)localObject3).getParentFile().exists()) {
          ((File)localObject3).getParentFile().mkdirs();
        }
        FileOp.o((String)localObject1, paramBundle);
        if (j != -1) {
          break label972;
        }
      }
      for (int i = 0;; i = j)
      {
        this.qDU.m(paramBundle, i, this.qAp);
        if (!bool)
        {
          localObject3 = Exif.fromFile((String)localObject1).getLocation();
          if (localObject3 != null) {
            this.qDW.put(paramBundle, localObject3);
          }
        }
        try
        {
          localObject3 = new File((String)localObject1);
          localObject4 = new bea();
          if (this.qAp) {}
          for (i = 1;; i = 2)
          {
            ((bea)localObject4).uwg = i;
            ((bea)localObject4).uwi = (((File)localObject3).lastModified() / 1000L);
            ((bea)localObject4).uwh = Exif.fromFile((String)localObject1).getUxtimeDatatimeOriginal();
            this.qDX.put(paramBundle, localObject4);
            GMTrace.o(8667244003328L, 64576);
            return;
          }
          paramBundle = this.fsU.getIntent().getStringArrayListExtra("sns_kemdia_path_list");
        }
        catch (Exception paramBundle)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "get report info error " + paramBundle.getMessage());
          GMTrace.o(8667244003328L, 64576);
          return;
        }
        if ((paramBundle != null) && (paramBundle.size() > 0))
        {
          paramBundle = paramBundle.iterator();
          if (paramBundle.hasNext())
          {
            localObject1 = (String)paramBundle.next();
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "newPath " + (String)localObject1);
            this.qDU.m((String)localObject1, j, false);
            if (!bool)
            {
              localObject3 = Exif.fromFile((String)localObject1).getLocation();
              if (localObject3 != null) {
                this.qDW.put(localObject1, localObject3);
              }
            }
            for (;;)
            {
              try
              {
                localObject3 = new File((String)localObject1);
                localObject4 = new bea();
                if (!this.qAp) {
                  break label958;
                }
                i = 1;
                ((bea)localObject4).uwg = i;
                ((bea)localObject4).uwi = (((File)localObject3).lastModified() / 1000L);
                ((bea)localObject4).uwh = Exif.fromFile((String)localObject1).getUxtimeDatatimeOriginal();
                this.qDX.put(localObject1, localObject4);
              }
              catch (Exception localException)
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "get report info error " + localException.getMessage());
              }
              break;
              i = 2;
            }
          }
        }
        GMTrace.o(8667244003328L, 64576);
        return;
      }
    }
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(8667512438784L, 64578);
    paramBundle.putString("sns_kemdia_path_list", this.qDU.toString());
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.qDW.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localArrayList.add(String.format("%s\n%f\n%f", new Object[] { localEntry.getKey(), Double.valueOf(((Exif.a)localEntry.getValue()).latitude), Double.valueOf(((Exif.a)localEntry.getValue()).longitude) }));
    }
    paramBundle.putStringArrayList("sns_media_latlong_list", localArrayList);
    paramBundle.getString("contentdesc");
    GMTrace.o(8667512438784L, 64578);
  }
  
  public final View a(View paramView1, View paramView2, DynamicGridView paramDynamicGridView, View paramView3)
  {
    GMTrace.i(15995800387584L, 119178);
    MMActivity localMMActivity = this.fsU;
    ArrayList localArrayList = this.qDU.qEf;
    w.a local1 = new w.a()
    {
      public final void uM(int paramAnonymousInt)
      {
        GMTrace.i(8587787108352L, 63984);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "I click");
        if (paramAnonymousInt < 0)
        {
          ah.this.bmk();
          GMTrace.o(8587787108352L, 63984);
          return;
        }
        Intent localIntent = new Intent();
        localIntent.setClass(ah.this.fsU, SnsUploadBrowseUI.class);
        localIntent.putExtra("sns_gallery_position", paramAnonymousInt);
        localIntent.putExtra("sns_gallery_temp_paths", ah.this.qDU.qEf);
        ah.this.fsU.startActivityForResult(localIntent, 7);
        GMTrace.o(8587787108352L, 63984);
      }
    };
    c.a local2 = new c.a()
    {
      public final void dc(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(15994726645760L, 119170);
        ah.b localb = ah.this.qDU;
        if ((paramAnonymousInt1 != paramAnonymousInt2) && (localb.qEf.size() > paramAnonymousInt1))
        {
          String str = (String)localb.qEf.remove(paramAnonymousInt1);
          if (paramAnonymousInt2 < localb.qEf.size())
          {
            localb.qEf.add(paramAnonymousInt2, str);
            GMTrace.o(15994726645760L, 119170);
            return;
          }
          localb.qEf.add(str);
        }
        GMTrace.o(15994726645760L, 119170);
      }
      
      public final void removeItem(int paramAnonymousInt)
      {
        GMTrace.i(15994860863488L, 119171);
        ah.b localb = ah.this.qDU;
        if (localb.qEf.size() > paramAnonymousInt) {
          localb.qEf.remove(paramAnonymousInt);
        }
        if ((ah.this.fsU instanceof En_c4f742e5)) {
          ((En_c4f742e5)ah.this.fsU).blx();
        }
        GMTrace.o(15994860863488L, 119171);
      }
    };
    if (!this.qDZ) {}
    for (boolean bool = true;; bool = false)
    {
      this.qDV = new com.tencent.mm.plugin.sns.ui.previewimageview.e(paramView1, paramView2, paramView3, localMMActivity, localArrayList, paramDynamicGridView, local1, local2, bool);
      paramView1 = this.qDV.getView();
      GMTrace.o(15995800387584L, 119178);
      return paramView1;
    }
  }
  
  public final void a(aw paramaw)
  {
    GMTrace.i(8668049309696L, 64582);
    int i = paramaw.commit();
    if (this.qyD != null)
    {
      this.qyD.gO(i);
      com.tencent.mm.plugin.sns.h.e.qkT.b(this.qyD);
    }
    if ((this.qDU != null) && (this.qDU.qEf != null) && (com.tencent.mm.plugin.sns.storage.r.bkG())) {
      com.tencent.mm.plugin.report.service.g.paX.i(12834, new Object[] { Integer.valueOf(this.qDU.qEf.size()) });
    }
    paramaw = new Intent();
    paramaw.putExtra("sns_local_id", i);
    this.fsU.setResult(-1, paramaw);
    this.fsU.finish();
    GMTrace.o(8668049309696L, 64582);
  }
  
  public final boolean a(int paramInt1, int paramInt2, org.a.d.i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8668183527424L, 64583);
    paramString2 = new LinkedList();
    Object localObject1 = this.qDU.qEf.iterator();
    int i = 0;
    Object localObject2;
    Object localObject3;
    label112:
    Object localObject4;
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localObject3 = new com.tencent.mm.plugin.sns.data.h((String)localObject2, 2);
      ((com.tencent.mm.plugin.sns.data.h)localObject3).type = 2;
      ((com.tencent.mm.plugin.sns.data.h)localObject3).pYs = paramInt1;
      int j;
      if (i == 0)
      {
        ((com.tencent.mm.plugin.sns.data.h)localObject3).pYr = paramInt2;
        if (parami != null)
        {
          ((com.tencent.mm.plugin.sns.data.h)localObject3).pYu = parami.token;
          ((com.tencent.mm.plugin.sns.data.h)localObject3).pYv = parami.uih;
        }
        localObject4 = this.qDU;
        if (!((b)localObject4).qEh.containsKey(localObject2)) {
          break label251;
        }
        j = ((Integer)((b)localObject4).qEh.get(localObject2)).intValue();
        label153:
        ((com.tencent.mm.plugin.sns.data.h)localObject3).pYq = j;
        ((com.tencent.mm.plugin.sns.data.h)localObject3).desc = paramString1;
        localObject4 = this.qDU;
        if ((bg.mZ((String)localObject2)) || (!((b)localObject4).qEg.containsKey(localObject2))) {
          break label257;
        }
      }
      label251:
      label257:
      for (boolean bool = ((Boolean)((b)localObject4).qEg.get(localObject2)).booleanValue();; bool = false)
      {
        ((com.tencent.mm.plugin.sns.data.h)localObject3).pYx = bool;
        paramString2.add(localObject3);
        i += 1;
        break;
        ((com.tencent.mm.plugin.sns.data.h)localObject3).pYr = 0;
        break label112;
        j = 0;
        break label153;
      }
    }
    localObject1 = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      localObject2 = o.Au();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        localObject3 = (String)paramList1.next();
        if (!((List)localObject2).contains(localObject3))
        {
          localObject4 = new bes();
          ((bes)localObject4).jWW = ((String)localObject3);
          ((LinkedList)localObject1).add(localObject4);
        }
      }
    }
    paramList1 = new aw(1);
    paramPInt.value = paramList1.jOR;
    if (parami != null) {
      paramList1.dw(parami.token, parami.uih);
    }
    if (paramInt3 > com.tencent.mm.plugin.sns.c.a.pXZ) {
      paramList1.uk(3);
    }
    paramList1.GR(paramString1).a(paramakv).ak((LinkedList)localObject1).um(paramInt1).un(paramInt2);
    if (paramBoolean) {
      paramList1.up(1);
    }
    for (;;)
    {
      if (!bg.mZ(this.appId)) {
        paramList1.GX(this.appId);
      }
      if (!bg.mZ(this.appName)) {
        paramList1.GY(bg.ap(this.appName, ""));
      }
      paramList1.uo(this.qyx);
      if (this.qBW) {
        paramList1.uo(5);
      }
      if ((this.qBX) && (this.qBY != null))
      {
        paramList1.GS(this.qBY.mediaTagName);
        paramList1.S(this.appId, this.qBY.messageExt, this.qBY.messageAction);
      }
      paramList1.d(null, null, null, paramInt4, paramInt5);
      paramList1.bq(paramList2);
      paramList1.ot(this.iFw);
      if ((paramakv != null) && (paramakv.score != 0))
      {
        paramInt1 = paramakv.score;
        parami = paramakv.ufI;
        paramList1.qfJ.uir = new bcv();
        paramList1.qfJ.uir.uuQ = paramInt1;
        paramList1.qfJ.uir.uuN = parami;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PicWidget", "commit pic size %d, browseImageCount:%d", new Object[] { Integer.valueOf(paramString2.size()), Integer.valueOf(this.qDY) });
      com.tencent.mm.plugin.report.service.g.paX.i(11602, new Object[] { Integer.valueOf(this.qDY), Integer.valueOf(paramString2.size()) });
      parami = paramString2.iterator();
      while (parami.hasNext())
      {
        paramString1 = (com.tencent.mm.plugin.sns.data.h)parami.next();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PicWidget", "commit path  %s len: %d", new Object[] { paramString1.path, Long.valueOf(FileOp.kI(paramString1.path)) });
      }
      paramList1.up(0);
    }
    paramString1 = paramString2.iterator();
    if (paramString1.hasNext())
    {
      paramakv = ((com.tencent.mm.plugin.sns.data.h)paramString1.next()).path;
      parami = (bea)this.qDX.get(paramakv);
      if (parami != null) {
        break label1333;
      }
      parami = new bea();
    }
    label946:
    label1252:
    label1333:
    for (;;)
    {
      if ((this.qEa != null) && ((this.qEa.tDN != 0.0F) || (this.qEa.tDM != 0.0F)))
      {
        parami.uwe = this.qEa.tDN;
        parami.uwf = this.qEa.tDM;
        parami.qCz = this.qEa.qCz;
        parami.aFP = this.qEa.aFP;
        paramakv = (Exif.a)this.qDW.get(paramakv);
        if ((paramakv == null) || ((paramakv.latitude == 0.0D) && (paramakv.longitude == 0.0D))) {
          break label1252;
        }
        parami.uwc = ((float)paramakv.latitude);
      }
      for (parami.uwd = ((float)paramakv.longitude);; parami.uwd = -1000.0F)
      {
        paramakv = new StringBuffer();
        paramakv.append("||index: " + paramList1.qfJ.uil.size());
        paramakv.append("||item poi lat " + parami.uwe + " " + parami.uwf);
        paramakv.append("||item pic lat " + parami.uwc + " " + parami.uwd);
        paramakv.append("||item exitime:" + parami.uwh + " filetime: " + parami.uwi);
        paramakv.append("||item source: " + parami.uwg);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.UploadPackHelper", "addSnsReportInfo item : " + paramakv.toString());
        paramList1.qfJ.uil.add(parami);
        break;
        parami.uwe = -1000.0F;
        parami.uwf = -1000.0F;
        break label946;
        parami.uwc = -1000.0F;
      }
      if (paramString2.size() <= 1)
      {
        a(paramList1, paramString2);
        a(paramList1);
      }
      for (;;)
      {
        GMTrace.o(8668183527424L, 64583);
        return true;
        new a(paramList1, paramString2).m(new String[] { "" });
      }
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8668586180608L, 64586);
    Object localObject1;
    switch (paramInt)
    {
    case 5: 
    case 6: 
    case 8: 
    case 10: 
    default: 
    case 2: 
    case 3: 
    case 9: 
    case 11: 
      do
      {
        do
        {
          GMTrace.o(8668586180608L, 64586);
          return false;
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "onActivityResult 1");
          if (paramIntent == null)
          {
            GMTrace.o(8668586180608L, 64586);
            return false;
          }
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "onActivityResult CONTEXT_CHOSE_IMAGE");
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("CropImageMode", 4);
          ((Intent)localObject1).putExtra("CropImage_DirectlyIntoFilter", true);
          ((Intent)localObject1).putExtra("CropImage_Filter", true);
          com.tencent.mm.plugin.sns.c.a.ifM.a(this.fsU, paramIntent, (Intent)localObject1, com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath(), 4, new a.a()
          {
            public final String Ij(String paramAnonymousString)
            {
              GMTrace.i(15995263516672L, 119174);
              paramAnonymousString = com.tencent.mm.a.g.n((paramAnonymousString + System.currentTimeMillis()).getBytes());
              paramAnonymousString = com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + paramAnonymousString;
              GMTrace.o(15995263516672L, 119174);
              return paramAnonymousString;
            }
          });
          GMTrace.o(8668586180608L, 64586);
          return true;
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "onActivityResult 2");
          paramIntent = k.b(this.fsU.getApplicationContext(), paramIntent, com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath());
          if (paramIntent == null)
          {
            GMTrace.o(8668586180608L, 64586);
            return true;
          }
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("CropImageMode", 4);
          ((Intent)localObject1).putExtra("CropImage_Filter", true);
          ((Intent)localObject1).putExtra("CropImage_DirectlyIntoFilter", true);
          ((Intent)localObject1).putExtra("CropImage_ImgPath", paramIntent);
          String str = com.tencent.mm.a.g.n((paramIntent + System.currentTimeMillis()).getBytes());
          ((Intent)localObject1).putExtra("CropImage_OutputPath", com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str);
          Object localObject2 = Exif.fromFile(paramIntent).getLocation();
          if (localObject2 != null)
          {
            this.qDW.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, localObject2);
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "take picture lat:%f, long:%f", new Object[] { Double.valueOf(((Exif.a)localObject2).latitude), Double.valueOf(((Exif.a)localObject2).longitude) });
          }
          localObject2 = new bea();
          ((bea)localObject2).uwg = 1;
          ((bea)localObject2).uwi = System.currentTimeMillis();
          ((bea)localObject2).uwh = bg.RG(Exif.fromFile(paramIntent).dateTime);
          this.qDX.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, localObject2);
          com.tencent.mm.plugin.sns.c.a.ifM.a(this.fsU, (Intent)localObject1, 4);
          this.qAp = true;
          GMTrace.o(8668586180608L, 64586);
          return true;
          bool = c(paramIntent.getStringArrayListExtra("CropImage_OutputPath_List"), paramIntent.getIntExtra("CropImage_filterId", 0), paramIntent.getBooleanExtra("isTakePhoto", false));
          GMTrace.o(8668586180608L, 64586);
          return bool;
          paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
        } while (paramIntent == null);
        paramIntent = paramIntent.nKa;
      } while (bg.mZ(paramIntent));
      boolean bool = c(Collections.singletonList(paramIntent), 0, true);
      GMTrace.o(8668586180608L, 64586);
      return bool;
    case 4: 
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "onActivityResult 3");
      if (paramIntent == null)
      {
        GMTrace.o(8668586180608L, 64586);
        return true;
      }
      localObject1 = paramIntent.getStringExtra("CropImage_OutputPath");
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "REQUEST_CODE_IMAGE_SEND_COMFIRM filePath " + (String)localObject1);
      if (localObject1 == null)
      {
        GMTrace.o(8668586180608L, 64586);
        return true;
      }
      if (!FileOp.aZ((String)localObject1))
      {
        GMTrace.o(8668586180608L, 64586);
        return true;
      }
      if (this.qDU.qEf.size() >= 9)
      {
        GMTrace.o(8668586180608L, 64586);
        return true;
      }
      paramInt = paramIntent.getIntExtra("CropImage_filterId", 0);
      paramIntent = "pre_temp_sns_pic" + com.tencent.mm.a.g.n(new StringBuilder().append((String)localObject1).append(System.currentTimeMillis()).toString().getBytes());
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PicWidget", "onactivity result " + FileOp.kI((String)localObject1) + " " + (String)localObject1);
      FileOp.o((String)localObject1, com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + paramIntent);
      if (this.qDW.containsKey(localObject1)) {
        this.qDW.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + paramIntent, this.qDW.get(localObject1));
      }
      paramIntent = com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + paramIntent;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "newPath " + paramIntent);
      this.qDU.m(paramIntent, paramInt, false);
      this.qDV.by(this.qDU.qEf);
      GMTrace.o(8668586180608L, 64586);
      return true;
    }
    if (paramIntent == null)
    {
      GMTrace.o(8668586180608L, 64586);
      return true;
    }
    this.qDU.R(paramIntent.getStringArrayListExtra("sns_gallery_temp_paths"));
    this.qDV.by(this.qDU.qEf);
    this.qDY = paramIntent.getIntExtra("sns_update_preview_image_count", 0);
    GMTrace.o(8668586180608L, 64586);
    return true;
  }
  
  public final boolean blb()
  {
    GMTrace.i(8667646656512L, 64579);
    if (this.qDU != null)
    {
      b localb = this.qDU;
      if ((localb.qEf != null) && (localb.qEf.size() > 0)) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(8667646656512L, 64579);
        return true;
      }
    }
    GMTrace.o(8667646656512L, 64579);
    return false;
  }
  
  public final View blc()
  {
    GMTrace.i(8667780874240L, 64580);
    this.qDV = new PreviewImageView(this.fsU);
    if (this.qDZ) {
      this.qDV.blF();
    }
    this.qDV.a(new w.a()
    {
      public final void uM(int paramAnonymousInt)
      {
        GMTrace.i(15995934605312L, 119179);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "I click");
        if (paramAnonymousInt < 0)
        {
          ah.this.bmk();
          GMTrace.o(15995934605312L, 119179);
          return;
        }
        Intent localIntent = new Intent();
        localIntent.setClass(ah.this.fsU, SnsUploadBrowseUI.class);
        localIntent.putExtra("sns_gallery_position", paramAnonymousInt);
        localIntent.putExtra("sns_gallery_temp_paths", ah.this.qDU.qEf);
        ah.this.fsU.startActivityForResult(localIntent, 7);
        GMTrace.o(15995934605312L, 119179);
      }
    });
    this.qDV.by(this.qDU.qEf);
    View localView = this.qDV.getView();
    GMTrace.o(8667780874240L, 64580);
    return localView;
  }
  
  public final boolean bld()
  {
    GMTrace.i(8668720398336L, 64587);
    if (this.qDV != null) {
      this.qDV.clean();
    }
    GMTrace.o(8668720398336L, 64587);
    return false;
  }
  
  protected final boolean bmk()
  {
    GMTrace.i(8668317745152L, 64584);
    com.tencent.mm.kernel.h.xA();
    if (!com.tencent.mm.kernel.h.xz().isSDCardAvailable())
    {
      t.fn(this.fsU);
      GMTrace.o(8668317745152L, 64584);
      return false;
    }
    if (this.qDU.qEf.size() >= 9)
    {
      com.tencent.mm.ui.base.h.h(this.fsU, i.j.pUk, i.j.dxm);
      GMTrace.o(8668317745152L, 64584);
      return false;
    }
    try
    {
      ba localba = new ba(this.fsU);
      localba.qQS = new o.c()
      {
        public final void a(m paramAnonymousm)
        {
          GMTrace.i(15966272487424L, 118958);
          if (!com.tencent.mm.platformtools.r.idk) {
            paramAnonymousm.e(0, ah.this.fsU.getString(i.j.dvx));
          }
          paramAnonymousm.e(1, ah.this.fsU.getString(i.j.dvB));
          GMTrace.o(15966272487424L, 118958);
        }
      };
      localba.qQT = new o.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(15994055557120L, 119165);
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(15994055557120L, 119165);
            return;
            if (9 - ah.this.qDU.qEf.size() <= 0)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "has select the max image count");
              GMTrace.o(15994055557120L, 119165);
              return;
            }
            com.tencent.mm.plugin.report.service.g.paX.i(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
            paramAnonymousMenuItem = new Intent();
            k.a(ah.this.fsU, 11, paramAnonymousMenuItem, 2, 2);
            GMTrace.o(15994055557120L, 119165);
            return;
            paramAnonymousInt = 9 - ah.this.qDU.qEf.size();
            if (paramAnonymousInt <= 0)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "has select the max image count");
              GMTrace.o(15994055557120L, 119165);
              return;
            }
            paramAnonymousMenuItem = ah.this.fsU.getSharedPreferences(ab.bNa(), 0).getString("gallery", "1");
            com.tencent.mm.plugin.report.service.g.paX.i(13822, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
            if (paramAnonymousMenuItem.equalsIgnoreCase("0"))
            {
              k.M(ah.this.fsU);
              GMTrace.o(15994055557120L, 119165);
              return;
            }
            k.a(ah.this.fsU, 9, paramAnonymousInt, 4, 1, false, null);
          }
        }
      };
      localba.bnM();
      GMTrace.o(8668317745152L, 64584);
      return true;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final boolean c(List<String> paramList, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8668451962880L, 64585);
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.PicWidget", "no image selected");
      GMTrace.o(8668451962880L, 64585);
      return true;
    }
    if (this.qDU.qEf.size() >= 9)
    {
      GMTrace.o(8668451962880L, 64585);
      return true;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (String)paramList.next();
      if (FileOp.aZ((String)localObject))
      {
        String str = "pre_temp_sns_pic" + com.tencent.mm.a.g.n(new StringBuilder().append((String)localObject).append(System.currentTimeMillis()).toString().getBytes());
        com.tencent.mm.plugin.sns.storage.r.V(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath(), (String)localObject, str);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.PicWidget", "newPath " + com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str);
        this.qDU.m(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, paramInt, paramBoolean);
        this.qDV.by(this.qDU.qEf);
        for (;;)
        {
          try
          {
            File localFile = new File((String)localObject);
            bea localbea = new bea();
            if (!paramBoolean) {
              continue;
            }
            i = 1;
            localbea.uwg = i;
            localbea.uwi = (localFile.lastModified() / 1000L);
            localbea.uwh = Exif.fromFile((String)localObject).getUxtimeDatatimeOriginal();
            this.qDX.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, localbea);
          }
          catch (Exception localException)
          {
            int i;
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PicWidget", "get report info error " + localException.getMessage());
            continue;
          }
          localObject = Exif.fromFile((String)localObject).getLocation();
          if (localObject == null) {
            break;
          }
          this.qDW.put(com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + str, localObject);
          break;
          i = 2;
        }
      }
    }
    GMTrace.o(8668451962880L, 64585);
    return true;
  }
  
  final class a
    extends com.tencent.mm.plugin.sns.model.h<String, Integer, Boolean>
  {
    private ProgressDialog ilL;
    private aw qCR;
    private List<com.tencent.mm.plugin.sns.data.h> qEc;
    
    public a(List<com.tencent.mm.plugin.sns.data.h> paramList)
    {
      GMTrace.i(8639058280448L, 64366);
      this.ilL = null;
      this.qCR = paramList;
      List localList;
      this.qEc = localList;
      paramList = ah.this.fsU;
      ah.this.fsU.getString(i.j.dxm);
      this.ilL = com.tencent.mm.ui.base.h.a(paramList, ah.this.fsU.getString(i.j.dvY), false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(8428336447488L, 62796);
          GMTrace.o(8428336447488L, 62796);
        }
      });
      GMTrace.o(8639058280448L, 64366);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae bgG()
    {
      GMTrace.i(8639192498176L, 64367);
      com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.bhc();
      GMTrace.o(8639192498176L, 64367);
      return localae;
    }
  }
  
  final class b
  {
    ArrayList<String> qEf;
    Map<String, Boolean> qEg;
    Map<String, Integer> qEh;
    
    b()
    {
      GMTrace.i(8364314591232L, 62319);
      this.qEf = new ArrayList();
      this.qEg = new HashMap();
      this.qEh = new HashMap();
      GMTrace.o(8364314591232L, 62319);
    }
    
    public final b Ik(String paramString)
    {
      int i = 0;
      GMTrace.i(8364717244416L, 62322);
      try
      {
        paramString = paramString.split(";");
        int j = paramString.length;
        while (i < j)
        {
          String[] arrayOfString = paramString[i].split(",");
          this.qEf.add(arrayOfString[0]);
          this.qEh.put(arrayOfString[0], Integer.valueOf(bg.getInt(arrayOfString[1], 0)));
          i += 1;
        }
        return this;
      }
      catch (Exception paramString)
      {
        GMTrace.o(8364717244416L, 62322);
      }
    }
    
    public final void R(ArrayList<String> paramArrayList)
    {
      GMTrace.i(17147791147008L, 127761);
      this.qEg.clear();
      if (paramArrayList == null)
      {
        this.qEf = new ArrayList();
        GMTrace.o(17147791147008L, 127761);
        return;
      }
      this.qEf = paramArrayList;
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        String str = (String)paramArrayList.next();
        this.qEg.put(str, Boolean.valueOf(false));
      }
      GMTrace.o(17147791147008L, 127761);
    }
    
    public final b m(String paramString, int paramInt, boolean paramBoolean)
    {
      GMTrace.i(17147656929280L, 127760);
      this.qEf.add(paramString);
      this.qEh.put(paramString, Integer.valueOf(paramInt));
      this.qEg.put(paramString, Boolean.valueOf(paramBoolean));
      GMTrace.o(17147656929280L, 127760);
      return this;
    }
    
    public final String toString()
    {
      GMTrace.i(8364583026688L, 62321);
      Iterator localIterator = this.qEf.iterator();
      String str2;
      int i;
      for (String str1 = ""; localIterator.hasNext(); str1 = str1 + str2 + "," + i + ";")
      {
        str2 = (String)localIterator.next();
        i = 0;
        if (this.qEh != null) {
          i = ((Integer)this.qEh.get(str2)).intValue();
        }
      }
      GMTrace.o(8364583026688L, 62321);
      return str1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */