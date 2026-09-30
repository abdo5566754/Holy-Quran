package com.abdulrahman.holyquran;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class IndexFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_index, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rv = view.findViewById(R.id.rvIndex);

        rv.setLayoutManager(new LinearLayoutManager(requireContext()));

        SurahAdapter adapter = new SurahAdapter(getIndexOfQuran());
        rv.setAdapter(adapter);
    }

    private List<SurahModel> getIndexOfQuran() {
        List<SurahModel> list = new ArrayList<>();

        list.add(new SurahModel("الفاتحة", "مكية", 7, 1, 1));
        list.add(new SurahModel("البقرة", "مدنية", 286, 2, 2));
        list.add(new SurahModel("آل عمران", "مدنية", 200, 3, 50));
        list.add(new SurahModel("النساء", "مدنية", 176, 4, 77));
        list.add(new SurahModel("المائدة", "مدنية", 120, 5, 106));
        list.add(new SurahModel("الأنعام", "مكية", 165, 6, 128));
        list.add(new SurahModel("الأعراف", "مكية", 206, 7, 151));
        list.add(new SurahModel("الأنفال", "مدنية", 75, 8, 177));
        list.add(new SurahModel("التوبة", "مدنية", 129, 9, 187));
        list.add(new SurahModel("يونس", "مكية", 109, 10, 208));
        list.add(new SurahModel("هود", "مكية", 123, 11, 221));
        list.add(new SurahModel("يوسف", "مكية", 111, 12, 235));
        list.add(new SurahModel("الرعد", "مدنية", 43, 13, 249));
        list.add(new SurahModel("إبراهيم", "مكية", 52, 14, 255));
        list.add(new SurahModel("الحجر", "مكية", 99, 15, 262));
        list.add(new SurahModel("النحل", "مكية", 128, 16, 267));
        list.add(new SurahModel("الإسراء", "مكية", 111, 17, 282));
        list.add(new SurahModel("الكهف", "مكية", 110, 18, 293));
        list.add(new SurahModel("مريم", "مكية", 98, 19, 305));
        list.add(new SurahModel("طه", "مكية", 135, 20, 312));
        list.add(new SurahModel("الأنبياء", "مكية", 112, 21, 322));
        list.add(new SurahModel("الحج", "مدنية", 78, 22, 332));
        list.add(new SurahModel("المؤمنون", "مكية", 118, 23, 342));
        list.add(new SurahModel("النور", "مدنية", 64, 24, 350));
        list.add(new SurahModel("الفرقان", "مكية", 77, 25, 359));
        list.add(new SurahModel("الشعراء", "مكية", 227, 26, 367));
        list.add(new SurahModel("النمل", "مكية", 93, 27, 377));
        list.add(new SurahModel("القصص", "مكية", 88, 28, 385));
        list.add(new SurahModel("العنكبوت", "مكية", 69, 29, 396));
        list.add(new SurahModel("الروم", "مكية", 60, 30, 404));
        list.add(new SurahModel("لقمان", "مكية", 34, 31, 411));
        list.add(new SurahModel("السجدة", "مكية", 30, 32, 415));
        list.add(new SurahModel("الأحزاب", "مدنية", 73, 33, 418));
        list.add(new SurahModel("سبأ", "مكية", 54, 34, 428));
        list.add(new SurahModel("فاطر", "مكية", 45, 35, 434));
        list.add(new SurahModel("يس", "مكية", 83, 36, 440));
        list.add(new SurahModel("الصافات", "مكية", 182, 37, 446));
        list.add(new SurahModel("ص", "مكية", 88, 38, 453));
        list.add(new SurahModel("الزمر", "مكية", 75, 39, 458));
        list.add(new SurahModel("غافر", "مكية", 85, 40, 467));
        list.add(new SurahModel("فصلت", "مكية", 54, 41, 477));
        list.add(new SurahModel("الشورى", "مكية", 53, 42, 483));
        list.add(new SurahModel("الزخرف", "مكية", 89, 43, 489));
        list.add(new SurahModel("الدخان", "مكية", 59, 44, 496));
        list.add(new SurahModel("الجاثية", "مكية", 37, 45, 499));
        list.add(new SurahModel("الأحقاف", "مكية", 35, 46, 502));
        list.add(new SurahModel("محمد", "مدنية", 38, 47, 507));
        list.add(new SurahModel("الفتح", "مدنية", 29, 48, 511));
        list.add(new SurahModel("الحجرات", "مدنية", 18, 49, 515));
        list.add(new SurahModel("ق", "مكية", 45, 50, 518));
        list.add(new SurahModel("الذاريات", "مكية", 60, 51, 520));
        list.add(new SurahModel("الطور", "مكية", 49, 52, 523));
        list.add(new SurahModel("النجم", "مكية", 62, 53, 526));
        list.add(new SurahModel("القمر", "مكية", 55, 54, 528));
        list.add(new SurahModel("الرحمن", "مدنية", 78, 55, 531));
        list.add(new SurahModel("الواقعة", "مكية", 96, 56, 534));
        list.add(new SurahModel("الحديد", "مدنية", 29, 57, 537));
        list.add(new SurahModel("المجادلة", "مدنية", 22, 58, 542));
        list.add(new SurahModel("الحشر", "مدنية", 24, 59, 545));
        list.add(new SurahModel("الممتحنة", "مدنية", 13, 60, 549));
        list.add(new SurahModel("الصف", "مدنية", 14, 61, 551));
        list.add(new SurahModel("الجمعة", "مدنية", 11, 62, 553));
        list.add(new SurahModel("المنافقون", "مدنية", 11, 63, 554));
        list.add(new SurahModel("التغابن", "مدنية", 18, 64, 556));
        list.add(new SurahModel("الطلاق", "مدنية", 12, 65, 558));
        list.add(new SurahModel("التحريم", "مدنية", 12, 66, 560));
        list.add(new SurahModel("الملك", "مكية", 30, 67, 562));
        list.add(new SurahModel("القلم", "مكية", 52, 68, 564));
        list.add(new SurahModel("الحاقة", "مكية", 52, 69, 566));
        list.add(new SurahModel("المعارج", "مكية", 44, 70, 568));
        list.add(new SurahModel("نوح", "مكية", 28, 71, 570));
        list.add(new SurahModel("الجن", "مكية", 28, 72, 572));
        list.add(new SurahModel("المزمل", "مكية", 20, 73, 574));
        list.add(new SurahModel("المدثر", "مكية", 56, 74, 575));
        list.add(new SurahModel("القيامة", "مكية", 40, 75, 577));
        list.add(new SurahModel("الإنسان", "مدنية", 31, 76, 578));
        list.add(new SurahModel("المرسلات", "مكية", 50, 77, 580));
        list.add(new SurahModel("النبأ", "مكية", 40, 78, 582));
        list.add(new SurahModel("النازعات", "مكية", 46, 79, 583));
        list.add(new SurahModel("عبس", "مكية", 42, 80, 585));
        list.add(new SurahModel("التكوير", "مكية", 29, 81, 586));
        list.add(new SurahModel("الإنفطار", "مكية", 19, 82, 587));
        list.add(new SurahModel("المطففين", "مكية", 36, 83, 587));
        list.add(new SurahModel("الإنشقاق", "مكية", 25, 84, 589));
        list.add(new SurahModel("البروج", "مكية", 22, 85, 590));
        list.add(new SurahModel("الطارق", "مكية", 17, 86, 591));
        list.add(new SurahModel("الأعلى", "مكية", 19, 87, 591));
        list.add(new SurahModel("الغاشية", "مكية", 26, 88, 592));
        list.add(new SurahModel("الفجر", "مكية", 30, 89, 593));
        list.add(new SurahModel("البلد", "مكية", 20, 90, 594));
        list.add(new SurahModel("الشمس", "مكية", 15, 91, 595));
        list.add(new SurahModel("الليل", "مكية", 21, 92, 595));
        list.add(new SurahModel("الضحى", "مكية", 11, 93, 596));
        list.add(new SurahModel("الشرح", "مكية", 8, 94, 596));
        list.add(new SurahModel("التين", "مكية", 8, 95, 597));
        list.add(new SurahModel("العلق", "مكية", 19, 96, 597));
        list.add(new SurahModel("القدر", "مكية", 5, 97, 598));
        list.add(new SurahModel("البينة", "مدنية", 8, 98, 598));
        list.add(new SurahModel("الزلزلة", "مدنية", 8, 99, 599));
        list.add(new SurahModel("العاديات", "مكية", 11, 100, 599));
        list.add(new SurahModel("القارعة", "مكية", 11, 101, 600));
        list.add(new SurahModel("التكاثر", "مكية", 8, 102, 600));
        list.add(new SurahModel("العصر", "مكية", 3, 103, 601));
        list.add(new SurahModel("الهمزة", "مكية", 9, 104, 601));
        list.add(new SurahModel("الفيل", "مكية", 5, 105, 601));
        list.add(new SurahModel("قريش", "مكية", 4, 106, 602));
        list.add(new SurahModel("المواعون", "مكية", 7, 107, 602));
        list.add(new SurahModel("الكوثر", "مكية", 3, 108, 602));
        list.add(new SurahModel("الكافرون", "مكية", 6, 109, 603));
        list.add(new SurahModel("النصر", "مدنية", 3, 110, 603));
        list.add(new SurahModel("المسد", "مكية", 5, 111, 603));
        list.add(new SurahModel("الإخلاص", "مكية", 4, 112, 604));
        list.add(new SurahModel("الفلق", "مكية", 5, 113, 604));
        list.add(new SurahModel("الناس", "مكية", 6, 114, 604));
        return list;
    }
}