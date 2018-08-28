package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{controle_seguranca_dispositivo_persistencia_descricao}}}
 **/
@ApiModel(description = "{{{controle_seguranca_dispositivo_persistencia_descricao}}}")
public class ControleSegurancaDispositivoPersistencia  {
  
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("phoneId")
  private String phoneId = null;

  
  /**
   * {{{controle_seguranca_dispositivo_id_usuario_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{controle_seguranca_dispositivo_id_usuario_descricao}}}")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{controle_seguranca_dispositivo_phone_id_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{controle_seguranca_dispositivo_phone_id_descricao}}}")
  public String getPhoneId() {
    return phoneId;
  }
  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleSegurancaDispositivoPersistencia {\n");
    
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  phoneId: ").append(phoneId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
