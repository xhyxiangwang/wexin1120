package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.ui.e.b;
import com.tencent.mm.wallet_core.ui.e.c;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ae
{
  public int aGW;
  public Bankcard rCP;
  ArrayList<Bankcard> rEU;
  ArrayList<Bankcard> rEV;
  public String rRA;
  public String rRB;
  private ArrayList<Bankcard> rRo;
  public ad rRp;
  public Bankcard rRq;
  ac rRr;
  public j rRs;
  public b rRt;
  private List<c> rRu;
  public Bankcard rRv;
  public long rRw;
  public long rRx;
  private String rRy;
  public int rRz;
  
  public ae()
  {
    GMTrace.i(6892617203712L, 51354);
    this.rRo = new ArrayList();
    this.rEU = new ArrayList();
    this.rEV = new ArrayList();
    this.rRp = null;
    this.rRq = null;
    this.rCP = null;
    this.rRr = null;
    this.rRs = null;
    this.rRt = null;
    this.rRu = new LinkedList();
    this.rRv = null;
    this.rRw = bg.Po();
    this.rRx = -1L;
    this.rRy = "";
    this.rRz = 10000;
    this.aGW = 0;
    this.rRA = "";
    this.rRB = "";
    bxh();
    GMTrace.o(6892617203712L, 51354);
  }
  
  public static void Js(String paramString)
  {
    GMTrace.i(6895838429184L, 51378);
    if (!bg.mZ(paramString))
    {
      ap.AS();
      com.tencent.mm.x.c.xi().set(196612, paramString);
    }
    GMTrace.o(6895838429184L, 51378);
  }
  
  public static boolean bG(List<Bankcard> paramList)
  {
    GMTrace.i(6895301558272L, 51374);
    if (paramList.size() == 0)
    {
      GMTrace.o(6895301558272L, 51374);
      return false;
    }
    ap.AS();
    Object localObject = (String)com.tencent.mm.x.c.xi().get(196659, null);
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      GMTrace.o(6895301558272L, 51374);
      return true;
    }
    localObject = ((String)localObject).split("&");
    if ((localObject == null) || (localObject.length == 0))
    {
      GMTrace.o(6895301558272L, 51374);
      return true;
    }
    int i = 0;
    int j = 0;
    if (i < localObject.length)
    {
      CharSequence localCharSequence = localObject[i];
      int k = j;
      int m;
      if (!TextUtils.isEmpty(localCharSequence)) {
        m = 0;
      }
      for (;;)
      {
        k = j;
        if (m < paramList.size())
        {
          Bankcard localBankcard = (Bankcard)paramList.get(m);
          if ((localBankcard != null) && (localCharSequence.equals(localBankcard.field_bankcardType))) {
            k = j + 1;
          }
        }
        else
        {
          i += 1;
          j = k;
          break;
        }
        m += 1;
      }
    }
    if (j < paramList.size())
    {
      GMTrace.o(6895301558272L, 51374);
      return true;
    }
    GMTrace.o(6895301558272L, 51374);
    return false;
  }
  
  private void bxm()
  {
    GMTrace.i(6896241082368L, 51381);
    w.i("MicroMsg.WalletUserInfoManger", "recordDataState()");
    if (this.rRp == null) {
      w.i("MicroMsg.WalletUserInfoManger", "userInfo == null");
    }
    if (this.rEU == null)
    {
      w.i("MicroMsg.WalletUserInfoManger", "bankcards == null");
      if (this.rEV != null) {
        break label158;
      }
      w.i("MicroMsg.WalletUserInfoManger", "virtualBankcards == null");
      label57:
      if (this.rCP != null) {
        break label208;
      }
      w.i("MicroMsg.WalletUserInfoManger", "balance == null");
      label71:
      if (this.rRq != null) {
        break label218;
      }
      w.i("MicroMsg.WalletUserInfoManger", "historyBankcard == null");
    }
    for (;;)
    {
      if (this.rRs != null) {
        break label228;
      }
      w.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo == null");
      GMTrace.o(6896241082368L, 51381);
      return;
      if (this.rEU.size() == 0)
      {
        w.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == 0");
        break;
      }
      w.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == " + this.rEU.size());
      break;
      label158:
      if (this.rEV.size() == 0)
      {
        w.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == 0");
        break label57;
      }
      w.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == " + this.rEV.size());
      break label57;
      label208:
      w.i("MicroMsg.WalletUserInfoManger", "balance != null");
      break label71;
      label218:
      w.i("MicroMsg.WalletUserInfoManger", "historyBankcard != null");
    }
    label228:
    w.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo != null");
    GMTrace.o(6896241082368L, 51381);
  }
  
  public final boolean Jr(String paramString)
  {
    GMTrace.i(6895435776000L, 51375);
    if (bg.mZ(paramString))
    {
      GMTrace.o(6895435776000L, 51375);
      return false;
    }
    Iterator localIterator;
    Bankcard localBankcard;
    if (this.rEU != null)
    {
      localIterator = this.rEU.iterator();
      while (localIterator.hasNext())
      {
        localBankcard = (Bankcard)localIterator.next();
        if ((paramString.equals(localBankcard.field_bankcardType)) && (localBankcard.bwl()))
        {
          GMTrace.o(6895435776000L, 51375);
          return false;
        }
      }
    }
    if (this.rEV != null)
    {
      localIterator = this.rEV.iterator();
      while (localIterator.hasNext())
      {
        localBankcard = (Bankcard)localIterator.next();
        if ((paramString.equals(localBankcard.field_bankcardType)) && (localBankcard.field_bankcardState == 0))
        {
          GMTrace.o(6895435776000L, 51375);
          return false;
        }
      }
    }
    GMTrace.o(6895435776000L, 51375);
    return true;
  }
  
  public final Bankcard a(ArrayList<Bankcard> paramArrayList, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(6895972646912L, 51379);
    Object localObject = paramArrayList;
    if (paramArrayList == null) {
      localObject = this.rEU;
    }
    paramArrayList = paramString;
    if (bg.mZ(paramString))
    {
      ap.AS();
      paramArrayList = (String)com.tencent.mm.x.c.xi().get(196612, null);
    }
    if ((paramBoolean1) && (this.rCP != null))
    {
      if (bwZ())
      {
        paramArrayList = this.rCP;
        GMTrace.o(6895972646912L, 51379);
        return paramArrayList;
      }
      if ((paramArrayList != null) && (paramArrayList.equals(this.rCP.field_bindSerial)))
      {
        paramArrayList = this.rCP;
        GMTrace.o(6895972646912L, 51379);
        return paramArrayList;
      }
      if ((this.rRv != null) && (this.rRp != null) && (this.rRp.field_lqt_state == 1) && (paramArrayList != null) && (paramArrayList.equals(this.rRv.field_bindSerial)))
      {
        paramArrayList = this.rRv;
        GMTrace.o(6895972646912L, 51379);
        return paramArrayList;
      }
      if ((!bwV()) && ((localObject == null) || (((ArrayList)localObject).size() == 0)))
      {
        paramArrayList = this.rCP;
        GMTrace.o(6895972646912L, 51379);
        return paramArrayList;
      }
    }
    if ((localObject == null) || (((ArrayList)localObject).size() <= 0))
    {
      w.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
      GMTrace.o(6895972646912L, 51379);
      return null;
    }
    if ((((ArrayList)localObject).size() == 1) && (paramBoolean2))
    {
      w.e("MicroMsg.WalletUserInfoManger", "only one bankcard!");
      paramArrayList = (Bankcard)((ArrayList)localObject).get(0);
      GMTrace.o(6895972646912L, 51379);
      return paramArrayList;
    }
    w.i("MicroMsg.WalletUserInfoManger", "have multiple bankcards!");
    if (!bg.mZ(paramArrayList))
    {
      paramString = ((ArrayList)localObject).iterator();
      while (paramString.hasNext())
      {
        Bankcard localBankcard = (Bankcard)paramString.next();
        if ((localBankcard != null) && (paramArrayList.equals(localBankcard.field_bindSerial)))
        {
          GMTrace.o(6895972646912L, 51379);
          return localBankcard;
        }
      }
    }
    if (paramBoolean2)
    {
      paramArrayList = (Bankcard)((ArrayList)localObject).get(0);
      GMTrace.o(6895972646912L, 51379);
      return paramArrayList;
    }
    GMTrace.o(6895972646912L, 51379);
    return null;
  }
  
  public final void a(ad paramad, ArrayList<Bankcard> paramArrayList1, ArrayList<Bankcard> paramArrayList2, Bankcard paramBankcard1, Bankcard paramBankcard2, j paramj, b paramb, Bankcard paramBankcard3, int paramInt1, int paramInt2, List<c> paramList)
  {
    GMTrace.i(18040607473664L, 134413);
    w.i("MicroMsg.WalletUserInfoManger", "setBankcards scene %d", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt2 == 8) {
      this.rRo = paramArrayList1;
    }
    this.rRu = paramList;
    this.rRp = paramad;
    this.rEU = paramArrayList1;
    this.rEV = paramArrayList2;
    this.rCP = paramBankcard1;
    this.rRr = new ac(paramad.field_switchConfig);
    this.rRq = paramBankcard2;
    this.rRs = paramj;
    this.rRt = paramb;
    this.rRv = paramBankcard3;
    w.i("MicroMsg.WalletUserInfoManger", "setBankcards()! " + paramad.field_switchConfig);
    bxm();
    paramInt2 = paramInt1;
    if (paramInt1 < 0) {
      paramInt2 = 600;
    }
    this.rRw = (bg.Po() + paramInt2);
    w.i("MicroMsg.WalletUserInfoManger", "hy: cache time: %d, dead time: %d", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(this.rRw) });
    m.bwC().gMB.eL("WalletBankcard", "delete from WalletBankcard");
    if (paramArrayList1 != null) {
      m.bwC().bI(paramArrayList1);
    }
    if (paramArrayList2 != null) {
      m.bwC().bI(paramArrayList2);
    }
    if (paramBankcard1 != null) {
      m.bwC().d(paramBankcard1);
    }
    if (paramBankcard2 != null) {
      m.bwC().d(paramBankcard2);
    }
    if (paramBankcard3 != null) {
      m.bwC().d(paramBankcard3);
    }
    m.bwA().gMB.eL("WalletUserInfo", "delete from WalletUserInfo");
    m.bwA().a(paramad);
    m.bwG().gMB.eL("LoanEntryInfo", "delete from LoanEntryInfo");
    if (paramj != null) {
      m.bwG().b(paramj);
    }
    GMTrace.o(18040607473664L, 134413);
  }
  
  public final String aoj()
  {
    GMTrace.i(6893825163264L, 51363);
    if (this.rRp != null)
    {
      String str = this.rRp.field_true_name;
      GMTrace.o(6893825163264L, 51363);
      return str;
    }
    GMTrace.o(6893825163264L, 51363);
    return null;
  }
  
  public final void axG()
  {
    GMTrace.i(6894496251904L, 51368);
    if (this.rRp != null)
    {
      this.rRp.field_is_reg = -1;
      this.rRp = null;
    }
    if (this.rRr != null) {
      this.rRr = null;
    }
    if (this.rCP != null) {
      this.rCP = null;
    }
    if (this.rEU != null)
    {
      this.rEU.clear();
      this.rEU = null;
    }
    if (this.rEV != null)
    {
      this.rEV.clear();
      this.rEV = null;
    }
    com.tencent.mm.wallet_core.ui.e.a(new e.c[] { new e.c("wallet_balance_version", Integer.valueOf(-1)), new e.c("wallet_balance_last_update_time", Integer.valueOf(-1)), new e.c("wallet_balance", Integer.valueOf(-1)) });
    this.rRw = bg.Po();
    GMTrace.o(6894496251904L, 51368);
  }
  
  public final boolean bwV()
  {
    GMTrace.i(6893019856896L, 51357);
    if ((this.rRp != null) && (this.rRp.bwV()))
    {
      GMTrace.o(6893019856896L, 51357);
      return true;
    }
    GMTrace.o(6893019856896L, 51357);
    return false;
  }
  
  public final boolean bwX()
  {
    GMTrace.i(6892751421440L, 51355);
    if ((this.rRp == null) || ((this.rRp != null) && (this.rRp.bwW())))
    {
      GMTrace.o(6892751421440L, 51355);
      return true;
    }
    GMTrace.o(6892751421440L, 51355);
    return false;
  }
  
  public final boolean bwY()
  {
    GMTrace.i(6892885639168L, 51356);
    if (this.rRp != null)
    {
      if (this.rRp.field_is_reg == 1) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(6892885639168L, 51356);
        return true;
      }
    }
    GMTrace.o(6892885639168L, 51356);
    return false;
  }
  
  public final boolean bwZ()
  {
    GMTrace.i(6893154074624L, 51358);
    if (this.rRp != null)
    {
      if (this.rRp.field_is_reg == 2) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(6893154074624L, 51358);
        return true;
      }
    }
    GMTrace.o(6893154074624L, 51358);
    return false;
  }
  
  public final boolean bxa()
  {
    GMTrace.i(6893288292352L, 51359);
    if (this.rRp != null)
    {
      if (this.rRp.field_is_open_touch == 1) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(6893288292352L, 51359);
        return true;
      }
    }
    GMTrace.o(6893288292352L, 51359);
    return false;
  }
  
  public final String bxb()
  {
    GMTrace.i(6893422510080L, 51360);
    if (this.rRp != null)
    {
      String str = this.rRp.field_ftf_pay_url;
      GMTrace.o(6893422510080L, 51360);
      return str;
    }
    GMTrace.o(6893422510080L, 51360);
    return null;
  }
  
  public final ac bxc()
  {
    GMTrace.i(6893556727808L, 51361);
    if (this.rRr == null)
    {
      localac = new ac();
      GMTrace.o(6893556727808L, 51361);
      return localac;
    }
    ac localac = this.rRr;
    GMTrace.o(6893556727808L, 51361);
    return localac;
  }
  
  public final boolean bxd()
  {
    GMTrace.i(6893690945536L, 51362);
    if ((this.rRp != null) && (this.rRp.field_isDomesticUser))
    {
      GMTrace.o(6893690945536L, 51362);
      return true;
    }
    GMTrace.o(6893690945536L, 51362);
    return false;
  }
  
  public final int bxe()
  {
    GMTrace.i(6893959380992L, 51364);
    if (this.rRp != null)
    {
      int i = this.rRp.field_cre_type;
      GMTrace.o(6893959380992L, 51364);
      return i;
    }
    GMTrace.o(6893959380992L, 51364);
    return 1;
  }
  
  public final String bxf()
  {
    GMTrace.i(6894093598720L, 51365);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.vdo, null);
    if (!bg.mZ(str))
    {
      GMTrace.o(6894093598720L, 51365);
      return str;
    }
    if (this.rRp != null)
    {
      str = this.rRp.field_lct_wording;
      GMTrace.o(6894093598720L, 51365);
      return str;
    }
    GMTrace.o(6894093598720L, 51365);
    return null;
  }
  
  public final String bxg()
  {
    GMTrace.i(6894227816448L, 51366);
    if (this.rRp != null)
    {
      String str = this.rRp.field_lct_url;
      GMTrace.o(6894227816448L, 51366);
      return str;
    }
    GMTrace.o(6894227816448L, 51366);
    return null;
  }
  
  public final void bxh()
  {
    Object localObject3 = null;
    Object localObject2 = null;
    GMTrace.i(6894362034176L, 51367);
    if (!h.xx().wM())
    {
      w.w("MicroMsg.WalletUserInfoManger", "Account Not Ready!");
      GMTrace.o(6894362034176L, 51367);
      return;
    }
    this.rRp = m.bwA().bxx();
    if (this.rRp != null) {}
    Object localObject1;
    Object localObject4;
    for (this.rRr = new ac(this.rRp.field_switchConfig);; this.rRr = new ac())
    {
      localObject1 = m.bwC();
      localObject4 = "select * from WalletBankcard where cardType & " + Bankcard.rMR + " != 0 ";
      localObject4 = ((com.tencent.mm.plugin.wallet_core.c.c)localObject1).gMB.a((String)localObject4, null, 2);
      if (localObject4 != null) {
        break;
      }
      localObject1 = null;
      this.rCP = ((Bankcard)localObject1);
      localObject1 = m.bwC();
      localObject4 = "select * from WalletBankcard where cardType & " + Bankcard.rMU + " != 0 ";
      localObject4 = ((com.tencent.mm.plugin.wallet_core.c.c)localObject1).gMB.a((String)localObject4, null, 2);
      if (localObject4 != null) {
        break label383;
      }
      localObject1 = null;
      this.rRv = ((Bankcard)localObject1);
      com.tencent.mm.wallet_core.ui.e.a("wallet_balance", new e.b()
      {
        public final void bt(Object paramAnonymousObject)
        {
          GMTrace.i(6889798631424L, 51333);
          if ((paramAnonymousObject != null) && ((paramAnonymousObject instanceof Double)))
          {
            if (((Double)paramAnonymousObject).doubleValue() < 0.0D) {
              w.v("MicroMsg.WalletUserInfoManger", "val is zero %s", new Object[] { bg.bOd().toString() });
            }
            if (ae.this.rCP != null)
            {
              ae.this.rCP.rNa = ((Double)paramAnonymousObject).doubleValue();
              GMTrace.o(6889798631424L, 51333);
            }
          }
          else
          {
            w.i("MicroMsg.WalletUserInfoManger", "hy: no balance info. set to negative");
            if (ae.this.rCP != null) {
              ae.this.rCP.rNa = -1.0D;
            }
          }
          GMTrace.o(6889798631424L, 51333);
        }
      });
      this.rEU = m.bwC().bxi();
      this.rEV = m.bwC().bxv();
      localObject1 = m.bwC();
      localObject4 = "select * from WalletBankcard where cardType & " + Bankcard.rMS + " != 0 ";
      localObject4 = ((com.tencent.mm.plugin.wallet_core.c.c)localObject1).gMB.a((String)localObject4, null, 2);
      if (localObject4 != null) {
        break label417;
      }
      localObject1 = null;
      this.rRq = ((Bankcard)localObject1);
      localObject4 = m.bwG().gMB.a("select * from LoanEntryInfo", null, 2);
      if (localObject4 != null) {
        break label451;
      }
      localObject1 = localObject2;
      label308:
      this.rRs = ((j)localObject1);
      w.i("MicroMsg.WalletUserInfoManger", "loadDbData!");
      bxm();
      GMTrace.o(6894362034176L, 51367);
      return;
    }
    if (((Cursor)localObject4).moveToFirst())
    {
      localObject1 = new Bankcard();
      ((Bankcard)localObject1).b((Cursor)localObject4);
    }
    for (;;)
    {
      ((Cursor)localObject4).close();
      break;
      label383:
      if (((Cursor)localObject4).moveToFirst())
      {
        localObject1 = new Bankcard();
        ((Bankcard)localObject1).b((Cursor)localObject4);
      }
      for (;;)
      {
        ((Cursor)localObject4).close();
        break;
        label417:
        if (((Cursor)localObject4).moveToNext())
        {
          localObject1 = new Bankcard();
          ((Bankcard)localObject1).b((Cursor)localObject4);
        }
        for (;;)
        {
          ((Cursor)localObject4).close();
          break;
          label451:
          localObject1 = localObject3;
          if (((Cursor)localObject4).moveToFirst())
          {
            localObject1 = new j();
            ((j)localObject1).b((Cursor)localObject4);
          }
          ((Cursor)localObject4).close();
          break label308;
          localObject1 = null;
        }
        localObject1 = null;
      }
      localObject1 = null;
    }
  }
  
  public final ArrayList<Bankcard> bxi()
  {
    GMTrace.i(6894630469632L, 51369);
    if ((this.rEU == null) || (this.rEU.size() <= 0)) {
      this.rEU = m.bwC().bxi();
    }
    if ((this.rEU == null) || (this.rEU.size() <= 0))
    {
      GMTrace.o(6894630469632L, 51369);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.rEU.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((Bankcard)localIterator.next());
    }
    GMTrace.o(6894630469632L, 51369);
    return localArrayList;
  }
  
  public final List<c> bxj()
  {
    GMTrace.i(18040473255936L, 134412);
    if (this.rRu != null) {
      this.rRu.size();
    }
    if ((this.rRu == null) || (this.rRu.size() <= 0))
    {
      GMTrace.o(18040473255936L, 134412);
      return null;
    }
    List localList = this.rRu;
    GMTrace.o(18040473255936L, 134412);
    return localList;
  }
  
  public final ArrayList<Bankcard> bxk()
  {
    GMTrace.i(6894764687360L, 51370);
    if ((this.rEU == null) || (this.rEU.size() <= 0))
    {
      GMTrace.o(6894764687360L, 51370);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.rEU.iterator();
    while (localIterator.hasNext())
    {
      Bankcard localBankcard = (Bankcard)localIterator.next();
      if (!localBankcard.bwo()) {
        localArrayList.add(localBankcard);
      }
    }
    GMTrace.o(6894764687360L, 51370);
    return localArrayList;
  }
  
  public final String bxl()
  {
    GMTrace.i(6896106864640L, 51380);
    if ((this.rEU == null) || (this.rEU.size() <= 0))
    {
      w.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
      GMTrace.o(6896106864640L, 51380);
      return null;
    }
    Object localObject = this.rEU.iterator();
    if (((Iterator)localObject).hasNext())
    {
      localObject = ((Bankcard)((Iterator)localObject).next()).field_bindSerial;
      GMTrace.o(6896106864640L, 51380);
      return (String)localObject;
    }
    GMTrace.o(6896106864640L, 51380);
    return null;
  }
  
  public final void d(ArrayList<Bankcard> paramArrayList1, ArrayList<Bankcard> paramArrayList2)
  {
    GMTrace.i(6895167340544L, 51373);
    if ((this.rEU == null) || (paramArrayList1 == null) || (paramArrayList2 == null))
    {
      w.e("MicroMsg.WalletUserInfoManger", "error list, bankcards == null || bankcardsClone == null || virtualBankcardsClone == null");
      GMTrace.o(6895167340544L, 51373);
      return;
    }
    paramArrayList1.clear();
    paramArrayList2.clear();
    Iterator localIterator;
    if (this.rEU != null)
    {
      localIterator = this.rEU.iterator();
      while (localIterator.hasNext()) {
        paramArrayList1.add((Bankcard)localIterator.next());
      }
    }
    if (this.rEV != null)
    {
      localIterator = this.rEV.iterator();
      while (localIterator.hasNext())
      {
        Bankcard localBankcard = (Bankcard)localIterator.next();
        if (localBankcard.field_wxcreditState == 0) {
          paramArrayList2.add(localBankcard);
        } else {
          paramArrayList1.add(localBankcard);
        }
      }
    }
    GMTrace.o(6895167340544L, 51373);
  }
  
  public final ArrayList<Bankcard> iJ(boolean paramBoolean)
  {
    GMTrace.i(6894898905088L, 51371);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean)
    {
      if ((this.rCP != null) && (!bwV())) {
        localArrayList.add(this.rCP);
      }
      if ((this.rRv != null) && (!bwV()) && (this.rRp != null) && (this.rRp.field_lqt_state == 1)) {
        localArrayList.add(this.rRv);
      }
    }
    if ((this.rEU != null) && (this.rEU.size() > 0))
    {
      Iterator localIterator = this.rEU.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add((Bankcard)localIterator.next());
      }
    }
    GMTrace.o(6894898905088L, 51371);
    return localArrayList;
  }
  
  public final ArrayList<Bankcard> iR(boolean paramBoolean)
  {
    GMTrace.i(6895033122816L, 51372);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean)
    {
      if ((this.rCP != null) && (!bwV())) {
        localArrayList.add(this.rCP);
      }
      if ((this.rRv != null) && (!bwV()) && (this.rRp != null) && (this.rRp.field_lqt_state == 1)) {
        localArrayList.add(this.rRv);
      }
    }
    Iterator localIterator;
    if ((this.rRo != null) && (this.rEU != null) && (this.rRo.size() == this.rEU.size()) && (this.rRo.size() > 0)) {
      localIterator = this.rRo.iterator();
    }
    while (localIterator.hasNext())
    {
      localArrayList.add((Bankcard)localIterator.next());
      continue;
      if ((this.rEU != null) && (this.rEU.size() > 0))
      {
        localIterator = this.rEU.iterator();
        while (localIterator.hasNext()) {
          localArrayList.add((Bankcard)localIterator.next());
        }
      }
    }
    GMTrace.o(6895033122816L, 51372);
    return localArrayList;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */