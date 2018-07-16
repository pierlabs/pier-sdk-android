package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{log_acesso_usuario_resposta_descricao}}}
 **/
@ApiModel(description = "{{{log_acesso_usuario_resposta_descricao}}}")
public class LogAcessoUsuarioResposta  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * {{{log_acesso_usuario_resposta_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{log_acesso_usuario_resposta_id_descricao}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogAcessoUsuarioResposta {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


