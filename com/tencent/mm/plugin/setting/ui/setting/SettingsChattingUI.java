package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.a.nf;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SettingsChattingUI
  extends MMPreference
{
  private f ilZ;
  private boolean kgc;
  private ProgressDialog pqK;
  
  public SettingsChattingUI()
  {
    GMTrace.i(4661381693440L, 34730);
    this.pqK = null;
    this.kgc = false;
    GMTrace.o(4661381693440L, 34730);
  }
  
  protected final void MH()
  {
    GMTrace.i(4661650128896L, 34732);
    oC(R.l.eGO);
    this.ilZ = this.vOv;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4644336041984L, 34603);
        SettingsChattingUI.this.aKl();
        SettingsChattingUI.this.finish();
        GMTrace.o(4644336041984L, 34603);
        return true;
      }
    });
    GMTrace.o(4661650128896L, 34732);
  }
  
  public final int QD()
  {
    GMTrace.i(4661918564352L, 34734);
    int i = R.o.fil;
    GMTrace.o(4661918564352L, 34734);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = false;
    GMTrace.i(4662052782080L, 34735);
    paramf = paramPreference.iay;
    boolean bool1;
    if (paramf.equals("settings_voice_play_mode"))
    {
      ap.AS();
      boolean bool3 = ((Boolean)com.tencent.mm.x.c.xi().get(26, Boolean.valueOf(false))).booleanValue();
      if (!bool3) {}
      for (bool1 = true;; bool1 = false)
      {
        w.d("MicroMsg.SettingsChattingUI", "set voice mode from %B to %B", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
        ap.AS();
        paramf = com.tencent.mm.x.c.xi();
        bool1 = bool2;
        if (!bool3) {
          bool1 = true;
        }
        paramf.set(26, Boolean.valueOf(bool1));
        GMTrace.o(4662052782080L, 34735);
        return true;
      }
    }
    if (paramf.equals("settings_enter_button_send"))
    {
      paramf = (CheckBoxPreference)this.ilZ.UM("settings_enter_button_send");
      if (paramf != null)
      {
        bool1 = paramf.isChecked();
        w.d("MicroMsg.SettingsChattingUI", "set enter button send : %s", new Object[] { Boolean.valueOf(bool1) });
        ap.AS();
        com.tencent.mm.x.c.xi().set(66832, Boolean.valueOf(bool1));
      }
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    if (paramf.equals("settings_bak_chat"))
    {
      paramf = new Intent().setClassName(this.vov.voR, "com.tencent.mm.plugin.backup.backupmoveui.BackupUI");
      MMWizardActivity.A(this.vov.voR, paramf);
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    if (paramf.equals("settings_chatting_bg"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsChattingBackgroundUI.class);
      this.vov.voR.startActivity(paramf);
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    if (paramf.equals("settings_emoji_manager"))
    {
      paramf = new Intent();
      paramf.putExtra("10931", 2);
      com.tencent.mm.bi.d.b(this.vov.voR, "emoji", ".ui.EmojiMineUI", paramf);
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    if (paramf.equals("settings_reset"))
    {
      h.a(this.vov.voR, getResources().getString(R.l.eIA), "", getString(R.l.duQ), getString(R.l.duP), new DialogInterface.OnClickListener()
      {
        public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4672387547136L, 34812);
          g.paX.i(14553, new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
          g.paX.a(324L, 0L, 1L, false);
          SettingsChattingUI.a(SettingsChattingUI.this, false);
          paramAnonymousDialogInterface = SettingsChattingUI.this;
          Object localObject = SettingsChattingUI.this;
          SettingsChattingUI.this.getString(R.l.dxm);
          SettingsChattingUI.a(paramAnonymousDialogInterface, h.a((Context)localObject, SettingsChattingUI.this.getString(R.l.dxB), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(4645678219264L, 34613);
              SettingsChattingUI.a(SettingsChattingUI.this, true);
              GMTrace.o(4645678219264L, 34613);
            }
          }));
          ap.AS();
          paramAnonymousDialogInterface = com.tencent.mm.x.c.yN().aNo();
          if (paramAnonymousDialogInterface != null)
          {
            w.i("MicroMsg.WalletConvDelCheckLogic", "checkGetUnProcessorWalletConversation, msgInfoList size: %s", new Object[] { Integer.valueOf(paramAnonymousDialogInterface.size()) });
            localObject = new HashSet();
            paramAnonymousDialogInterface = paramAnonymousDialogInterface.iterator();
            while (paramAnonymousDialogInterface.hasNext())
            {
              au localau = (au)paramAnonymousDialogInterface.next();
              if (!((Set)localObject).contains(localau.field_talker))
              {
                ap.AS();
                if ((com.tencent.mm.x.c.yQ().SV(localau.field_talker) != null) && (com.tencent.mm.pluginsdk.wallet.d.V(localau))) {
                  ((Set)localObject).add(localau.field_talker);
                }
              }
            }
            paramAnonymousDialogInterface = new ArrayList();
            paramAnonymousDialogInterface.addAll((Collection)localObject);
          }
          while ((paramAnonymousDialogInterface != null) && (paramAnonymousDialogInterface.size() > 0))
          {
            SettingsChattingUI.a(SettingsChattingUI.this).dismiss();
            h.a(SettingsChattingUI.this, false, SettingsChattingUI.this.getString(R.l.eTZ, new Object[] { Integer.valueOf(paramAnonymousDialogInterface.size()) }), null, SettingsChattingUI.this.getString(R.l.eeC), SettingsChattingUI.this.getString(R.l.dKG), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(19533108609024L, 145533);
                g.paX.i(14553, new Object[] { Integer.valueOf(5), Integer.valueOf(4) });
                SettingsChattingUI.a(SettingsChattingUI.this, true);
                if (paramAnonymousDialogInterface.size() <= 1)
                {
                  paramAnonymous2DialogInterface = new Intent();
                  paramAnonymous2DialogInterface.putExtra("Chat_User", (String)paramAnonymousDialogInterface.get(0));
                  paramAnonymous2DialogInterface.addFlags(67108864);
                  com.tencent.mm.bi.d.a(SettingsChattingUI.this, ".ui.chatting.En_5b8fbb1e", paramAnonymous2DialogInterface);
                  GMTrace.o(19533108609024L, 145533);
                  return;
                }
                paramAnonymous2DialogInterface = new Intent();
                paramAnonymous2DialogInterface.putStringArrayListExtra("key_conversation_list", paramAnonymousDialogInterface);
                com.tencent.mm.bi.d.a(SettingsChattingUI.this, ".ui.conversation.SettingCheckUnProcessWalletConvUI", paramAnonymous2DialogInterface);
                GMTrace.o(19533108609024L, 145533);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(19533511262208L, 145536);
                g.paX.i(14553, new Object[] { Integer.valueOf(5), Integer.valueOf(3) });
                SettingsChattingUI.a(SettingsChattingUI.this).show();
                SettingsChattingUI.a(SettingsChattingUI.this, false);
                SettingsChattingUI.b(SettingsChattingUI.this);
                GMTrace.o(19533511262208L, 145536);
              }
            }, -1, R.e.aNn);
            GMTrace.o(4672387547136L, 34812);
            return;
            paramAnonymousDialogInterface = null;
          }
          SettingsChattingUI.b(SettingsChattingUI.this);
          GMTrace.o(4672387547136L, 34812);
        }
      }, null);
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    GMTrace.o(4662052782080L, 34735);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4661515911168L, 34731);
    super.onCreate(paramBundle);
    MH();
    GMTrace.o(4661515911168L, 34731);
  }
  
  protected void onResume()
  {
    GMTrace.i(4661784346624L, 34733);
    super.onResume();
    Object localObject = (CheckBoxPreference)this.ilZ.UM("settings_voice_play_mode");
    if (localObject != null)
    {
      ap.AS();
      ((CheckBoxPreference)localObject).vNl = ((Boolean)com.tencent.mm.x.c.xi().get(26, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).vOZ = false;
    }
    localObject = (CheckBoxPreference)this.ilZ.UM("settings_enter_button_send");
    if (localObject != null)
    {
      ap.AS();
      ((CheckBoxPreference)localObject).vNl = ((Boolean)com.tencent.mm.x.c.xi().get(66832, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).vOZ = false;
    }
    localObject = this.ilZ.UM("settings_text_size");
    if (localObject != null) {
      ((Preference)localObject).setSummary(getString(SetTextSizeUI.dd(this)));
    }
    this.ilZ.notifyDataSetChanged();
    GMTrace.o(4661784346624L, 34733);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */