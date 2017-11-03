// INTERNAL ERROR //
package com.tencent.mm.plugin.sns.ui;

import com.tencent.mm.plugin.sns.b.*;
import com.tencent.gmtrace.*;
import com.tencent.mm.g.a.*;
import com.tencent.mm.sdk.b.*;
import com.tencent.mm.p.*;
import android.app.*;
import com.tencent.mm.sdk.platformtools.*;
import com.tencent.mm.pluginsdk.ui.tools.*;
import com.tencent.mm.plugin.sns.model.*;
import com.tencent.mm.plugin.sns.*;
import com.tencent.mm.kernel.*;
import android.os.*;
import com.tencent.mm.x.*;
import java.util.*;
import android.widget.*;
import com.tencent.mm.storage.*;
import android.content.*;
import com.tencent.mm.ui.*;
import android.view.*;
import com.tencent.mm.ui.base.*;
import com.tencent.mm.plugin.report.service.*;
import com.tencent.mm.plugin.sns.storage.*;
import com.tencent.mm.g.b.*;

public class SnsUserUI extends MMActivity implements h$a
{
    private c iSb;
    private String jqc;
    private at qRW;
    private bb qRX;
    private al.a qRY;
    private bb.a qRZ;
    private Runnable qSa;
    private boolean qyR;
    private String qyX;
    private boolean qyY;
    private boolean qyZ;
    private MenuItem$OnMenuItemClickListener qzD;
    private int qza;

    public SnsUserUI() {
        GMTrace.i(8744553414656L, 65152);
        this.qyR = false;
        this.qSa = new Runnable() {
            {
                GMTrace.i(8536784371712L, 63604);
                GMTrace.o(8536784371712L, 63604);
            }

            @Override
            public final void run() {
                GMTrace.i(8536918589440L, 63605);
                SnsUserUI.a(SnsUserUI.this).bnt();
                SnsUserUI.a(SnsUserUI.this).blG();
                GMTrace.o(8536918589440L, 63605);
            }
        };
        this.qzD = (MenuItem$OnMenuItemClickListener)new MenuItem$OnMenuItemClickListener() {
            {
                GMTrace.i(8623757459456L, 64252);
                GMTrace.o(8623757459456L, 64252);
            }

            public final boolean onMenuItemClick(final MenuItem menuItem) {
                GMTrace.i(8623891677184L, 64253);
                SnsUserUI.this.finish();
                GMTrace.o(8623891677184L, 64253);
                return true;
            }
        };
        this.iSb = new c<jg>() {
            {
                GMTrace.i(8589531938816L, 63997);
                this.uLu = jg.class.getName().hashCode();
                GMTrace.o(8589531938816L, 63997);
            }
        };
        GMTrace.o(8744553414656L, 65152);
    }

    static /* synthetic */ al.a a(final SnsUserUI snsUserUI, final al.a qry) {
        GMTrace.i(8746835116032L, 65169);
        snsUserUI.qRY = qry;
        GMTrace.o(8746835116032L, 65169);
        return qry;
    }

    static /* synthetic */ at a(final SnsUserUI snsUserUI) {
        GMTrace.i(8746566680576L, 65167);
        final at qrw = snsUserUI.qRW;
        GMTrace.o(8746566680576L, 65167);
        return qrw;
    }

    static /* synthetic */ al.a b(final SnsUserUI snsUserUI) {
        GMTrace.i(8746700898304L, 65168);
        final al.a qry = snsUserUI.qRY;
        GMTrace.o(8746700898304L, 65168);
        return qry;
    }

    private void bnV() {
        GMTrace.i(8745761374208L, 65161);
        if (com.tencent.mm.p.a.aO((Context)this)) {
            GMTrace.o(8745761374208L, 65161);
            return;
        }
        final boolean a = com.tencent.mm.pluginsdk.h.a.a((Activity)this, "android.permission.CAMERA", 18, "", "");
        w.d("MicroMsg.SnsUserUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { a, bg.bOd(), this });
        if (!a) {
            GMTrace.o(8745761374208L, 65161);
            return;
        }
        final boolean a2 = com.tencent.mm.pluginsdk.h.a.a((Activity)this, "android.permission.RECORD_AUDIO", 18, "", "");
        w.d("MicroMsg.SnsUserUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { a2, bg.bOd(), this });
        if (!a2) {
            GMTrace.o(8745761374208L, 65161);
            return;
        }
        k.x((Context)super.vov.voR, new Intent());
        GMTrace.o(8745761374208L, 65161);
    }

    static /* synthetic */ String c(final SnsUserUI snsUserUI) {
        GMTrace.i(8746969333760L, 65170);
        final String jqc = snsUserUI.jqc;
        GMTrace.o(8746969333760L, 65170);
        return jqc;
    }

    static /* synthetic */ boolean d(final SnsUserUI snsUserUI) {
        GMTrace.i(20063537070080L, 149485);
        final boolean qyY = snsUserUI.qyY;
        GMTrace.o(20063537070080L, 149485);
        return qyY;
    }

    static /* synthetic */ int e(final SnsUserUI snsUserUI) {
        GMTrace.i(8747103551488L, 65171);
        final int qza = snsUserUI.qza;
        GMTrace.o(8747103551488L, 65171);
        return qza;
    }

    static /* synthetic */ boolean f(final SnsUserUI snsUserUI) {
        GMTrace.i(8747237769216L, 65172);
        final boolean qyZ = snsUserUI.qyZ;
        GMTrace.o(8747237769216L, 65172);
        return qyZ;
    }

    static /* synthetic */ Runnable g(final SnsUserUI snsUserUI) {
        GMTrace.i(8747371986944L, 65173);
        final Runnable qSa = snsUserUI.qSa;
        GMTrace.o(8747371986944L, 65173);
        return qSa;
    }

    static /* synthetic */ boolean h(final SnsUserUI snsUserUI) {
        GMTrace.i(8747506204672L, 65174);
        final boolean qyR = snsUserUI.qyR;
        GMTrace.o(8747506204672L, 65174);
        return qyR;
    }

    static /* synthetic */ bb.a i(final SnsUserUI snsUserUI) {
        GMTrace.i(8747640422400L, 65175);
        final bb.a qrz = snsUserUI.qRZ;
        GMTrace.o(8747640422400L, 65175);
        return qrz;
    }

    static /* synthetic */ void j(final SnsUserUI snsUserUI) {
        GMTrace.i(8747774640128L, 65176);
        snsUserUI.bnV();
        GMTrace.o(8747774640128L, 65176);
    }

    static /* synthetic */ bb k(final SnsUserUI snsUserUI) {
        GMTrace.i(18576001990656L, 138402);
        final bb qrx = snsUserUI.qRX;
        GMTrace.o(18576001990656L, 138402);
        return qrx;
    }

    protected final void MH() {
        GMTrace.i(8745358721024L, 65158);
        this.qRW = new at((Activity)this, (at.f)new a() {
            {
                GMTrace.i(8347671592960L, 62195);
                GMTrace.o(8347671592960L, 62195);
            }

            @Override
            public final void de(final int n, final int n2) {
                GMTrace.i(8347805810688L, 62196);
                super.de(n, n2);
                GMTrace.o(8347805810688L, 62196);
            }
        }, this.jqc, (at.c)new at.c() {
            {
                GMTrace.i(8484036804608L, 63211);
                GMTrace.o(8484036804608L, 63211);
            }
        });
        this.qRX.nep.setAdapter((ListAdapter)this.qRW);
        this.qRX.nep.setOnItemClickListener((AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
            {
                GMTrace.i(8583357923328L, 63951);
                GMTrace.o(8583357923328L, 63951);
            }

            public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                GMTrace.i(8583492141056L, 63952);
                GMTrace.o(8583492141056L, 63952);
            }
        });
        this.qRX.nep.postDelayed((Runnable)new Runnable() {
            {
                GMTrace.i(8717038780416L, 64947);
                GMTrace.o(8717038780416L, 64947);
            }

            @Override
            public final void run() {
                GMTrace.i(8717172998144L, 64948);
                if (SnsUserUI.h(SnsUserUI.this)) {
                    w.w("MicroMsg.SnsUserUI", "too fast that it finish");
                    GMTrace.o(8717172998144L, 64948);
                    return;
                }
                SnsUserUI.b(SnsUserUI.this).a(SnsUserUI.i(SnsUserUI.this).getType(), SnsUserUI.c(SnsUserUI.this), (h$a)SnsUserUI.this);
                if (SnsUserUI.i(SnsUserUI.this).getType() == 1 && SnsUserUI.i(SnsUserUI.this).bln()) {
                    ae.bhf().w(ae.bhv().qey, -1);
                }
                if (!SnsUserUI.i(SnsUserUI.this).bln()) {
                    final al.a b = SnsUserUI.b(SnsUserUI.this);
                    final int type = SnsUserUI.i(SnsUserUI.this).getType();
                    final String c = SnsUserUI.c(SnsUserUI.this);
                    SnsUserUI.d(SnsUserUI.this);
                    b.a(type, c, SnsUserUI.f(SnsUserUI.this), SnsUserUI.e(SnsUserUI.this));
                }
                GMTrace.o(8717172998144L, 64948);
            }
        }, 500L);
        this.a(this.qzD, i.e.aVv);
        GMTrace.o(8745358721024L, 65158);
    }

    public final void a(final boolean qRw, final String qep, final boolean qmg, final boolean b, final int n, final long n2) {
        GMTrace.i(8745627156480L, 65160);
        ae.aCa().removeCallbacks(this.qSa);
        if (this.qRW != null) {
            this.qRW.qMG = qmg;
            this.qRW.qEP = qep;
            final String lbb = this.qRW.lBB;
            if (qep.compareTo(lbb) < 0) {
                w.i("MicroMsg.SnsUserUI", "onNpAddSize addsize %s %s", new Object[] { qep, lbb });
                this.qRW.bnt();
            }
            else {
                w.i("MicroMsg.SnsUserUI", "onNpAddSize addsize passed %s %s", new Object[] { qep, lbb });
            }
            this.qRW.blG();
        }
        if (b && !this.qyX.equals(this.jqc)) {
            this.qRX.qRw = true;
            this.qRX.uP(n);
            GMTrace.o(8745627156480L, 65160);
            return;
        }
        if (this.qyX.equals(this.jqc) && n2 != 0L) {
            h.xA();
            h.xz().xi().a(w$a.vaJ, (Object)n2);
            this.qRW.dU(n2);
        }
        if (this.qRX.qRw = qRw) {
            this.qRX.hW(qmg);
        }
        GMTrace.o(8745627156480L, 65160);
    }

    public final void a(final boolean b, final boolean qRw, final String qep, final boolean b2, final boolean b3, final int n, final long n2) {
        GMTrace.i(8745492938752L, 65159);
        if (this.qRW != null) {
            this.qRW.qEP = qep;
            final String lbb = this.qRW.lBB;
            if (qep.compareTo(lbb) < 0) {
                w.i("MicroMsg.SnsUserUI", "onFpSetSize addsize %s %s isNeedNP %s", new Object[] { qep, lbb, b });
                this.qRW.bnt();
            }
            else {
                w.i("MicroMsg.SnsUserUI", "onFpSetSize addsize passed %s %s isNeedNP %s", new Object[] { qep, lbb, b });
            }
            this.qRW.blG();
        }
        if (b3 && !this.qyX.equals(this.jqc)) {
            this.qRX.qRw = true;
            this.qRX.uP(n);
        }
        else {
            if (this.qyX.equals(this.jqc) && n2 != 0L) {
                h.xA();
                h.xz().xi().a(w$a.vaJ, (Object)n2);
                this.qRW.dU(n2);
            }
            if (this.qRX.qRw = qRw) {
                this.qRX.hW(false);
            }
            else if (b) {
                this.qRY.b(this.qRZ.getType(), this.jqc, this.qyZ, this.qza);
            }
        }
        if (b2) {
            this.qRX.qim.bmV();
        }
        GMTrace.o(8745492938752L, 65159);
    }

    public final boolean blf() {
        GMTrace.i(8746029809664L, 65163);
        final boolean blf = super.blf();
        GMTrace.o(8746029809664L, 65163);
        return blf;
    }

    protected final int getLayoutId() {
        GMTrace.i(8744956067840L, 65155);
        final int pPn = i.g.pPn;
        GMTrace.o(8744956067840L, 65155);
        return pPn;
    }

    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        GMTrace.i(8746298245120L, 65165);
        w.i("MicroMsg.SnsUserUI", "on activity result, %d %d", new Object[] { n, n2 });
        if (5985 == n && n2 == -1) {
            this.finish();
            GMTrace.o(8746298245120L, 65165);
            return;
        }
        super.onActivityResult(n, n2, intent);
        this.qRX.onActivityResult(n, n2, intent);
        GMTrace.o(8746298245120L, 65165);
    }

    public void onBackPressed() {
        GMTrace.i(8745895591936L, 65162);
        this.finish();
        GMTrace.o(8745895591936L, 65162);
    }

    public void onCreate(final Bundle bundle) {
        GMTrace.i(8744687632384L, 65153);
        if (this.vov != null) {
            this.vov.Y(2, false);
        }
        super.onCreate(bundle);
        this.qRY = ae.bhf();
        this.qza = this.getIntent().getIntExtra("sns_source", 0);
        this.jqc = this.getIntent().getStringExtra("sns_userName");
        if (this.jqc == null) {
            this.jqc = "";
        }
        h.xA();
        this.qyY = ((com.tencent.mm.plugin.messenger.foundation.a.h)h.h((Class)com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SH(this.jqc);
        this.qyX = m.zF();
        this.qyZ = this.qyX.equals(this.jqc);
        final ar bhd = ae.bhd();
        final String ap = bg.ap(this.getIntent().getStringExtra("sns_signature"), "");
        final String ap2 = bg.ap(this.getIntent().getStringExtra("sns_nickName"), "");
        x x;
        if (this.jqc == null || this.jqc.equals("")) {
            x = bhd.SL(this.qyX);
        }
        else {
            x = bhd.SL(this.jqc);
        }
        String vp = ap2;
        String signature = ap;
        if (x != null) {
            vp = ap2;
            signature = ap;
            if ((int)((com.tencent.mm.l.a)x).gLS > 0) {
                signature = ((af)x).signature;
                vp = ((com.tencent.mm.l.a)x).vp();
                w.i("MicroMsg.SnsUserUI", "contact:user[%s] id[%d] nickname[%s]", new Object[] { ((af)x).field_username, (int)((com.tencent.mm.l.a)x).gLS, vp });
            }
        }
        (this.qRX = new bb((Activity)this)).a(this.qyX, this.jqc, vp, signature, this.qyY, this.qyZ, this.qza);
        final bb qrx = this.qRX;
        final bb.a a = new bb.a() {
            {
                GMTrace.i(8664693866496L, 64557);
                GMTrace.o(8664693866496L, 64557);
            }

            @Override
            public final void H(int n, final boolean b) {
                final boolean b2 = false;
                GMTrace.i(8666036043776L, 64567);
                if (SnsUserUI.a(SnsUserUI.this) != null) {
                    final at a = SnsUserUI.a(SnsUserUI.this);
                    if (a.qMH != null) {
                        final au qmh = a.qMH;
                        final com.tencent.mm.plugin.sns.storage.m ui = ae.bhp().uI(n);
                        if (ui == null || ui.bjL().uyu == null || qmh.fIU.size() <= 0) {
                            GMTrace.o(8666036043776L, 64567);
                            return;
                        }
                        n = 0;
                        boolean b3;
                        while (true) {
                            b3 = b2;
                            if (n >= qmh.fIU.size()) {
                                break;
                            }
                            if (qmh.fIU.get(n).bkg() == ui.bkg()) {
                                b3 = true;
                                qmh.fIU.remove(n);
                                break;
                            }
                            ++n;
                        }
                        if (b3) {
                            qmh.fIU.add(ui);
                            qmh.bnv();
                            qmh.bnw();
                        }
                    }
                }
                GMTrace.o(8666036043776L, 64567);
            }

            @Override
            public final void a(int i, final List<Integer> list, final List<Integer> list2) {
                GMTrace.i(8665364955136L, 64562);
                if (i != -1 && SnsUserUI.a(SnsUserUI.this) != null) {
                    final at a = SnsUserUI.a(SnsUserUI.this);
                    if (a.qMH != null) {
                        final au qmh = a.qMH;
                        final com.tencent.mm.plugin.sns.storage.m ui = ae.bhp().uI(i);
                        if (ui != null && ui.bjL().uyu != null && qmh.fIU.size() > 0) {
                            qmh.fIU.add(1, ui);
                            qmh.bnv();
                            qmh.bnw();
                        }
                    }
                }
                if (SnsUserUI.a(SnsUserUI.this) != null && list != null && list2 != null) {
                    final at a2 = SnsUserUI.a(SnsUserUI.this);
                    if (a2.qMH != null) {
                        if (list == null || list2 == null || list.size() + list2.size() == 0) {
                            GMTrace.o(8665364955136L, 64562);
                            return;
                        }
                        final au qmh2 = a2.qMH;
                        if (list != null && list.size() != 0) {
                            w.d("MicroMsg.SnsSelfHelper", "remove Items");
                            for (final int intValue : list) {
                                int size;
                                com.tencent.mm.plugin.sns.storage.m m;
                                for (size = qmh2.fIU.size(), i = 1; i < size; ++i) {
                                    m = qmh2.fIU.get(i);
                                    if (m != null && m.quQ == intValue) {
                                        qmh2.fIU.remove(i);
                                        break;
                                    }
                                }
                            }
                        }
                        if (list2 != null && list2.size() != 0) {
                            w.d("MicroMsg.SnsSelfHelper", "change Items");
                            final LinkedList<com.tencent.mm.plugin.sns.storage.m> list3 = new LinkedList<com.tencent.mm.plugin.sns.storage.m>();
                            int n;
                            Label_0494:
                            for (i = 1; i < qmh2.fIU.size(); i = n + 1) {
                                final com.tencent.mm.plugin.sns.storage.m j = qmh2.fIU.get(i);
                                n = i;
                                if (j != null) {
                                    final Iterator<Integer> iterator2 = list2.iterator();
                                    int intValue2;
                                    do {
                                        n = i;
                                        if (!iterator2.hasNext()) {
                                            continue Label_0494;
                                        }
                                        intValue2 = iterator2.next();
                                    } while (j.quQ != intValue2);
                                    w.d("MicroMsg.SnsSelfHelper", "update list localId " + intValue2);
                                    qmh2.fIU.remove(i);
                                    list3.add(ae.bhp().uI(intValue2));
                                    n = i - 1;
                                }
                            }
                            final Iterator<Object> iterator3 = list3.iterator();
                            while (iterator3.hasNext()) {
                                qmh2.fIU.add(iterator3.next());
                            }
                        }
                        qmh2.bnv();
                        qmh2.bnw();
                    }
                }
                GMTrace.o(8665364955136L, 64562);
            }

            @Override
            public final void blk() {
                GMTrace.i(8664828084224L, 64558);
                if (SnsUserUI.b(SnsUserUI.this) == null) {
                    SnsUserUI.a(SnsUserUI.this, ae.bhf());
                }
                final al.a b = SnsUserUI.b(SnsUserUI.this);
                final String c = SnsUserUI.c(SnsUserUI.this);
                SnsUserUI.d(SnsUserUI.this);
                b.b(2, c, SnsUserUI.f(SnsUserUI.this), SnsUserUI.e(SnsUserUI.this));
                ae.aCa().postDelayed(SnsUserUI.g(SnsUserUI.this), 3000L);
                GMTrace.o(8664828084224L, 64558);
            }

            @Override
            public final ListView bll() {
                GMTrace.i(8664962301952L, 64559);
                final ListView listView = (ListView)SnsUserUI.this.findViewById(i.f.pMO);
                GMTrace.o(8664962301952L, 64559);
                return listView;
            }

            @Override
            public final MMPullDownView blm() {
                GMTrace.i(8665096519680L, 64560);
                final MMPullDownView mmPullDownView = (MMPullDownView)SnsUserUI.this.findViewById(i.f.pMV);
                GMTrace.o(8665096519680L, 64560);
                return mmPullDownView;
            }

            @Override
            public final boolean bln() {
                GMTrace.i(8665499172864L, 64563);
                GMTrace.o(8665499172864L, 64563);
                return false;
            }

            @Override
            public final void blo() {
                GMTrace.i(8665633390592L, 64564);
                final al.a b = SnsUserUI.b(SnsUserUI.this);
                final String c = SnsUserUI.c(SnsUserUI.this);
                SnsUserUI.d(SnsUserUI.this);
                b.a(2, c, SnsUserUI.f(SnsUserUI.this), SnsUserUI.e(SnsUserUI.this));
                GMTrace.o(8665633390592L, 64564);
            }

            @Override
            public final void blp() {
                GMTrace.i(8665767608320L, 64565);
                GMTrace.o(8665767608320L, 64565);
            }

            @Override
            public final void blq() {
                GMTrace.i(8665901826048L, 64566);
                GMTrace.o(8665901826048L, 64566);
            }

            @Override
            public final int getType() {
                GMTrace.i(15402826465280L, 114760);
                GMTrace.o(15402826465280L, 114760);
                return 2;
            }

            @Override
            public final void hV(final boolean b) {
                GMTrace.i(8666170261504L, 64568);
                GMTrace.o(8666170261504L, 64568);
            }
        };
        this.qRZ = a;
        qrx.qRy = (bb.a)a;
        this.qRX.onCreate();
        if (this.getIntent().getExtras() != null) {
            this.getIntent().getExtras().setClassLoader(this.getClass().getClassLoader());
        }
        this.MH();
        com.tencent.mm.sdk.b.a.uLm.b(this.iSb);
        GMTrace.o(8744687632384L, 65153);
    }

    public void onDestroy() {
        GMTrace.i(8744821850112L, 65154);
        this.qyR = true;
        com.tencent.mm.sdk.b.a.uLm.c(this.iSb);
        final com.tencent.mm.modelsns.b q = com.tencent.mm.modelsns.b.q(this.getIntent());
        if (q != null) {
            q.update();
            q.LJ();
        }
        if (this.qRX.ikZ != null) {
            this.qRX.ikZ.dismiss();
            this.qRX.ikZ = null;
        }
        h.xA();
        if (h.xx().wM() && this.qRY != null) {
            this.qRY.a((h$a)this, this.qRZ.getType());
        }
        this.qRX.onDestroy();
        super.onDestroy();
        GMTrace.o(8744821850112L, 65154);
    }

    public void onPause() {
        GMTrace.i(8745224503296L, 65157);
        bb.onPause();
        super.onPause();
        GMTrace.o(8745224503296L, 65157);
    }

    public void onRequestPermissionsResult(int n, final String[] array, final int[] array2) {
        GMTrace.i(8746432462848L, 65166);
        w.i("MicroMsg.SnsUserUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { n, array2[0], Thread.currentThread().getId() });
        switch (n) {
            case 18: {
                if (array2[0] == 0) {
                    this.bnV();
                    GMTrace.o(8746432462848L, 65166);
                    return;
                }
                if ("android.permission.CAMERA".equals(array[0])) {
                    n = i.j.etQ;
                }
                else {
                    n = i.j.etT;
                }
                if (array2[0] != 0) {
                    com.tencent.mm.ui.base.h.a((Context)this, this.getString(n), this.getString(i.j.etW), this.getString(i.j.ejv), this.getString(i.j.duP), false, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                        {
                            GMTrace.i(8753814437888L, 65221);
                            GMTrace.o(8753814437888L, 65221);
                        }

                        public final void onClick(final DialogInterface dialogInterface, final int n) {
                            GMTrace.i(18575330902016L, 138397);
                            dialogInterface.dismiss();
                            SnsUserUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
                            GMTrace.o(18575330902016L, 138397);
                        }
                    }, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                        {
                            GMTrace.i(8616375484416L, 64197);
                            GMTrace.o(8616375484416L, 64197);
                        }

                        public final void onClick(final DialogInterface dialogInterface, final int n) {
                            GMTrace.i(17837670268928L, 132901);
                            dialogInterface.dismiss();
                            GMTrace.o(17837670268928L, 132901);
                        }
                    });
                    break;
                }
                break;
            }
        }
        GMTrace.o(8746432462848L, 65166);
    }

    public void onResume() {
        GMTrace.i(8745090285568L, 65156);
        if (this.qRW != null) {
            this.qRW.notifyDataSetChanged();
        }
        this.bUD();
        this.setRequestedOrientation(-1);
        if (!this.qyZ) {
            this.kS(false);
        }
        else {
            super.vov.a(0, i.i.pPZ, this.getString(i.j.pTd), (MenuItem$OnMenuItemClickListener)new MenuItem$OnMenuItemClickListener() {
                {
                    GMTrace.i(18572109676544L, 138373);
                    GMTrace.o(18572109676544L, 138373);
                }

                public final boolean onMenuItemClick(final MenuItem menuItem) {
                    GMTrace.i(18572243894272L, 138374);
                    final Intent intent = new Intent();
                    intent.setClass((Context)SnsUserUI.this, (Class)SnsMsgUI.class);
                    intent.putExtra("sns_msg_force_show_all", true);
                    SnsUserUI.this.startActivityForResult(intent, 8);
                    GMTrace.o(18572243894272L, 138374);
                    return true;
                }
            }, (View$OnLongClickListener)null, p$b.vpA);
        }
        this.a(this.qzD, i.e.aVv);
        if (this.qyZ) {
            this.oC(i.j.pTp);
        }
        else {
            w.d("MicroMsg.SnsUserUI", "SnsUserUI, userName:%s, title:%s", new Object[] { this.jqc, this.qRX.title });
            final x sl = ae.bhd().SL(this.jqc);
            String s;
            if (sl != null) {
                w.d("MicroMsg.SnsUserUI", "SnsUserUI, contact is not null");
                s = ((com.tencent.mm.l.a)sl).vq();
            }
            else {
                w.d("MicroMsg.SnsUserUI", "SnsUserUI, contact is null, title:%s", new Object[] { this.qRX.title });
                s = this.qRX.title;
            }
            this.rV(com.tencent.mm.plugin.sns.data.i.x(s));
        }
        bb.onResume();
        super.onResume();
        GMTrace.o(8745090285568L, 65156);
    }

    class a extends f
    {
        private ba qzI;

        a() {
            GMTrace.i(8664156995584L, 64553);
            this.qzI = null;
            GMTrace.o(8664156995584L, 64553);
        }

        @Override
        public void de(final int n, final int n2) {
            GMTrace.i(8664291213312L, 64554);
            w.d("MicroMsg.SnsUserUI", "showImg snsinfo snslocalId " + n);
            if (SnsUserUI.f(SnsUserUI.this) && n2 == -1) {
                this.qzI = new ba((Context)SnsUserUI.this);
                this.qzI.qQS = (o$c)new o$c() {
                    {
                        GMTrace.i(8631139434496L, 64307);
                        GMTrace.o(8631139434496L, 64307);
                    }

                    public final void a(final com.tencent.mm.ui.base.m m) {
                        GMTrace.i(17838207139840L, 132905);
                        m.e(0, (CharSequence)SnsUserUI.this.getString(i.j.dvx));
                        m.e(1, (CharSequence)SnsUserUI.this.getString(i.j.dvB));
                        GMTrace.o(17838207139840L, 132905);
                    }
                };
                this.qzI.c(0, SnsUserUI.this.vov.voR.getString(i.j.pQU));
                this.qzI.qQT = (o$d)new o$d() {
                    {
                        GMTrace.i(8736500350976L, 65092);
                        GMTrace.o(8736500350976L, 65092);
                    }

                    public final void c(final MenuItem menuItem, final int n) {
                        GMTrace.i(17837133398016L, 132897);
                        switch (menuItem.getItemId()) {
                            case 0: {
                                g.paX.i(13822, new Object[] { 1, 2 });
                                SnsUserUI.j(SnsUserUI.this);
                                GMTrace.o(17837133398016L, 132897);
                                return;
                            }
                            case 1: {
                                g.paX.i(13822, new Object[] { 2, 2 });
                                SnsUserUI.k(SnsUserUI.this).vj(1);
                                break;
                            }
                        }
                        GMTrace.o(17837133398016L, 132897);
                    }
                };
                this.qzI.bnM();
                GMTrace.o(8664291213312L, 64554);
                return;
            }
            final Intent intent = new Intent((Context)SnsUserUI.this, (Class)SnsGalleryUI.class);
            intent.putExtra("sns_gallery_userName", SnsUserUI.c(SnsUserUI.this));
            intent.putExtra("sns_gallery_is_self", SnsUserUI.f(SnsUserUI.this));
            intent.putExtra("sns_gallery_localId", n);
            intent.putExtra("sns_source", SnsUserUI.e(SnsUserUI.this));
            intent.putExtra("sns_gallery_st_time", SnsUserUI.a(SnsUserUI.this).qMJ);
            intent.putExtra("sns_gallery_ed_time", SnsUserUI.a(SnsUserUI.this).qMK);
            if (SnsUserUI.a(SnsUserUI.this) != null) {
                intent.putExtra("sns_gallery_limit_seq", SnsUserUI.a(SnsUserUI.this).lBB);
                SnsUserUI.b(SnsUserUI.this).f(SnsUserUI.c(SnsUserUI.this), SnsUserUI.a(SnsUserUI.this).dd(n, n2));
                intent.putExtra("sns_gallery_position", SnsUserUI.a(SnsUserUI.this).qMN);
            }
            SnsUserUI.this.startActivityForResult(intent, 8);
            GMTrace.o(8664291213312L, 64554);
        }

        @Override
        public final void df(final int n, final int n2) {
            GMTrace.i(8664425431040L, 64555);
            final com.tencent.mm.plugin.sns.storage.m ui = ae.bhp().uI(n);
            if (ui == null) {
                GMTrace.o(8664425431040L, 64555);
                return;
            }
            if (ui.field_type == 15) {
                final Intent intent = new Intent((Context)SnsUserUI.this, (Class)SnsGalleryUI.class);
                intent.putExtra("sns_gallery_userName", SnsUserUI.c(SnsUserUI.this));
                intent.putExtra("sns_gallery_is_self", SnsUserUI.f(SnsUserUI.this));
                intent.putExtra("sns_gallery_localId", n);
                intent.putExtra("sns_source", SnsUserUI.e(SnsUserUI.this));
                intent.putExtra("sns_gallery_st_time", SnsUserUI.a(SnsUserUI.this).qMJ);
                intent.putExtra("sns_gallery_ed_time", SnsUserUI.a(SnsUserUI.this).qMK);
                if (SnsUserUI.a(SnsUserUI.this) != null) {
                    intent.putExtra("sns_gallery_limit_seq", SnsUserUI.a(SnsUserUI.this).lBB);
                    SnsUserUI.b(SnsUserUI.this).f(SnsUserUI.c(SnsUserUI.this), SnsUserUI.a(SnsUserUI.this).dd(n, n2));
                    intent.putExtra("sns_gallery_position", SnsUserUI.a(SnsUserUI.this).qMN);
                }
                SnsUserUI.this.startActivityForResult(intent, 8);
                GMTrace.o(8664425431040L, 64555);
                return;
            }
            final Intent intent2 = new Intent();
            intent2.setClass((Context)SnsUserUI.this, (Class)SnsCommentDetailUI.class);
            intent2.putExtra("INTENT_TALKER", ui.field_userName);
            intent2.putExtra("INTENT_SNS_LOCAL_ID", u.W("sns_table_", n));
            SnsUserUI.this.startActivityForResult(intent2, 12);
            GMTrace.o(8664425431040L, 64555);
        }

        @Override
        public final void vc(final int n) {
            GMTrace.i(8664559648768L, 64556);
            final com.tencent.mm.plugin.sns.storage.m ui = ae.bhp().uI(n);
            if (ui == null) {
                GMTrace.o(8664559648768L, 64556);
                return;
            }
            final Intent intent = new Intent();
            intent.setClass((Context)SnsUserUI.this, (Class)SnsCommentDetailUI.class);
            intent.putExtra("INTENT_TALKER", ui.field_userName);
            intent.putExtra("INTENT_SNS_LOCAL_ID", u.W("sns_table_", n));
            SnsUserUI.this.startActivityForResult(intent, 12);
            GMTrace.o(8664559648768L, 64556);
        }
    }
}
