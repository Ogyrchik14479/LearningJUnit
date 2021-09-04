import React, { Component } from "react";
import ReactDOM from "react-dom";
import '../scss/page.scss';
import '../scss/form/form.scss';


export class App extends Component {
    render() {
        return (
            <div>
                <header>
                    <nav>
                    </nav>

                    <div className="title container">
                        <h1>Создать резюме на работу</h1>
                    </div>
                </header>

                <section className={"form-page container"}>
                    <form action="">
                        <div className="box-infos">
                            <div className="box-infos__left">
                                <label className="field">
                                    <input type="text" placeholder="Фамилия"/>
                                    <span className={"field__placeholder"}>Фамилия</span>
                                </label>
                                <label className="field">
                                    <input type="text" placeholder="Имя"/>
                                    <span className={"field__placeholder"}>Имя</span>
                                </label>
                                <label className="field">
                                    <input type="text" placeholder="Отчество"/>
                                    <span className={"field__placeholder"}>Отчество</span>
                                </label>
                            </div>
                            <div className="box-infos__right">
                                <label className="field">
                                    <input tabIndex="-1" type="file" accept="image/jpeg,image/png" spellCheck="false"/>
                                </label>
                            </div>
                        </div>
                    </form>
                </section>
            </div>
        );
    }
}

export default App;

ReactDOM.render(<App />, document.querySelector("#app"));