package com.example.designpattern;


import androidx.annotation.NonNull;

public class BuilderPattern {
    private final String company;
    private final String name;
    private final String gender;
    private final String position;

    BuilderPattern(@NonNull Builder builder) {
        company = builder.company;
        name = builder.name;
        gender = builder.gender;
        position = builder.position;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public String toStringTest() {       // Log 테스트용
        return this.company + " , " + this.name + " , " + this.gender + " , " + this.position;
    }

    public static class Builder {
        private final String company;       // 필수 매개변수
        private String name = "";           // 이하 선택 매개변수
        private String gender = "";
        private String position = "";

        public Builder(@NonNull String company) {       // 필수 매개변수 생성자로 받기
            this.company = company;
        }

        public Builder setName(String name) {           // 선택 매개변수 받기
            this.name = name;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPosition(String position) {
            this.position = position;
            return this;
        }

        public BuilderPattern build() {                  // 새 BuildPattern 객체 생성 - 빌드(Build 클래스에서 받은 데이터 전달)
            return new BuilderPattern(this);
        }
    }
}
