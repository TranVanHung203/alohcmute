package hcmute.alohcmute.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaiKhoanDto {
	@NotEmpty
	private String username;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String sex;
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;
    @NotEmpty
    private String phone;
    @NotEmpty(message = "Password should not be empty")
    private String password;
}