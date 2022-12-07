package com.example.The_Spring_Cinema.models;

    public class Reply {
        private boolean correct;
        private String message;

        public Reply(boolean correct, String message) {
            this.correct = correct;
            this.message = message;
        }

        public Reply() {
        }

        public boolean isCorrect() {
            return correct;
        }

        public void setCorrect(boolean correct) {
            this.correct = correct;
        }


        public String getMessage() {
            return message;
        }

        public void setMessage(String message){
            this.message = message;
        }
    }
