package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.Window;
import android.widget.Gallery;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.messenger.a.c;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.g.b;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SnsGalleryUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private int qGO;
  private String userName;
  
  public SnsGalleryUI()
  {
    GMTrace.i(8397063716864L, 62563);
    this.qGO = 0;
    this.userName = "";
    GMTrace.o(8397063716864L, 62563);
  }
  
  protected final void MH()
  {
    GMTrace.i(8398003240960L, 62570);
    this.userName = getIntent().getStringExtra("sns_gallery_userName");
    int i = getIntent().getIntExtra("sns_gallery_localId", 0);
    final boolean bool = getIntent().getBooleanExtra("sns_gallery_is_self", false);
    this.qGO = getIntent().getIntExtra("sns_gallery_position", 0);
    bV(u.W("sns_table_", i), this.qGO);
    o(bool, 1);
    this.qGM = new SnsInfoFlip(this);
    this.qGM.qAU = true;
    Object localObject = ae.bhf();
    String str = this.userName;
    if (((al.a)localObject).qeB.containsKey(str))
    {
      i = ((Integer)((al.a)localObject).qeB.get(str)).intValue();
      ((al.a)localObject).qeB.put(str, Integer.valueOf(i + 1));
      localObject = (ArrayList)((al.a)localObject).qeA.get(str);
      if (localObject != null) {
        break label411;
      }
      localObject = new ArrayList();
    }
    label411:
    for (;;)
    {
      this.qGM.qJH = true;
      this.qGM.qJJ = true;
      this.qGM.qJK = false;
      this.qGM.a((List)localObject, this.userName, this.qGO, this.qGH, this);
      this.qGM.qJP = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8737171439616L, 65097);
          SnsGalleryUI.this.qGJ.blD();
          GMTrace.o(8737171439616L, 65097);
        }
      };
      com.tencent.mm.kernel.h.xA();
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(this.userName);
      if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).gLS > 0) && (com.tencent.mm.l.a.eE(((af)localObject).field_type))) {
        localObject = an.bQv();
      }
      for (;;)
      {
        this.qGM.pYm = ((an)localObject);
        this.qGM.username = this.userName;
        addView(this.qGM);
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(8465917411328L, 63076);
            SnsGalleryUI.this.qGJ.blD();
            GMTrace.o(8465917411328L, 63076);
            return true;
          }
        });
        a(0, i.e.baG, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(8536113283072L, 63599);
            paramAnonymousMenuItem = SnsGalleryUI.this.qGM;
            Object localObject;
            label46:
            b localb;
            if (paramAnonymousMenuItem.qJB == null)
            {
              paramAnonymousMenuItem = "";
              localObject = SnsGalleryUI.this.qGM;
              if (((SnsInfoFlip)localObject).qJB != null) {
                break label214;
              }
              localObject = null;
              localb = SnsGalleryUI.this.qGM.bmY();
              w.d("MicroMsg.SnsGalleryUI", "click selectLocalId " + paramAnonymousMenuItem);
              w.d("MicroMsg.SnsGalleryUI", "click position " + (String)localObject);
              paramAnonymousMenuItem = ae.bhp().HA(paramAnonymousMenuItem);
            }
            for (;;)
            {
              try
              {
                i = SnsGalleryUI.this.qGM.qJS;
                int j = paramAnonymousMenuItem.bjL().uyu.tKd.size();
                if ((j <= 1) || (i <= 1) || (i > j)) {
                  continue;
                }
                i -= 1;
                SnsGalleryUI.this.qGJ.a(bool, paramAnonymousMenuItem, localb.fNf, true, i);
              }
              catch (Exception paramAnonymousMenuItem)
              {
                int i;
                label214:
                w.printErrStackTrace("MicroMsg.SnsGalleryUI", paramAnonymousMenuItem, "", new Object[0]);
                continue;
              }
              GMTrace.o(8536113283072L, 63599);
              return true;
              paramAnonymousMenuItem = (b)paramAnonymousMenuItem.qJB.getSelectedItem();
              if (paramAnonymousMenuItem == null)
              {
                paramAnonymousMenuItem = "";
                break;
              }
              paramAnonymousMenuItem = paramAnonymousMenuItem.qhV;
              break;
              localObject = (b)((SnsInfoFlip)localObject).qJB.getSelectedItem();
              if (localObject == null)
              {
                localObject = null;
                break label46;
              }
              localObject = ((b)localObject).fNf.nas;
              break label46;
              i = 0;
            }
          }
        });
        GMTrace.o(8398003240960L, 62570);
        return;
        ((al.a)localObject).qeB.put(str, Integer.valueOf(0));
        break;
        localObject = com.tencent.mm.x.m.zF();
        if (this.userName.equals(localObject)) {
          localObject = an.bQw();
        } else {
          localObject = an.bQx();
        }
      }
    }
  }
  
  public final void bU(String paramString, int paramInt)
  {
    GMTrace.i(8398137458688L, 62571);
    if (this.qGM != null)
    {
      if ((!bg.mZ(paramString)) && (paramInt != 3))
      {
        SnsInfoFlip localSnsInfoFlip = this.qGM;
        if (localSnsInfoFlip.hip != null)
        {
          paramInt = 0;
          if (paramInt >= 0)
          {
            label45:
            if (paramInt < localSnsInfoFlip.hip.size())
            {
              b localb = (b)localSnsInfoFlip.hip.get(paramInt);
              if ((!bg.mZ(localb.qhV)) && (localb.qhV.equals(paramString))) {
                localSnsInfoFlip.hip.remove(paramInt);
              }
            }
            for (;;)
            {
              break;
              paramInt += 1;
              break label45;
              paramInt = -1;
            }
          }
          localSnsInfoFlip.qJA.notifyDataSetChanged();
        }
      }
      this.qGM.awa();
    }
    GMTrace.o(8398137458688L, 62571);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8397869023232L, 62569);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsGalleryUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.qGJ.qBC);
      setResult(-1, paramKeyEvent);
      finish();
      GMTrace.o(8397869023232L, 62569);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8397869023232L, 62569);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8397734805504L, 62568);
    int i = i.g.pOP;
    GMTrace.o(8397734805504L, 62568);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8398271676416L, 62572);
    w.i("MicroMsg.SnsGalleryUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(8398271676416L, 62572);
      return;
    }
    String str2;
    String str1;
    if (2 == paramInt1)
    {
      if (-1 != paramInt2) {
        break label537;
      }
      str2 = paramIntent.getStringExtra("Select_Conv_User");
      str1 = paramIntent.getStringExtra("custom_send_text");
      if (this.qGM == null) {
        break label560;
      }
      paramIntent = this.qGM.bmY();
      if (paramIntent.fNf.jXP != 6)
      {
        GMTrace.o(8398271676416L, 62572);
        return;
      }
    }
    label537:
    label560:
    for (Object localObject2 = paramIntent.fNf;; localObject2 = null)
    {
      if (localObject2 == null)
      {
        GMTrace.o(8398271676416L, 62572);
        return;
      }
      String str3 = am.dt(ae.getAccSnsPath(), ((amn)localObject2).nas);
      paramIntent = "";
      Object localObject1 = "";
      String str4 = i.j((amn)localObject2);
      if (FileOp.aZ(str3 + str4))
      {
        localObject1 = str3 + str4;
        paramIntent = str3 + i.e((amn)localObject2);
      }
      if (FileOp.aZ(str3 + i.p((amn)localObject2))) {
        paramIntent = str3 + i.p((amn)localObject2);
      }
      for (localObject1 = str3 + i.n((amn)localObject2);; localObject1 = localObject2)
      {
        localObject2 = bg.f(str2.split(","));
        paramInt1 = i.Gl(paramIntent);
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          str2 = (String)((Iterator)localObject2).next();
          w.i("MicroMsg.SnsGalleryUI", "send sight to %s, videopath %s, thumbpath %s duration %d", new Object[] { str2, paramIntent, localObject1, Integer.valueOf(paramInt1) });
          d.aNb().a(this, str2, paramIntent, (String)localObject1, 62, paramInt1, "");
          d.aNb().cM(str1, str2);
        }
        com.tencent.mm.ui.snackbar.a.e(this, getString(i.j.egk));
        GMTrace.o(8398271676416L, 62572);
        return;
        if (1 == paramInt1)
        {
          paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
          localObject1 = u.W("sns_table_", paramIntent.getIntExtra("sns_gallery_op_id", 0));
          this.qGJ.uL(paramInt1);
          bU((String)localObject1, 1);
          if (paramIntent.getBooleanExtra("sns_gallery_force_finish", false))
          {
            paramIntent = new Intent();
            paramIntent.putExtra("sns_cmd_list", this.qGJ.qBC);
            setResult(-1, paramIntent);
            finish();
          }
        }
        GMTrace.o(8398271676416L, 62572);
        return;
        localObject2 = paramIntent;
        paramIntent = (Intent)localObject1;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8397197934592L, 62564);
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    MH();
    GMTrace.o(8397197934592L, 62564);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8397332152320L, 62565);
    if (this.qGM != null)
    {
      this.qGM.bna();
      this.qGM.onDestroy();
    }
    getWindow().clearFlags(128);
    al.a locala = ae.bhf();
    String str = this.userName;
    int i;
    if (locala.qeB.containsKey(str))
    {
      i = Math.max(((Integer)locala.qeB.get(str)).intValue() - 1, 0);
      locala.qeB.put(str, Integer.valueOf(i));
    }
    for (;;)
    {
      if (i <= 0) {
        locala.qeA.remove(str);
      }
      ae.bhm().I(this);
      super.onDestroy();
      GMTrace.o(8397332152320L, 62565);
      return;
      i = 0;
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(8397466370048L, 62566);
    super.onPause();
    GMTrace.o(8397466370048L, 62566);
  }
  
  public void onResume()
  {
    GMTrace.i(8397600587776L, 62567);
    super.onResume();
    if (this.qGM != null) {
      this.qGM.awa();
    }
    GMTrace.o(8397600587776L, 62567);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */