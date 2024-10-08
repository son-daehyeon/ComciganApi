package com.github.son_daehyeon.teacher.timetable;

import lombok.*;

import java.time.DayOfWeek;
import java.util.List;

@Data
@RequiredArgsConstructor(staticName = "of")
public final class DailyTimeTable {

    private final DayOfWeek dayOfWeek;
    private final List<PeriodTimeTable> timeTable;
}

