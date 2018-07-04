package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{controle_seguranca_dispositivo_resposta_descricao}}}
 **/
@ApiModel(description = "{{{controle_seguranca_dispositivo_resposta_descricao}}}")
public class ControleSegurancaDispositivoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("phoneId")
  private String phoneId = null;

  
  /**
   * {{{controle_seguranca_dispositivo_resposta_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{controle_seguranca_dispositivo_resposta_id_descricao}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{controle_seguranca_dispositivo_resposta_id_usuario_descricao}}}
   **/
  @ApiModelProperty(value = "{{{controle_seguranca_dispositivo_resposta_id_usuario_descricao}}}")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{controle_seguranca_dispositivo_resposta_phone_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{controle_seguranca_dispositivo_resposta_phone_id_descricao}}}")
  public String getPhoneId() {
    return phoneId;
  }
  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleSegurancaDispositivoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  phoneId: ").append(phoneId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


