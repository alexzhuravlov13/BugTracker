package com.hillel.bugtracker.model.requestModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequest {

    private int messageId;

    private int ticketId;

    private int authorId;

    private int recipientId;

    private LocalDateTime createDate;

    @NotBlank(message = "must be not blank")
    private String text;

}
