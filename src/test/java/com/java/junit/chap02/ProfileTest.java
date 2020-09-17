package com.java.junit.chap02;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProfileTest {
    @Test
    public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
        Profile profile = new Profile("Bull Hockey,Inc"); // 회사 프로파일 생성
        Question question = new BooleanQuestion(1, "Got bonuses?"); // 회사 질문생성 질문 id와 질문
        Answer profileAnswer = new Answer(question, Bool.FALSE);
        profile.add(profileAnswer);
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, Bool.TRUE); // question에 대한 답변 예로 답변
        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch); // 답변과 weight(질문의 중요도)을 합쳐서
        criteria.add(criterion);//넣음.
        boolean matchs = profile.matches(criteria);
        assertFalse(matchs);// False가 나와야함.

        System.out.println(Bool.TRUE);
        System.out.println(Bool.True);
        System.out.println(Bool.True.getValue());
    }
}