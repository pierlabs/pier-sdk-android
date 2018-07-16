package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{usuario_conta_resposta_descricao}}}
 **/
@ApiModel(description = "{{{usuario_conta_resposta_descricao}}}")
public class UsuarioContasResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("nivelAcesso")
  private Integer nivelAcesso = null;

  
  /**
   * {{{usuario_conta_resposta_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_conta_resposta_id_descricao}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{usuario_conta_resposta_id_conta_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_conta_resposta_id_conta_descricao}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{usuario_conta_resposta_id_pessoa_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_conta_resposta_id_pessoa_descricao}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{usuario_conta_resposta_id_usuario_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_conta_resposta_id_usuario_descricao}}}")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{usuario_conta_resposta_nivel_acesso_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_conta_resposta_nivel_acesso_descricao}}}")
  public Integer getNivelAcesso() {
    return nivelAcesso;
  }
  public void setNivelAcesso(Integer nivelAcesso) {
    this.nivelAcesso = nivelAcesso;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioContasResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  nivelAcesso: ").append(nivelAcesso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


