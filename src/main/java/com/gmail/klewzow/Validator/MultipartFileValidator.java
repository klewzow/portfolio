package com.gmail.klewzow.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

@Component
public class MultipartFileValidator {

    private MultipartFile multipartFile;

    private final long MAX_FILE_SIZE = 5_000_000L;
    private final String FILE_SIZE_EX_TEXT = "Большой размер файла. не более - " + (MAX_FILE_SIZE / 1_000_000) + "MB";
    private final String FORMATS[] = {"jpeg", "jpg", "png"};
    private final String FILE_FORMAT_INCORRECT = "Неверный формат данных";
    private final String FILE_NONE = "Выберите файл";
    private final String FILE_ERROR_CODE = "35";
    private final String FILE_FIELD_ERROR_NAME = "file";

    public MultipartFileValidator() {
    }

    public MultipartFileValidator(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public BindingResult verify(MultipartFile multipartFile, BindingResult bindingResult) {

        if (multipartFile.getSize() > MAX_FILE_SIZE) {
            bindingResult.rejectValue(FILE_FIELD_ERROR_NAME, FILE_ERROR_CODE, FILE_SIZE_EX_TEXT);
        }

        int incorrect = 0;
        int fileNone = 0;
        if (multipartFile.getOriginalFilename().length() > 0) {
            fileNone = 1;
        }
        if (fileNone > 0) {
            for (String s :
                    FORMATS) {
                if (multipartFile.getOriginalFilename().endsWith(s)) {
                    incorrect = 1;
                    break;
                }
            }
        }
        if (fileNone != 1) {
            bindingResult.rejectValue(FILE_FIELD_ERROR_NAME, FILE_ERROR_CODE, FILE_NONE);
            return bindingResult;
        }
        if (incorrect != 1 && fileNone > 0) {
            bindingResult.rejectValue(FILE_FIELD_ERROR_NAME, FILE_ERROR_CODE, FILE_FORMAT_INCORRECT);
            return bindingResult;
        }

        return bindingResult;
    }
}
