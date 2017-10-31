package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.rd;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aeb;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.x.ap;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class IPCallDialUI
  extends MMActivity
  implements e, b.a
{
  private TextView ijm;
  private String mHB;
  private DialPad naM;
  private TextView naN;
  private EditText naO;
  private View naP;
  private ImageButton naQ;
  private View naR;
  private TextView naS;
  private TextView naT;
  private b ndh;
  private String ndi;
  private String ndj;
  private String ndk;
  private String ndl;
  private int ndm;
  private int ndn;
  private int ndo;
  private LinkedList<boi> ndp;
  com.tencent.mm.plugin.ipcall.a.d.b ndq;
  com.tencent.mm.plugin.ipcall.a.d.c ndr;
  private com.tencent.mm.sdk.b.c nds;
  
  public IPCallDialUI()
  {
    GMTrace.i(11717073436672L, 87299);
    this.ndm = 0;
    this.ndn = 0;
    this.ndo = -1;
    this.nds = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(11717073436672L, 87299);
  }
  
  private void aIj()
  {
    GMTrace.i(11718818267136L, 87312);
    w.i("MicroMsg.IPCallDialUI", "modifyCountryCodeByUsder");
    this.ndo = 2;
    if (this.ndn == 1)
    {
      this.ndn = 2;
      GMTrace.o(11718818267136L, 87312);
      return;
    }
    this.ndn = 4;
    GMTrace.o(11718818267136L, 87312);
  }
  
  private void init()
  {
    GMTrace.i(11717744525312L, 87304);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
    w.i("MicroMsg.IPCallDialUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bOd() });
    if (!bool)
    {
      GMTrace.o(11717744525312L, 87304);
      return;
    }
    oC(R.l.ehD);
    setVolumeControlStream(1);
    this.naM = ((DialPad)findViewById(R.h.bBK));
    this.naN = ((TextView)findViewById(R.h.bzr));
    this.naR = findViewById(R.h.bzp);
    this.naO = ((EditText)findViewById(R.h.cjC));
    this.naP = findViewById(R.h.cjB);
    this.ijm = ((TextView)findViewById(R.h.bBM));
    this.naQ = ((ImageButton)findViewById(R.h.bBu));
    this.naS = ((TextView)findViewById(R.h.bzt));
    this.naT = ((TextView)findViewById(R.h.bBx));
    this.ndh = new b(this, this.naO, this.naN, this.naP, this.naM, this.naQ, this.ijm, this.naR, this.naS, this.naT);
    this.ndh.naL = this;
    if (!bg.mZ(this.ndi)) {
      this.ndh.bi(this.ndi, -1);
    }
    if (!bg.mZ(this.ndk)) {
      this.ndh.zM(this.ndk);
    }
    if ((!bg.mZ(this.ndi)) && (!bg.mZ(this.ndk))) {
      this.ndh.aHZ();
    }
    this.ndh.X(this.ndp);
    GMTrace.o(11717744525312L, 87304);
  }
  
  protected final int Qb()
  {
    GMTrace.i(11717207654400L, 87300);
    GMTrace.o(11717207654400L, 87300);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11718415613952L, 87309);
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.b))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramk == this.ndq))
      {
        if (this.ndq.mZa != null) {
          w.i("MicroMsg.IPCallDialUI", "Response Result:%d,PureNumber:%s,CountryCode:%s", new Object[] { Integer.valueOf(this.ndq.mZa.tIb), this.ndq.mZa.uoN, this.ndq.mZa.nif });
        }
        if (this.ndo != 2)
        {
          this.ndo = 1;
          this.ndn = 1;
          paramString = this.ndq;
          if ((paramString.mZa != null) && (paramString.mZa.tIb == 2)) {}
          for (paramInt1 = 1; paramInt1 != 0; paramInt1 = 0)
          {
            w.i("MicroMsg.IPCallDialUI", "check error show error dialog");
            GMTrace.o(11718415613952L, 87309);
            return;
          }
          paramString = this.ndq;
          if ((paramString.mZa != null) && ((paramString.mZa.tIb == 1) || (paramString.mZa.tIb == 0)))
          {
            paramInt1 = 1;
            if (paramInt1 != 0)
            {
              if ((this.ndq.mZa == null) || (bg.mZ(this.ndq.mZa.nif))) {
                break label412;
              }
              if (this.ndh != null)
              {
                w.i("MicroMsg.IPCallDialUI", "response country code:%s, old country code:%s", new Object[] { this.ndq.mZa.nif, this.ndk });
                this.ndk = this.ndq.mZa.nif;
                this.ndh.zM(this.ndq.mZa.nif);
              }
            }
          }
          for (;;)
          {
            if ((this.ndq.mZa == null) || (bg.mZ(this.ndq.mZa.uoN)) || (this.ndh == null)) {
              break label489;
            }
            w.i("MicroMsg.IPCallDialUI", "response number:%s, old number:%s", new Object[] { this.ndq.mZa.uoN, this.ndi });
            this.ndi = this.ndq.mZa.uoN;
            this.ndh.bi(this.ndq.mZa.uoN, -1);
            GMTrace.o(11718415613952L, 87309);
            return;
            paramInt1 = 0;
            break;
            label412:
            w.i("MicroMsg.IPCallDialUI", "response country code is empty, ignore");
          }
        }
        w.i("MicroMsg.IPCallDialUI", "NetSceneIPCallCheckNumber onSceneEnd, mCheckNumberStatus = userModify, ignore");
        GMTrace.o(11718415613952L, 87309);
      }
    }
    else if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.c)) {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label498;
      }
    }
    label489:
    label498:
    for (this.ndp = ((com.tencent.mm.plugin.ipcall.a.d.c)paramk).mZc.tZL;; this.ndp = null)
    {
      if (this.ndh != null) {
        this.ndh.X(this.ndp);
      }
      GMTrace.o(11718415613952L, 87309);
      return;
    }
  }
  
  public final void g(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(11718012960768L, 87306);
    w.i("MicroMsg.IPCallDialUI", "onDial, countryCode: %s, phoneNumber: %s, contactId: %s, nickname: %s", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    if (!com.tencent.mm.plugin.ipcall.b.c.cJ(this))
    {
      GMTrace.o(11718012960768L, 87306);
      return;
    }
    if (com.tencent.mm.plugin.ipcall.a.c.aGX().pa(bg.getInt(paramString1, -1)))
    {
      h.b(this, getString(R.l.dEp), getString(R.l.dEq), true);
      g.paX.z(12058, paramString1);
      GMTrace.o(11718012960768L, 87306);
      return;
    }
    g.paX.i(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    Intent localIntent = new Intent(this, IPCallTalkUI.class);
    localIntent.putExtra("IPCallTalkUI_contactId", paramString3);
    localIntent.putExtra("IPCallTalkUI_countryCode", paramString1);
    localIntent.putExtra("IPCallTalkUI_nickname", paramString4);
    localIntent.putExtra("IPCallTalkUI_phoneNumber", paramString2);
    localIntent.putExtra("IPCallTalkUI_dialScene", this.ndm);
    localIntent.putExtra("IPCallTalkUI_countryType", this.ndn);
    startActivityForResult(localIntent, 1001);
    GMTrace.o(11718012960768L, 87306);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11717610307584L, 87303);
    int i = R.i.cXR;
    GMTrace.o(11717610307584L, 87303);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11717878743040L, 87305);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    b localb = this.ndh;
    w.d("MicroMsg.DialPadController", "onActivityResult");
    if ((paramInt1 == 100) && (paramInt2 == 100))
    {
      String str = bg.ap(paramIntent.getStringExtra("country_name"), "");
      paramIntent = bg.ap(paramIntent.getStringExtra("couttry_code"), "");
      w.d("MicroMsg.DialPadController", "onActivityResult, countryName: %s, countryCode: %s", new Object[] { paramIntent, str });
      if ((!bg.mZ(paramIntent)) && (!bg.mZ(str)))
      {
        localb.naV = str;
        localb.naW = ("+" + paramIntent);
        localb.naN.setText(localb.naW);
        localb.naX = localb.cz(paramIntent.replace("+", ""), localb.naX);
        localb.bi(localb.naX, -1);
        localb.nbb = false;
      }
      GMTrace.o(11717878743040L, 87305);
      return;
    }
    if ((paramInt1 == 1001) && (paramInt2 == -1))
    {
      paramIntent.getBooleanExtra("IPCallTalkUI_TalkIsOverdue", false);
      localb.fsU.setResult(-1, paramIntent);
      localb.fsU.finish();
    }
    GMTrace.o(11717878743040L, 87305);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11717341872128L, 87301);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.uLm.b(this.nds);
    ap.wT().a(807, this);
    ap.wT().a(746, this);
    getWindow().addFlags(131072);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11635200622592L, 86689);
        IPCallDialUI.this.finish();
        GMTrace.o(11635200622592L, 86689);
        return true;
      }
    }, R.k.aVy);
    this.mHB = getIntent().getStringExtra("IPCallTalkUI_nickname");
    this.ndi = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
    this.ndj = getIntent().getStringExtra("IPCallTalkUI_contactId");
    this.ndk = getIntent().getStringExtra("IPCallTalkUI_countryCode");
    this.ndl = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
    this.ndm = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
    w.i("MicroMsg.IPCallDialUI", "onCreate nickName:%s, phoneNumber:%s, contactId:%s, countryCode:%s, toUserName:%s, dialScene:%d", new Object[] { this.mHB, this.ndi, this.ndj, this.ndk, this.ndl, Integer.valueOf(this.ndm) });
    if (!bg.mZ(this.ndi)) {
      this.ndi = com.tencent.mm.plugin.ipcall.b.c.Ao(this.ndi);
    }
    if (bg.mZ(this.ndk))
    {
      if (com.tencent.mm.plugin.ipcall.b.a.Ai(this.ndi))
      {
        if (bg.mZ(com.tencent.mm.plugin.ipcall.b.a.Ag(this.ndi))) {
          this.ndi = com.tencent.mm.plugin.ipcall.b.a.Aj(this.ndi);
        }
      }
      else {
        this.ndk = com.tencent.mm.plugin.ipcall.b.c.aID();
      }
    }
    else
    {
      if (this.ndm == 1) {
        break label477;
      }
      this.ndo = 0;
      this.ndn = 3;
      this.ndq = new com.tencent.mm.plugin.ipcall.a.d.b(this.ndi, this.ndk, "", bg.bOa(), this.ndm);
      ap.wT().a(this.ndq, 0);
    }
    for (;;)
    {
      init();
      GMTrace.o(11717341872128L, 87301);
      return;
      w.i("MicroMsg.IPCallDialUI", "country code exist, directly go to talk ui.");
      this.ndn = 4;
      paramBundle = new Intent(this, IPCallTalkUI.class);
      paramBundle.putExtra("IPCallTalkUI_contactId", this.ndj);
      paramBundle.putExtra("IPCallTalkUI_countryCode", this.ndk);
      paramBundle.putExtra("IPCallTalkUI_nickname", this.mHB);
      paramBundle.putExtra("IPCallTalkUI_phoneNumber", this.ndi);
      paramBundle.putExtra("IPCallTalkUI_dialScene", this.ndm);
      paramBundle.putExtra("IPCallTalkUI_countryType", this.ndn);
      startActivityForResult(paramBundle, 1001);
      finish();
      GMTrace.o(11717341872128L, 87301);
      return;
      label477:
      this.ndo = -1;
      this.ndn = 4;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11718147178496L, 87307);
    super.onDestroy();
    if (this.ndh != null) {
      this.ndh.naL = null;
    }
    com.tencent.mm.sdk.b.a.uLm.c(this.nds);
    ap.wT().b(807, this);
    ap.wT().b(746, this);
    GMTrace.o(11718147178496L, 87307);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11718281396224L, 87308);
    w.i("MicroMsg.IPCallDialUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11718281396224L, 87308);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        init();
        GMTrace.o(11718281396224L, 87308);
        return;
      }
      h.a(this, getString(R.l.etT), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11663252127744L, 86898);
          paramAnonymousDialogInterface.dismiss();
          IPCallDialUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11663252127744L, 86898);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11699490914304L, 87168);
          paramAnonymousDialogInterface.dismiss();
          IPCallDialUI.this.finish();
          GMTrace.o(11699490914304L, 87168);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(11717476089856L, 87302);
    w.d("MicroMsg.IPCallDialUI", "onResume");
    super.onResume();
    GMTrace.o(11717476089856L, 87302);
  }
  
  public void onStart()
  {
    GMTrace.i(15075872079872L, 112324);
    super.onStart();
    this.ndr = new com.tencent.mm.plugin.ipcall.a.d.c();
    ap.wT().a(this.ndr, 0);
    GMTrace.o(15075872079872L, 112324);
  }
  
  public final void zN(String paramString)
  {
    GMTrace.i(11718549831680L, 87310);
    w.i("MicroMsg.IPCallDialUI", "onModifyCountryCodeByUser:countryCode:%s,mCountryCode:%s", new Object[] { paramString, this.ndk });
    if ((this.ndo != 2) && (this.ndo != -1) && (!this.ndk.equals(paramString))) {
      aIj();
    }
    GMTrace.o(11718549831680L, 87310);
  }
  
  public final void zO(String paramString)
  {
    GMTrace.i(11718684049408L, 87311);
    w.i("MicroMsg.IPCallDialUI", "onModifyPhoneNumberByUser:phoneNumber:%s,mPhoneNumber:%s", new Object[] { paramString, this.ndi });
    if ((this.ndo != 2) && (this.ndo != -1) && (!this.ndi.equals(paramString))) {
      aIj();
    }
    GMTrace.o(11718684049408L, 87311);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallDialUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */